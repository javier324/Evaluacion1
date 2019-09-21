package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import static com.example.evaluacion1.MainActivity.listaEstudiante;
import Adaptador.Adaptador;

public class ListaEstudiante extends AppCompatActivity {

    ListView listaEstu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiante);

        listaEstu = findViewById(R.id.listEstudiantes);

        this.listaEstu.setAdapter(new Adaptador(this,
                R.layout.plantilla,
                listaEstudiante));
    }
}
