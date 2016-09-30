package com.example.alumnedam.calculadoradpi.controllers;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumnedam.calculadoradpi.R;
import com.example.alumnedam.calculadoradpi.model.Pantalla;
import com.example.alumnedam.calculadoradpi.utils.MyUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        Button btnCalcular =(Button) findViewById(R.id.btnCalcular);
        //btnCalcular.setOnClickListener(this);
       /* WindowsManager manager = (WindowsManager) getSystemService(Context.WINDOW_SERVICE);
       Display display = manager.getDefaultDisplay();
       if (display.getRotation() == Surface.ROTATION_0 || display.getRotation() == Surface.ROTATION_180) {
            Toast.makeText(this, "cargarVertical", Toast.LENGTH_SHORT).show();
            Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
            btnCalcular.setOnClickListener(this);
        } else {
            //Toast.makeText(this."cargaHorizontal", Toast.LENGTH_SHORT).show();
        */}




    public void onClick(View v) {
        EditText etResHorizontal = (EditText) findViewById(R.id.editText2);
        EditText etResVertical = (EditText) findViewById(R.id.editText);
        EditText etDiagonal = (EditText) findViewById(R.id.editText3);

        if (!MyUtils.editTextIsNullOrEmpty(etResHorizontal) && !MyUtils.editTextIsNullOrEmpty(etResVertical) && !MyUtils.editTextIsNullOrEmpty(etDiagonal))
        {
            int resHorizontal = Integer.valueOf(etResHorizontal.getText().toString());
            int resVertical = Integer.valueOf(etResVertical.getText().toString());
            double resDiagonal = Integer.valueOf(etDiagonal.getText().toString());

            Pantalla pantalla = new Pantalla(resHorizontal, resVertical, resDiagonal);
            TextView tvDpi = (TextView) findViewById(R.id.textView4);
            tvDpi.setText(String.valueOf(pantalla.getDpi()) + " dpi ");
        }
        else if (MyUtils.editTextIsNullOrEmpty(etResHorizontal)) {
            Toast.makeText(this, "Falta resolución horizontal", Toast.LENGTH_SHORT).show();
            etResHorizontal.requestFocus();
        }
        if (MyUtils.editTextIsNullOrEmpty(etResVertical)) {
            Toast.makeText(this, "Falta resolución vertical", Toast.LENGTH_SHORT).show();
            etResVertical.requestFocus();
        }
        if (MyUtils.editTextIsNullOrEmpty(etDiagonal)) {
            Toast.makeText(this, "Falta diagonal", Toast.LENGTH_SHORT).show();
        }

    //private void cargarHorizontal(Display display) {
        /*
        DisplayMetrics displayMetrics= null;
        display.getMetrics(displayMetrics);
        int dpi = displayMetrics.densityDpi;
        int resVertical=displayMetrics.heihtPixels;
        int resHorizontal = displayMetrics.widthPixels;

        Pantalla pantalla = new Pantalla(dpi, resVertical, resHorizontal);

      }
*/
    }
}

