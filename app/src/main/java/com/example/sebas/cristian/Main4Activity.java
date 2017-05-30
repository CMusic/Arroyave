package com.example.sebas.cristian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main4Activity extends AppCompatActivity {

    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        webView2 = (WebView)findViewById(R.id.correos);
        webView2.loadUrl("https://accounts.google.com/signin/v2/identifier?continue=http%3A%2F%2Fmail.google.com%2Fa%2Funiremington.edu.co%2F&ltmpl=default&service=mail&sacu=1&hd=uniremington.edu.co&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    }
}
