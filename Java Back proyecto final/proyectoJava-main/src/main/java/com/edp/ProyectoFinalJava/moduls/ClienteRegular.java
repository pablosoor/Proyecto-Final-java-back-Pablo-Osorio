package com.edp.ProyectoFinalJava.moduls;

public class ClienteRegular implements Cliente {
    private CarritoCompra carrito;

    public ClienteRegular(String anonimo) {
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