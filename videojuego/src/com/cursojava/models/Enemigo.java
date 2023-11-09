package com.cursojava.models;

public class Enemigo extends Personaje{
    private Objeto recompensa;

    private final int EXPERIENCIA_APORTADA = 20;
    /**
     * Constructor de la clase
     *
     * @param nombre el nombre del personaje
     */
    public Enemigo(String nombre) {
        super(nombre);
        iniciarStats();
    }

    /**
     * Función que define la recompensa cuando el enemigo es derrotado
     */
    private void definirRecompensa(){
        this.recompensa = new Objeto("Oro", "20 monedas de oro");
    }

    /**
     * Función que gestiona los stats del personaje
     * @see Personaje
     */
    @Override
    public void iniciarStats() {
        super.iniciarStats();
        this.setVitalidad(50);
        this.setAtaque(5);
        this.setDefensa(2);
        this.setNivel(1);
    }

    public Objeto getRecompensa() {
        return recompensa;
    }

    public int getExperienciaAportada() {
        return EXPERIENCIA_APORTADA;
    }


    @Override
    public String toString() {
        return "Información del enemigo{" +
                "recompensa=" + recompensa +
                ", experienciaAportada=" + EXPERIENCIA_APORTADA +
                '}';
    }
}
