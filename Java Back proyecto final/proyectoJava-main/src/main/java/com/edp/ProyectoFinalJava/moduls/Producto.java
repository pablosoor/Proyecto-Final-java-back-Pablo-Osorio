package com.edp.ProyectoFinalJava.moduls;


public abstract class Producto implements Vendible {
    private String nombre;
    private double precioBase;
    private int id;
    public Producto(String nombre, double precioBase, int id ) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }


    @Override
    public double calcularPrecio() {
        return getPrecioBase();
    }
}