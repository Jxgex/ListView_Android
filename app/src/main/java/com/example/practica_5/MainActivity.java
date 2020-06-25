package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView Items;
    private ArrayList<Imagenes> arraycuadros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arraycuadros = GetArryItems();
        Items = findViewById(R.id.listview);
        final Adaptador adapter= new Adaptador(getApplicationContext(),arraycuadros);
        Items.setAdapter(adapter);
        Items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent cambio_de_Pantalla = new Intent(getApplicationContext(),Cuadros.class);
                cambio_de_Pantalla.putExtra("objeto",arraycuadros.get(i));
                startActivity(cambio_de_Pantalla);

            }
        });
    }
    private ArrayList<Imagenes> GetArryItems(){
        ArrayList<Imagenes> lista = new ArrayList<>();
        lista.add(new Imagenes(R.drawable.img1,"El hombre en llamas","José Clemente Orozco","1939","Pintada en concreto del Hospicio Cabañas de Guadalajara"));
        lista.add(new Imagenes(R.drawable.img2,"Sueño y presentimiento","María Izquierdo","1944","Oleo sobre tela"));
        lista.add(new Imagenes(R.drawable.img3,"Desnudo de alcatraces","Diego Rivera","1944","Realismo mexicano, óleo sobre masonita"));
        lista.add(new Imagenes(R.drawable.img4,"El hombre controlador del universo","Diego Rivera","1934","Fresco sobre bastidor metálico transportable, para el Rockefeller Center pero repintado para el Palacio de Bellas Artes en la Ciudad de México"));
        lista.add(new Imagenes(R.drawable.img5,"La ciencia Inútil","Remedios Varos","1955","la pintura se está burlando de las pretensiones de la ciencia mientras señala el error que supone el considerar la alquimia como una ociosa manipulación de aparatos."));
        lista.add(new Imagenes(R.drawable.img6,"Nacer de nuevo","Remedios Varos","1960","Varias obras de Remedios Varo, entre ellas Nacer de Nuevo, fueron la base del icónico video “Bedtime Story” de Maddona."));
        lista.add(new Imagenes(R.drawable.img7,"Papila estelar","Remedios Varos","1958","Sus dimensiones son 91 x 60 centímetros, y se encuentra en el Museo Soumaya de la Ciudad de México."));
        lista.add(new Imagenes(R.drawable.img8,"Simpatía","Remedios Varos","1955","Surrealismo"));
        return lista;
    }

}
