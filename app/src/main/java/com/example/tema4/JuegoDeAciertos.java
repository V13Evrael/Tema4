package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class JuegoDeAciertos extends AppCompatActivity {

    Integer indChosenCountry = -1;
    Integer indChosenCity = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        getSupportActionBar().hide();

        final ListView listaPaises = findViewById(R.id.listaPaises);
        final ListView listaCiudades = findViewById(R.id.listaCiudades);

        final TextView txtPais = findViewById(R.id.txtPais);
        final TextView txtCiudad = findViewById(R.id.txtCiudad);

        listaPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                txtPais.setText(listaPaises.getItemAtPosition(position).toString());
                indChosenCountry = position;

            }
        });

        listaCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                txtCiudad.setText(listaCiudades.getItemAtPosition(position).toString());
                indChosenCity = position;
            }
        });
    }

    public void checkPair(View v){

        TextView txtPais = findViewById(R.id.txtPais);
        TextView txtCiudad = findViewById(R.id.txtCiudad);

        Integer [] aciertos = {4, 7, 9, 5, 8, 6, 0, 3, 2, 1};

        if(!txtPais.getText().toString().equals(getString(R.string.paises)) & !txtCiudad.getText().toString().equals(getString(R.string.ciudades))){
            ImageView img = findViewById(R.id.imgAcierto);

            if (this.indChosenCity == aciertos[this.indChosenCountry]){

                img.setImageDrawable(getDrawable(R.drawable.verde));
            }
            else {

                img.setImageDrawable(getDrawable(R.drawable.rojo));
            }
        }
    }

}
