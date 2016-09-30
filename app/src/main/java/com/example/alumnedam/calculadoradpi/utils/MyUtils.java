package com.example.alumnedam.calculadoradpi.utils;

import android.widget.EditText;

/**
 * Created by ALUMNEDAM on 29/09/2016.
 */
public class MyUtils {
    //calcular hipotenusa
    public static double calcularHipotenusa (double catetoA, double catetoB){
        return Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
    }

    public static boolean stringIsNullOrEmpty(String cadena){
        return (cadena == null || cadena.length()==0);
    }
    public static boolean editTextIsNullOrEmpty (EditText editText){

        return stringIsNullOrEmpty(editText.getText().toString());
    }
}
