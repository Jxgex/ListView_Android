package com.example.practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Cuadros extends AppCompatActivity {
    ImageView Cuadro;
    TextView Nombre,autor,fecha,descripcion;
    private  Imagenes obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadros);
        obj = (Imagenes)getIntent().getSerializableExtra("objeto");
        Cuadro = findViewById(R.id.ImgCuadro);
        Nombre = findViewById(R.id.TxtNombrePintura);
        autor = findViewById(R.id.TxtAutorPintura);
        fecha = findViewById(R.id.TxtFechaPintura);
        descripcion = findViewById(R.id.TxtDescipcionPintura);
        Cuadro.setImageResource(obj.getImgFoto());
        Nombre.setText(obj.getNombre());
        autor.setText(obj.getAutor());
        fecha.setText(obj.getFecha());
        descripcion.setText(obj.getResumen());
    }
}
