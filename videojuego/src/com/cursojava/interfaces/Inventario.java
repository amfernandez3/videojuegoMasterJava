package com.cursojava.interfaces;

import com.cursojava.models.Objeto;

/**
 * Interfaz que implementa el uso de un inventario.
 */
public interface Inventario {
    public void verInventario();
    public void modificarInventario();
    public void incluirEnInventario(Objeto objeto);
}
