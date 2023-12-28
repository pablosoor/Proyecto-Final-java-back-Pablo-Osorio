package com.edp.ProyectoFinalJava.moduls;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Vendible> productos;

    public CarritoCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Vendible producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Vendible producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }

}