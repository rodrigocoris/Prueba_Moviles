package com.example.prueba_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView registrarCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarCuenta = findViewById(R.id.jlbNewAccount);


        registrarCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_register.class);
                startActivity(intent);
            }
        });
    }

    //Metodo para pasar de una Activity a otra
    public void PasarActivity(View view) {
        Intent intent = new Intent(this, MenuLateralActivity.class);
        startActivity(intent);
    }


}

