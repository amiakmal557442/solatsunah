package com.akmal.solatsunah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Tahajud, Witir, Rawatir, Dhuha, Istikhoroh, Tayyatul_masjid, Syuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tahajud = findViewById(R.id.tahajjud);
        Witir = findViewById(R.id.witir);
        Rawatir = findViewById(R.id.rawatib);
        Dhuha = findViewById(R.id.duha);
        Istikhoroh = findViewById(R.id.istikharah);
        Tayyatul_masjid = findViewById(R.id.tahiatul);
        Syuruq = findViewById(R.id.syuruq);

        Tahajud.setOnClickListener(this);
        Witir.setOnClickListener(this);
        Rawatir.setOnClickListener(this);
        Dhuha.setOnClickListener(this);
        Istikhoroh.setOnClickListener(this);
        Tayyatul_masjid.setOnClickListener(this);
        Syuruq.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tahajjud:
                Intent Tahajud = new Intent(MainActivity.this, deskripsi.class);
                Tahajud.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.rawatib:
                Intent Witir = new Intent(MainActivity.this, deskripsi.class);
                Witir.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.tahiatul:
                Intent Rawatir = new Intent(MainActivity.this, deskripsi.class);
                Rawatir.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.duha:
                Intent Dhuha = new Intent(MainActivity.this, deskripsi.class);
                Dhuha.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.istikharah:
                Intent Istikhoroh = new Intent(MainActivity.this, deskripsi.class);
                Istikhoroh.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");

            case R.id.witir:
                Intent Tayyatul_masjid = new Intent(MainActivity.this, deskripsi.class);
                Tayyatul_masjid.putExtra("sunnah", "https://www.wisatanabawi.com/shalat-tahajud/");
        }
    }
}



