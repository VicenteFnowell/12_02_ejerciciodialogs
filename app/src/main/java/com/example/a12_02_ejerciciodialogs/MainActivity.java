package com.example.a12_02_ejerciciodialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etNombre,etSeleccion;
    Spinner spinneranos;
    ListView lvestudios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Identificar vistas

        etNombre = (EditText)findViewById(R.id.etnombre);
        etSeleccion = (EditText)findViewById(R.id.etseleccion);
        spinneranos= (Spinner)findViewById(R.id.spanos);
        lvestudios= (ListView)findViewById(R.id.listaestudios);


        //Rellenar Spinner

        String [] seleccionanos={"Selecciona", "1990", "1991", "1992", "1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
                                    "2011","2012","2013","2014","2015","2016","2017","2018"};
        ArrayAdapter<String> adaptadoranos = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,seleccionanos);
        spinneranos.setAdapter(adaptadoranos);

        //Rellenar Listview
        String[] estudios = {"E.S.O.", "Bachillerato", "Grado Medio", "Grado Superior", "Licenciatura/Grado", "Máster"};
        ArrayAdapter<String> adaptadorestudios=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, estudios);
        lvestudios.setAdapter(adaptadorestudios);










    }//Fin OnCreate






}//Fin MainActivity
