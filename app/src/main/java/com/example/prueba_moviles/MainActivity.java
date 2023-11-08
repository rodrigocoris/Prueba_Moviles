package com.example.prueba_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Dentro de la clase ActivityA
    public void irAActivityB(View view) {
        Intent intent = new Intent(this, MenuLateralActivity.class);
        startActivity(intent);
    }

}