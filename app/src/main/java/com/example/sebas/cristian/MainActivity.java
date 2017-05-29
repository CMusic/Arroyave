package com.example.sebas.cristian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String Us;
    String cont;

    ToggleButton ingre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingre = (ToggleButton)findViewById(R.id.toggleButton);
        ingre.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Us = ((EditText) findViewById(R.id.editText)).getText().toString();
        cont = ((EditText) findViewById(R.id.editText2)).getText().toString();

        if (Us.equals("cristian") && cont.equals("cristian"))
        {
            Intent uno = new Intent (this, Main2Activity.class);
            startActivity(uno);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"incorrecto",Toast.LENGTH_SHORT).show();
            return;
        }

    }
}
