package com.edp.ProyectoFinalJava.moduls;

public class Ropa extends Producto {
    private String talla;
    int id;

    public Ropa(String nombre, double precioBase,int id, String marca, String img) {
        super(nombre, precioBase,id);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }


    @Override
    public double calcularPrecio() {

        return super.calcularPrecio();
    }
}