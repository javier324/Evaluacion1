package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Entidad.Estudiante;


public class MainActivity extends AppCompatActivity {

    Button btnEstudiante, btnLista, btnDatos;
    public static List<Estudiante> listaEstudiante;
    public static int corr=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEstudiante = new ArrayList<>();

        this.btnEstudiante = findViewById(R.id.btnEstudiante);
        this.btnDatos = findViewById(R.id.btnDatos);
        this.btnLista = findViewById(R.id.btnLista);

        btnEstudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarEstudiante();
            }
        });
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarLista();
            }
        });
        btnDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarDatos();
            }
        });
    }

    private void MostrarDatos() {
        Intent in = new Intent(this, MisDatos.class);
        startActivity(in);
    }

    private void MostrarLista() {
        Intent in = new Intent(this, ListaEstudiante.class);
        startActivity(in);
    }

    private void MostrarEstudiante() {
        Intent in = new Intent(this, NuevoEstudiante.class);
        startActivity(in);
    }


}
