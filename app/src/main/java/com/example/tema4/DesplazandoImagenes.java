package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity {

    private final static int NUM_PAGS = 2;

    private ViewPager vPager;

    private PagerAdapter pagAdapt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);
        getSupportActionBar().hide();

        vPager = findViewById(R.id.vPager);
        pagAdapt = new PagerAdapterDeslizador(getSupportFragmentManager());
        vPager.setAdapter(pagAdapt);
    }

    @Override
    public void onBackPressed() {
        if (vPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            vPager.setCurrentItem(vPager.getCurrentItem() - 1);
        }
    }


    private class PagerAdapterDeslizador extends FragmentStatePagerAdapter {
        public PagerAdapterDeslizador(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0){
                return new SolFragment();
            }
            else {
                return new MoonFragment();
            }
        }

        @Override
        public int getCount() {
            return DesplazandoImagenes.NUM_PAGS;
        }
    }
}


