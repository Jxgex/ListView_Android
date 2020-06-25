package com.example.practica_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context contex;
    private ArrayList<Imagenes> listItems;

    public Adaptador(Context contex, ArrayList<Imagenes> listItems) {
        this.contex = contex;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
//Creación de ítem
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView Nombre,Autor;
        Imagenes Item = (Imagenes) getItem(i);
        view = LayoutInflater.from(contex).inflate(R.layout.listview,null);
        ImageView imgFto = view.findViewById(R.id.imgFoto);
        Nombre = view.findViewById(R.id.TxtNombre);
        Autor = view.findViewById(R.id.TxtAutor);
        imgFto.setImageResource(Item.getImgFoto());
        Nombre.setText(Item.getNombre());
        Autor.setText(Item.getAutor());
        return view;
    }
}
