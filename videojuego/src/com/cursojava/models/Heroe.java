package com.cursojava.models;

import com.cursojava.interfaces.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Heroe extends Personaje implements Inventario {
    private List<Objeto> inventario;

    private static final int TAMANHO_INVENTARIO = 10;
    private int monedas;
    private int experienciaActual, experienciaNecesaria;

    private static int numeroVictorias = 0;

    /**
     * Constructor de la clase
     *
     * @param nombre el nombre del personaje
     */
    public Heroe(String nombre) {
        super(nombre);
        this.monedas = 20;
        this.inventario = new ArrayList<>();
        this.experienciaActual = 0;
        this.experienciaNecesaria = 100;
        iniciarStats();
    }

    /**
     * Función que gestiona los stats del personaje
     * @see Personaje
     */
    @Override
    public void iniciarStats() {
        super.iniciarStats();
        this.setVitalidad(100);
        this.setAtaque(10);
        this.setDefensa(3);
        this.setNivel(1);
    }


    //**************************** Funciones que controlan el inventario
    @Override
    public void verInventario() {

    }

    @Override
    public void modificarInventario() {

    }

    @Override
    public void incluirEnInventario(Objeto objeto) {
        this.inventario.add(objeto);
    }

    //*******************Funciones que controlan la experiencia y niveles****

    /**
     * Función que aumenta la experiencia
     * @param experienciaGanada defina la experiencia que ganará el jugador
     */
    public void aumentarExperiencia(int experienciaGanada){
        this.experienciaActual += experienciaGanada;
        if(experienciaActual >= this.experienciaNecesaria){
            subirNivelHeroe();
        }
    }

    //*********************Función que controla la batalla

    /**
     * Función principal de control de la batalla
     * @param enemigo indica el enemigo sobre el que se realizará la acción
     */
    public void realizarBatalla(Enemigo enemigo){
        System.out.println("Se va a iniciar una batalla entre: " + this.getNombre() + " y "+ enemigo.getNombre());
        int turno = 0;
        while(enemigo.getVitalidad()>0 && this.getVitalidad()>0){
            System.out.println("-------------Ronda numero: " + turno);
            if(turno % 2 == 0){
                System.out.println("Al enemigo le quedan " + enemigo.getVitalidad() + " pv.");
                enemigo.setVitalidad(enemigo.getVitalidad()- recibirDanho(enemigo));
            }
            else {
                this.setVitalidad(this.getVitalidad()- realizarDanho(enemigo));
                System.out.println("Te quedan " + this.getVitalidad() + " pv.");
            }
            turno += 1;
        }

        //Mensaje de batalla finalizada
        if(enemigo.getVitalidad()<= 0){
            System.out.println("Has ganado la batalla!, ganas: " + enemigo.getExperienciaAportada() + " puntos de experiencia");
            this.aumentarExperiencia(enemigo.getExperienciaAportada());
            numeroVictorias++;
            System.out.println("********************************************");
            System.out.println("En total han muerto: " + numeroVictorias + " enemigos.");
            System.out.println("Experiencia: " +experienciaActual+ "/"+experienciaNecesaria);
            System.out.println("********************************************");
        }
        else{
            System.out.println("Has perdido la batalla...");

        }
    }

    /**
     * Metodo que calcula el daño hecho por el enemigo
     * @param enemigo enemigo objeto de la acción
     * @return devuelve el daño
     */
    private int realizarDanho(Enemigo enemigo) {
        int danho;
        if(enemigo.getAtaque() > this.getDefensa()){
            danho = enemigo.getAtaque() - this.getDefensa();
        }
        else {
            danho = 1;
        }
        System.out.println("El enemigo ha realizado: " + danho + " puntos de daño!");
        return danho;
    }

    /**
     * Método que calcula el daño recibido por el enemigo
     * @param enemigo enemigo que recibe el daño
     * @return devuelve el daño recibido
     */
    private int recibirDanho(Enemigo enemigo) {
        int danho;
        if(this.getAtaque() > enemigo.getDefensa()){
            danho = this.getAtaque() - enemigo.getDefensa();
        }
        else {
            danho = 1;
        }
        System.out.println("El enemigo ha recibido: " + danho + " puntos de daño!");


        return danho;
    }


    /**
     * Permite al heroe subir de nivel y mejorar sus atributos
     */
    public void subirNivelHeroe(){
        this.setVitalidad(this.getVitalidad()+20);
        this.setAtaque(this.getAtaque()+2);
        this.setDefensa(this.getDefensa()+1);
        this.setNivel(this.getNivel()+1);
        System.out.println("El héroe a subido de nivel! nuevo nivel: " + this.getNivel());
        actualizarExperienciaNecesaria();
    }

    public void actualizarExperienciaNecesaria(){
        this.experienciaNecesaria += 30 * this.getNivel();
    }

    @Override
    public String toString() {
        return "Información del Heroe{" +
                "inventario=" + inventario +
                ", monedas=" + monedas +
                ", experienciaActual=" + experienciaActual +
                ", experienciaNecesaria=" + experienciaNecesaria +
                '}';
    }

    public void saludo(){
        System.out.println("Saludo");
    }
}
