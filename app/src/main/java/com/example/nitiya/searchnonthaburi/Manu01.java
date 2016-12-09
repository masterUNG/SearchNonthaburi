package com.example.nitiya.searchnonthaburi;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;

public class Manu01 extends AppCompatActivity {



    ImageButton img01,img02,img03;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manu01);

        img01 = (ImageButton) findViewById(R.id.manu001);

        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0011.class);
                startActivity(i);
            }

        });

        img02 = (ImageButton) findViewById(R.id.manu002);

        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Maps.class);
                startActivity(i);
            }

        });

        img03 = (ImageButton) findViewById(R.id.btn03_shr9);
        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Manu01.this, Manu0012.class);
                startActivity(i);
            }

        });



    }
}
