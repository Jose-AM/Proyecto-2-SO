/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author smoreno
 */
public class Personaje {

    private String nombre;
    private String id;
    private String imagen;
    private int agilidad;
    private int fuerza;
    private int inteligencia;
    private int contador;
    private int naturaleza;

    public Personaje(String nombre, String id, String imagen, int agilidad, int fuerza, int inteligencia, int contador) {
        this.nombre = nombre;
        this.id = id;
        this.imagen = imagen;
        this.agilidad = agilidad;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.contador = contador;

        if (this.agilidad <= this.fuerza && this.agilidad <= this.inteligencia) {
            this.naturaleza = 1;
        } else if (this.fuerza <= this.agilidad && this.fuerza <= this.inteligencia) {
            this.naturaleza = 2;
        } else if (this.inteligencia <= this.agilidad && this.inteligencia <= this.fuerza) {
            this.naturaleza = 3;
        } else {
            this.naturaleza = 2;
        }
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(int naturaleza) {
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

}
