package com.example.sebas.cristian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

    Button Mo;
    Button co;
    Button qd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        primero = (Spinner)findViewById(R.id.uno);

        List listaCatManizales = new ArrayList();
        listaCatManizales.add ("CAT MANIZALES");

        ArrayAdapter noveno = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, listaCatManizales);
        noveno.setDropDownViewResource(android.R.layout.simple_spinner_item);

        primero.setAdapter(noveno);
        primero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //SPINNER ASPIRANTES

        segundo= (Spinner)findViewById(R.id.dos);

        List listaAspirantes = new ArrayList();
        listaAspirantes.add ("ASPIRANTES");
        listaAspirantes.add ("Oferta Académica");
        listaAspirantes.add ("Formas de pago");
        listaAspirantes.add ("Convenios y descuentos");
        listaAspirantes.add ("Requisitos de Inscripcion");
        listaAspirantes.add ("Homologaciones");
        listaAspirantes.add ("Tarifas Institucionales 2017");
        listaAspirantes.add ("Pre-Inscripciones");
        listaAspirantes.add ("Documentos Nuevos");

        ArrayAdapter decimo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, listaAspirantes);
        decimo.setDropDownViewResource(android.R.layout.simple_spinner_item);
        segundo.setAdapter(decimo);

        segundo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SPINNER ESTUDIANTES

        tercero = (Spinner)findViewById(R.id.tres);

        List listaEstudiantes = new ArrayList();
        listaEstudiantes.add ("ESTUDIANTES");
        listaEstudiantes.add ("Calendario Académico");
        listaEstudiantes.add ("Tarifas Institucionales 2017");
        listaEstudiantes.add ("Plataforma Moodle");
        listaEstudiantes.add ("Plataforma Q10");
        listaEstudiantes.add ("Correo Institucional");
        listaEstudiantes.add ("Recibo de  matricula");
        listaEstudiantes.add ("Homologaciones");
        listaEstudiantes.add ("Directorio Administrativo");
        listaEstudiantes.add ("Lineamientos Académicos");
        listaEstudiantes.add ("Reglamento Estudiantil");

        ArrayAdapter decimoprimero = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, listaEstudiantes);
        decimoprimero.setDropDownViewResource(android.R.layout.simple_spinner_item);
        tercero.setAdapter(decimoprimero);

        tercero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //SPINNER DOCENTES TUTORES

        cuarto =(Spinner)findViewById(R.id.cuatro);

        List listaDocentesTutores = new ArrayList();

        listaDocentesTutores.add ("DOCENTES - TUTORES");
        listaDocentesTutores.add ("Plataforma Moodle");
        listaDocentesTutores.add ("Plataforma Q10");
        listaDocentesTutores.add ("Caléndario Académico");
        listaDocentesTutores.add ("Correo Institucional");
        listaDocentesTutores.add ("Directorio Administrativo");
        listaDocentesTutores.add ("Reserva de Equipos");

        ArrayAdapter decimosegundo = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, listaDocentesTutores);
        decimosegundo.setDropDownViewResource(android.R.layout.simple_spinner_item);
        cuarto.setAdapter(decimosegundo);

        cuarto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



           quinto =(Spinner)findViewById(R.id.cinco);

           List listaEgresados = new ArrayList();
           listaEgresados.add ("EGRESADOS");
           listaEgresados.add ("Especializaciones");
          listaEgresados.add ("Correo Institucional");
          listaEgresados.add ("Directorio Administrativo");

         ArrayAdapter decimotercero = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, listaEgresados);
        decimotercero.setDropDownViewResource(android.R.layout.simple_spinner_item);
         quinto.setAdapter(decimotercero);

         quinto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
          {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

        }
           });






          sexto  =(Spinner)findViewById(R.id.sei);
             List  listaAdministrativos = new ArrayList();

        listaAdministrativos.add ("ADMINISTRATIVOS");
        listaAdministrativos.add ("Plataforma Q10");
        listaAdministrativos.add ("Correo Institucional");
         listaAdministrativos.add ("Directorio Administrativo");
          listaAdministrativos.add ("Reserva deEquipos");

            ArrayAdapter decimocuarto = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,listaAdministrativos);
        decimocuarto.setDropDownViewResource(android.R.layout.simple_spinner_item);
         sexto.setAdapter(decimocuarto);

         sexto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
         {
            @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {
          }
         });


        Mo = (Button)findViewById(R.id.mood);
        Mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unos = new  Intent (Main2Activity.this,Main3Activity.class);
                startActivity(unos);
            }
        });

        co = (Button)findViewById(R.id.correo);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doss = new  Intent (Main2Activity.this,Main4Activity.class);
                startActivity(doss);
            }
        });

        qd = (Button)findViewById(R.id.diez);
        qd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tress = new  Intent (Main2Activity.this,Main5Activity.class);
                startActivity(tress);
            }
        });



        //on
    }
    //pr
}
