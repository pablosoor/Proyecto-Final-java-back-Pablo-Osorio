package com.edp.ProyectoFinalJava.moduls;

public class Comestible extends Producto implements Vendible {
    private String descripcion;
    private String img;

    public Comestible(String nombre, double precioBase, int id, String descripcion, String img) {
        super(nombre, precioBase, id);
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public double calcularPrecio() {

        return getPrecioBase();
    }
}


