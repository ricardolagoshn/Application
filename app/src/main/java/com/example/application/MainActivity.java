package com.example.application;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadPreferences();
        SavePreferences();
    }

    private void SavePreferences()
    {
        SharedPreferences claves = getSharedPreferences("INFO", Context.MODE_PRIVATE);
        String usuario = "Ricardo";
        String password = "Honduras2020hn";

        SharedPreferences.Editor editor = claves.edit();
        editor.putString("usuario", usuario);
        editor.putString("password", password);

        editor.commit();
        Toast.makeText(getApplicationContext(),"Claves", Toast.LENGTH_LONG).show();
    }

    private void LoadPreferences() {
        SharedPreferences clave = getSharedPreferences("INFO", Context.MODE_PRIVATE);
        String usuario = clave.getString("usuario", "Nombre no ha sido seteado");
        String password = clave.getString("password", "Password no ha sido seteado");

        Toast.makeText(getApplicationContext(),"Claves", Toast.LENGTH_LONG).show();


    }
}