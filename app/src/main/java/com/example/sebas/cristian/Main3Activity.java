package com.example.sebas.cristian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView1 = (WebView)findViewById(R.id.moodles);
        webView1.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
    }
}
