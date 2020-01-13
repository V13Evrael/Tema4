package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class SelectImagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_imagenes);
        getSupportActionBar().hide();

    }

    public void change2Merc(View v){

        Fragment fragMerc = new MercurioFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentPlanetas, fragMerc);
        transaction.addToBackStack(null);

        transaction.commit();

    }

    public void change2Venus(View v){

        Fragment fragVen = new VenusFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentPlanetas, fragVen);
        transaction.addToBackStack(null);

        transaction.commit();

    }

    public void change2Jupi(View v){

        Fragment fragJup = new JupiterFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentPlanetas, fragJup);
        transaction.addToBackStack(null);

        transaction.commit();

    }

    public void change2Pluto(View v){

        Fragment fragPlu = new PlutonFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentPlanetas, fragPlu);
        transaction.addToBackStack(null);

        transaction.commit();

    }
}
