package com.edp.ProyectoFinalJava.moduls;

public class Electronico extends Producto{
    private String marca;
    private String img;
    public Electronico(String nombre, double precioBase,int id, String marca, String img) {
        super(nombre, precioBase,id);
        this.marca = marca;
        this.img = img;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}