package com.example.sebas.cristian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    Spinner primero;
    Spinner segundo;
    Spinner tercero;
    Spinner cuarto;
    Spinner quinto;
    Spinner sexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //cat
        primero = (Spinner)findViewById(R.id.uno);

        List listaUno = new ArrayList();
        listaUno.add("CAT MANIZALES");


        ArrayAdapter cat = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,listaUno);
        cat.setDropDownViewResource(android.R.layout.simple_spinner_item);
        primero.setAdapter(cat);
        primero.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //as
        segundo = (Spinner)findViewById(R.id.dos);

        List listaDos = new ArrayList();
        listaDos.add("Uniremington");
        listaDos.add("Mision Vision");
        listaDos.add("Valores Institucionales");
        listaDos.add("Lineamientos Académicos");
        listaDos.add("Calendario Académico");
        listaDos.add("Reglamneto Estudiantil");
        listaDos.add("Directorio Administrativo");
        listaDos.add("¿Dónde estamos?");

        ArrayAdapter as = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,listaDos);
        as.setDropDownViewResource(android.R.layout.simple_spinner_item);
        segundo.setAdapter(as);
        segundo.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        //on
    }
    //pr
}
