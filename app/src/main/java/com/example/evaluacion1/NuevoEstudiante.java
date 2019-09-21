package com.example.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.evaluacion1.MainActivity.listaEstudiante;
import static com.example.evaluacion1.MainActivity.corr;
import java.text.DecimalFormat;
import java.util.ArrayList;

import Entidad.Estudiante;

public class NuevoEstudiante extends AppCompatActivity {

    EditText edtNombre, edtCodigo, edtParcial, edtParcial2, edtParcial3, edtMateria;
    Button btnGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_estudiante);

        edtNombre = findViewById(R.id.edtNombre);
        edtCodigo = findViewById(R.id.edtCodigo);
        edtMateria = findViewById(R.id.edtMateria);
        edtParcial = findViewById(R.id.edtParcial1);
        edtParcial2 = findViewById(R.id.edtParcial1);
        edtParcial3 = findViewById(R.id.edtParcial3);

        this.btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNombre.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo nombre no esta lleno",Toast.LENGTH_LONG).show();
                }else if(edtCodigo.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo Codigo no esta lleno",Toast.LENGTH_LONG).show();
                }else if(edtMateria.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo Materia no esta lleno",Toast.LENGTH_LONG).show();
                }else if(edtParcial.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo Parcial 1 no esta lleno",Toast.LENGTH_LONG).show();
                }else if(edtParcial2.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo Parcial 2 no esta lleno",Toast.LENGTH_LONG).show();
                }else if(edtParcial3.getText().toString().isEmpty()){
                    Toast.makeText(NuevoEstudiante.this, "El campo Parcial 3 no esta lleno",Toast.LENGTH_LONG).show();
                }else{
                    GuardarEstudiante();
                    corr++;
                }


            }
        });
    }

    private void GuardarEstudiante() {
        Estudiante estu = new Estudiante();
        estu.SetNombre(edtNombre.getText().toString());
        estu.SetCodigo(edtCodigo.getText().toString());
        estu.SetMateria(edtMateria.getText().toString());
        Double par1 =Double.parseDouble(edtParcial.getText().toString());
        estu.SetParcial1(par1);
        Double par2 =Double.parseDouble(edtParcial2.getText().toString());
        estu.SetParcial1(par2);
        Double par3 =Double.parseDouble(edtParcial3.getText().toString());
        estu.SetParcial1(par3);

        DecimalFormat precision = new DecimalFormat("0.00");

        Double prom = ((par1*0.3)+(par2*0.3)+(par3*0.4));
        precision.format(prom);
        estu.SetPromedio(prom);
        listaEstudiante.add(estu);
            Toast.makeText(this,"Alumno Guardado", Toast.LENGTH_SHORT).show();

        finish();
    }
}
