package com.example.usuario.davidprietorecio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Usuario on 21/02/2018.
 */

public class AdaptadorList  extends BaseAdapter {

    private Context context;
    private List<Pais> lista;

    public AdaptadorList(Context context, List<Pais> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        LayoutInflater lf = LayoutInflater.from(context);
        v=lf.inflate(R.layout.componente_list,null);

        TextView tvNombreIng = (TextView)v.findViewById(R.id.tvPaisIngles);
        TextView tvNombreCas = (TextView)v.findViewById(R.id.tvPaisCas);
        TextView tvClave = (TextView)v.findViewById(R.id.tvClave);
        TextView tvCapital = (TextView)v.findViewById(R.id.tvCapital);
        TextView tvContinente = (TextView)v.findViewById(R.id.tvContinente);
        TextView tvPoblacion = (TextView)v.findViewById(R.id.tvPoblacion);
        TextView tvLatitud = (TextView)v.findViewById(R.id.tvLatitud);
        TextView tvLongitud = (TextView)v.findViewById(R.id.tvLongitud);
        TextView tvPaisesFront = (TextView)v.findViewById(R.id.tvPaisesFron);

        tvNombreIng.setText(lista.get(i).getNombreInges());
        tvNombreCas.setText(lista.get(i).getNombreCastellano());
        tvClave.setText("Clave: "+lista.get(i).getClave());
        tvCapital.setText("Capital: "+lista.get(i).getCapital());
        tvContinente.setText("Continente: "+lista.get(i).getContinente());
        tvPoblacion.setText("Poblacion: "+lista.get(i).getPoblacion());
        tvLatitud.setText("Latitud: "+lista.get(i).getLatitud());
        tvLongitud.setText("Longitud: "+lista.get(i).getLongitud());
        tvPaisesFront.setText(lista.get(i).getPaisesFronterizos().toString());

        return v;
    }
}
