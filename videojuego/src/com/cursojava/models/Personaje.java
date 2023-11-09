package com.cursojava.models;

public abstract class Personaje {
    private String nombre;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int nivel;

    /**
     * Constructor de la clase
     * @param nombre el nombre del personaje
     */
    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    /**
     * En esta función, las clases que extiendan la clase deben definir las estadisticas
     */
    public void iniciarStats(){

    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
