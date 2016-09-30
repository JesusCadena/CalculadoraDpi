package com.example.alumnedam.calculadoradpi.model;

import com.example.alumnedam.calculadoradpi.utils.MyUtils;

/**
 * Created by ALUMNEDAM on 29/09/2016.
 */
public class Pantalla {
    private int resolucionVertical;
    private int resolucionHorizontal;
    private double diagonal;
    private int dpi;

    public Pantalla(int resolucionVertical, int resolucionHorizontal, double diagonal) {
        this.resolucionVertical = resolucionVertical;
        this.resolucionHorizontal = resolucionHorizontal;
        this.diagonal = diagonal;
        //calcular
        //this.dpi=Math.sqrt( resolucionHorizontal * resolucionHorizontal + resolucionVertical * resolucionVertical) / diagonal;

    }
    public int getResolucionVertical() {
        return resolucionVertical;
    }public void setResolucionVertical(int resolucionVertical) {
        this.resolucionVertical = resolucionVertical;
    }public int getResolucionHorizontal() {
        return resolucionHorizontal;
    }public void setResolucionHorizontal(int resolucionHorizontal) {
        this.resolucionHorizontal = resolucionHorizontal;
    }public double getDiagonal() {
        return diagonal;
    }public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }public int getDpi() {
        return dpi;
    }public void setDpi(int dpi) {
        this.dpi = dpi;
    }
     private int calcularDpi(){
         int dpi=(int)(MyUtils.calcularHipotenusa(resolucionHorizontal,resolucionVertical) /diagonal);
         return dpi;
     }
}
