package com.cursojava.models;

/**
 * Interfaz que implementa el uso de un inventario.
 */
public interface Inventario {
    public void verInventario();
    public void modificarInventario();
    public void incluirEnInventario(Objeto objeto);
}
