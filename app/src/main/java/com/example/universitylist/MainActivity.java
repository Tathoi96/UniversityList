package com.example.universitylist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnPublic=findViewById(R.id.btn_public);
        Button btnPrivate=findViewById(R.id.btn_private);

        btnPublic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university=new Intent(MainActivity.this,AnotherActivity1.class);
                startActivity(university);


                //Intent university1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.cuet.ac.bd"));
               // startActivity(university1);
               // Toast.makeText(MainActivity.this, "CUET", Toast.LENGTH_SHORT).show();
            }
        });






        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent university=new Intent(MainActivity.this,AnotherActivity2.class);
               startActivity(university);

                //Intent university1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iiuc.ac.bd"));
               // startActivity(university1);

                //Toast.makeText(MainActivity.this, "IIUC", Toast.LENGTH_SHORT).show();

            }
        });


    }
}