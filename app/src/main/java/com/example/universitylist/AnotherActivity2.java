package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);
        Button btnIiuc=findViewById(R.id.btn_iiuc);
        Button btnPuc=findViewById(R.id.btn_puc);

        btnIiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiuc.ac.bd"));
                startActivity(university1);

            }
        });

        btnPuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.puc.ac.bd"));
                startActivity(university1);

            }
        });

    }
}