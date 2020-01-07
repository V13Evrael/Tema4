package com.example.tema4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_numbers);
        getSupportActionBar().hide();
    }

    public static boolean checkPrime(int n) {

        boolean primo = true;
        int actual = 2;

        while (primo & actual != n) {
            if (n % actual == 0) {
                primo = false;
            }
            actual++;
        }
        return primo;
    }

    public void getPrimeResult(View v) {
        final EditText num = findViewById(R.id.txtInsert);
        TextView result = findViewById(R.id.txtResultado);

        if (!num.getText().toString().isEmpty()) {
            int numero = Integer.parseInt(num.getText().toString());
            boolean esPrimo = checkPrime(numero);
            if (esPrimo) {
                String phraseResult = getString(R.string.theNumber) + " " + numero + " " + getString(R.string.isPrime);
                result.setText(phraseResult);
            } else {
                String phraseResult = getString(R.string.theNumber) + " " + numero + " " + getString(R.string.noPrime);
                result.setText(phraseResult);
            }
        }
    }
}
