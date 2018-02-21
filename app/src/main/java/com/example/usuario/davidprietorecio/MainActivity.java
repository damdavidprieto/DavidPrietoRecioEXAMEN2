package com.example.usuario.davidprietorecio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.maps.GoogleMap;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String URL="http://192.168.31.44/paises/paises.json";

    private ListView listView;
    private ArrayList<Pais> listaPaises;
    private AdaptadorList adaptador;

    private GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.listView);
        listaPaises=new ArrayList<Pais>();
        RequestQueue request = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for(int i=0; i<response.length(); i++){
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        String nombreIngles = jsonObject.getString("name");
                        String clave=jsonObject.getString("alpha2Code");
                        String capital=jsonObject.getString("capital");
                        String continente=jsonObject.getString("region");
                        String Poblacion=jsonObject.getString("population");
                        String latitud="",longitud="",paisesFronterizos="",nombreCastellano="";
                        JSONArray jsonArrayLatLn=jsonObject.getJSONArray("latlng");
                        if(jsonArrayLatLn.length()!=0){
                            latitud=jsonArrayLatLn.getString(0);
                            longitud=jsonArrayLatLn.getString(1);
                        }
                        JSONArray jsonArrayFronteras=jsonObject.getJSONArray("borders");
                        int cont=0;
                        if(jsonArrayFronteras.length()!=0){
                            paisesFronterizos+=" / "+jsonArrayFronteras.getString(cont);
                            cont++;
                        }
                        JSONArray jsonArrayNombreCastellano=jsonObject.getJSONArray("borders");
                        if(jsonArrayNombreCastellano.length()!=0){
                            nombreCastellano+=jsonArrayNombreCastellano.getString(1);
                        }
                        Pais p=new Pais(nombreIngles,nombreCastellano,clave,capital,continente,Poblacion,latitud,longitud,paisesFronterizos);
                        listaPaises.add(p);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }//FIN DEL BUCLE
                adaptador=new AdaptadorList(getApplicationContext(),listaPaises);
                listView.setAdapter(adaptador);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }

}
