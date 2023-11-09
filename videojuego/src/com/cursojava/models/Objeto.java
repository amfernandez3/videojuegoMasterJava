package com.cursojava.models;

import java.util.Random;

public class Objeto {
    private String nombreObjeto;
    private String efecto;
    private int valorObjeto;

    /**
     * Constructor que genera los objetos con sus propiedades
     * @param nombreObjeto nombre del objeto
     * @param efecto efecto del objeto
     */
    public Objeto(String nombreObjeto, String efecto) {
        this.nombreObjeto = nombreObjeto;
        this.efecto = efecto;
        this.valorObjeto = definirValorObjeto();
    }

    /**
     * Metodo que define un valor que asignar a un objeto
     * @return devuelve el valor
     */
    private int definirValorObjeto(){
        Random random = new Random();
        int aux = random.nextInt(30) + 1;
        return aux;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public String getEfecto() {
        return efecto;
    }

    public int getValorObjeto() {
        return valorObjeto;
    }
}
