package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another1);

        Button btnCuet=findViewById(R.id.btn_cuet);
        Button btnCu=findViewById(R.id.btn_cu);

        btnCuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cuet.ac.bd"));
                startActivity(university1);

            }
        });

        btnCu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university1=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cu.ac.bd"));
                startActivity(university1);

            }
        });


    }
}