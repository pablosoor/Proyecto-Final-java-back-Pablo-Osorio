package com.edp.ProyectoFinalJava.moduls;

public class ClientePremium implements Cliente {
    private CarritoCompra carrito;

    public ClientePremium() {
        this.carrito = new CarritoCompra();
    }

    @Override
    public void realizarCompra(Vendible producto) {


        carrito.agregarProducto(producto);
    }

    public double verTotal() {
        return carrito.calcularTotal();
    }

}