package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void openPrimeNumbers(View v){

        Intent intent = new Intent(this, PrimeNumbers.class);
        startActivity(intent);
    }

    public void openHitGame(View v){

        Intent intent = new Intent(this, JuegoDeAciertos.class);
        startActivity(intent);
    }

    public void openSlideImages(View v){

        Intent intent = new Intent(this, DesplazandoImagenes.class);
        startActivity(intent);
    }
}
