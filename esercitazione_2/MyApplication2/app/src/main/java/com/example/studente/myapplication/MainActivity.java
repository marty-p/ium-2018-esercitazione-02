package com.example.studente.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {

    EditText textNome, textCognome, textData;
    Button btnSalva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNome = this.findViewById(R.id.attrNome);
        textCognome = this.findViewById(R.id.attrCognome);
        textData = this.findViewById(R.id.attrData);
        btnSalva = this.findViewById(R.id.btnSalva);
        btnSalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showResults = new Intent(MainActivity.this, FormResultActivity.class);
                startActivity(showResults);
            }
        });
    }
}
