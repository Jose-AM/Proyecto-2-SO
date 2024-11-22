/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smoreno
 */
public class Administrador extends Thread {

    private Semaphore mutex;
    private Personaje swProximo;
    private Personaje stProximo;
    private int rondas;
    private int duracion;
    private Cola<Personaje> colaNivel1St;
    private Cola<Personaje> colaNivel2St;
    private Cola<Personaje> colaNivel3St;
    private Cola<Personaje> colaRefuerzosSt;
    private Cola<Personaje> colaNivel1Sw;
    private Cola<Personaje> colaNivel2Sw;
    private Cola<Personaje> colaNivel3Sw;
    private Cola<Personaje> colaRefuerzosSw;
    private Cola<Personaje> colaNivelR1Sw;
    private Cola<Personaje> colaNivelR2Sw;
    private Cola<Personaje> colaNivelR3Sw;
    private Cola<Personaje> colaNivelR1St;
    private Cola<Personaje> colaNivelR2St;
    private Cola<Personaje> colaNivelR3St;
    private int contador;

//    public Administrador(Semaphore mutex, Personaje swProximo, Personaje stProximo, Cola<Personaje> colaNivel1St, Cola<Personaje> colaNivel2St, Cola<Personaje> colaNivel3St, Cola<Personaje> colaRefuerzosSt, Cola<Personaje> colaNivel1Sw, Cola<Personaje> colaNivel2Sw, Cola<Personaje> colaNivel3Sw, Cola<Personaje> colaRefuerzosSw) {
//        this.mutex = mutex;
//        this.swProximo = swProximo;
//        this.stProximo = stProximo;
//        this.colaNivel1St = colaNivel1St;
//        this.colaNivel2St = colaNivel2St;
//        this.colaNivel3St = colaNivel3St;
//        this.colaRefuerzosSt = colaRefuerzosSt;
//        this.colaNivel1Sw = colaNivel1Sw;
//        this.colaNivel2Sw = colaNivel2Sw;
//        this.colaNivel3Sw = colaNivel3Sw;
//        this.colaRefuerzosSw = colaRefuerzosSw;
//    }
    public Administrador(Semaphore mutex, Personaje swProximo, Personaje stProximo, Cola<Personaje> colaNivel1St, Cola<Personaje> colaNivel2St, Cola<Personaje> colaNivel3St, Cola<Personaje> colaRefuerzosSt, Cola<Personaje> colaNivel1Sw, Cola<Personaje> colaNivel2Sw, Cola<Personaje> colaNivel3Sw, Cola<Personaje> colaRefuerzosSw, Cola<Personaje> colaNivelR1Sw, Cola<Personaje> colaNivelR2Sw, Cola<Personaje> colaNivelR3Sw, Cola<Personaje> colaNivelR1St, Cola<Personaje> colaNivelR2St, Cola<Personaje> colaNivelR3St) {
        this.mutex = mutex;
        this.swProximo = swProximo;
        this.stProximo = stProximo;
        this.colaNivel1St = colaNivel1St;
        this.colaNivel2St = colaNivel2St;
        this.colaNivel3St = colaNivel3St;
        this.colaRefuerzosSt = colaRefuerzosSt;
        this.colaNivel1Sw = colaNivel1Sw;
        this.colaNivel2Sw = colaNivel2Sw;
        this.colaNivel3Sw = colaNivel3Sw;
        this.colaRefuerzosSw = colaRefuerzosSw;
        this.colaNivelR1Sw = colaNivelR1Sw;
        this.colaNivelR2Sw = colaNivelR2Sw;
        this.colaNivelR3Sw = colaNivelR3Sw;
        this.colaNivelR1St = colaNivelR1St;
        this.colaNivelR2St = colaNivelR2St;
        this.colaNivelR3St = colaNivelR3St;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.mutex.acquire();

                contador++;

                if (contador == 2) {
                    contador = 0;
                    agregarPersonajes();
                }

//                System.out.println("Ejecutando so");
//
//                colaNivel1Sw.printQueueName("---------Cola Sw1---------", true);
//                colaNivel2Sw.printQueueName("---------Cola Sw2---------", true);
//                colaNivel3Sw.printQueueName("---------Cola Sw3---------", true);
//                colaRefuerzosSw.printQueueName("---------Cola SwR---------", true);
//                colaNivel1St.printQueueName("---------Cola St1---------", true);
//                colaNivel2St.printQueueName("---------Cola St2---------", true);
//                colaNivel3St.printQueueName("---------Cola St3---------", true);
//                colaRefuerzosSt.printQueueName("---------Cola StR---------", true);
                if (swProximo != null && stProximo != null) {
                    this.actualizarCola();
                }

                swProximo = colaNivel1Sw.dequeue();
                stProximo = colaNivel1St.dequeue();
                System.out.println(swProximo.getNombre() + " vs " + stProximo.getNombre());
                this.mutex.release();
                Thread.sleep(duracion / 2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Procesador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void agregarPersonajes() {
        if (!colaNivelR1St.isEmpty() || colaNivelR2St.isEmpty() || colaNivelR2St.isEmpty()) {
            double agregarPersonaje = Math.floor(Math.random() * 100);
            if (agregarPersonaje >= 0 && agregarPersonaje < 79) {

                double nivel = Math.floor(Math.random() * 3);
                if (nivel == 0) {
                    if (!colaNivelR1St.isEmpty() && !colaNivelR1St.isEmpty()) {
                        colaNivel1Sw.enqueue(colaNivelR1Sw.dequeue());
                        colaNivel1St.enqueue(colaNivelR1St.dequeue());
                    }
                } else if (nivel == 1) {
                    if (!colaNivelR2St.isEmpty() && !colaNivelR2St.isEmpty()) {
                        colaNivel2Sw.enqueue(colaNivelR2Sw.dequeue());
                        colaNivel2St.enqueue(colaNivelR2St.dequeue());
                    }
                } else if (nivel == 2) {
                    if (!colaNivelR3St.isEmpty() && !colaNivelR3St.isEmpty()) {
                        colaNivel3Sw.enqueue(colaNivelR3Sw.dequeue());
                        colaNivel3St.enqueue(colaNivelR3St.dequeue());
                    }
                }

            }
        }

    }

    public void actualizarCola() {
        double saleRefuerzoSw = Math.floor(Math.random() * 100);
        if (saleRefuerzoSw >= 0 && saleRefuerzoSw < 39) {

            if (!this.colaRefuerzosSw.isEmpty()) {
                this.colaNivel1Sw.enqueue(this.colaRefuerzosSw.dequeue());
            }
        }
        double saleRefuerzoSt = Math.floor(Math.random() * 100);
        if (saleRefuerzoSt >= 0 && saleRefuerzoSt < 39) {
            if (!this.colaRefuerzosSt.isEmpty()) {
                this.colaNivel1St.enqueue(this.colaRefuerzosSt.dequeue());
            }
        }

        this.actualizarContador(colaNivel3Sw, colaNivel2Sw);
        this.actualizarContador(colaNivel2Sw, colaNivel1Sw);
        this.actualizarContador(colaNivel3St, colaNivel2St);
        this.actualizarContador(colaNivel2St, colaNivel1St);

    }

    public void actualizarContador(Cola<Personaje> inicialCola, Cola<Personaje> siguienteCola) {

        Node<Personaje> personaje = inicialCola.nodePeek();
        Node<Personaje> personajeAnterior = null;
        while (personaje.next != null) {

            personaje.data.setContador(personaje.data.getContador() + 1);
            if (personaje.data.getContador() >= 8) {
                personaje.data.setContador(0);
                siguienteCola.enqueue(personaje.data);
                if (personajeAnterior != null) {
                    personajeAnterior.next = personaje.next;
                    personajeAnterior = personaje;

                } else {
                    inicialCola.dequeue();
                    personajeAnterior = null;
                }
            } else {
                personajeAnterior = personaje;
            }
            personaje = personaje.next;
        }

    }

    public Personaje getSwProximo() {
        return swProximo;
    }

    public void setSwProximo(Personaje swProximo) {
        this.swProximo = swProximo;
    }

    public Personaje getStProximo() {
        return stProximo;
    }

    public void setStProximo(Personaje stProximo) {
        this.stProximo = stProximo;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Cola<Personaje> getColaNivel1St() {
        return colaNivel1St;
    }

    public void setColaNivel1St(Cola<Personaje> colaNivel1St) {
        this.colaNivel1St = colaNivel1St;
    }

    public Cola<Personaje> getColaNivel2St() {
        return colaNivel2St;
    }

    public void setColaNivel2St(Cola<Personaje> colaNivel2St) {
        this.colaNivel2St = colaNivel2St;
    }

    public Cola<Personaje> getColaNivel3St() {
        return colaNivel3St;
    }

    public void setColaNivel3St(Cola<Personaje> colaNivel3St) {
        this.colaNivel3St = colaNivel3St;
    }

    public Cola<Personaje> getColaRefuerzosSt() {
        return colaRefuerzosSt;
    }

    public void setColaRefuerzosSt(Cola<Personaje> colaRefuerzosSt) {
        this.colaRefuerzosSt = colaRefuerzosSt;
    }

    public Cola<Personaje> getColaNivel1Sw() {
        return colaNivel1Sw;
    }

    public void setColaNivel1Sw(Cola<Personaje> colaNivel1Sw) {
        this.colaNivel1Sw = colaNivel1Sw;
    }

    public Cola<Personaje> getColaNivel2Sw() {
        return colaNivel2Sw;
    }

    public void setColaNivel2Sw(Cola<Personaje> colaNivel2Sw) {
        this.colaNivel2Sw = colaNivel2Sw;
    }

    public Cola<Personaje> getColaNivel3Sw() {
        return colaNivel3Sw;
    }

    public void setColaNivel3Sw(Cola<Personaje> colaNivel3Sw) {
        this.colaNivel3Sw = colaNivel3Sw;
    }

    public Cola<Personaje> getColaRefuerzosSw() {
        return colaRefuerzosSw;
    }

    public void setColaRefuerzosSw(Cola<Personaje> colaRefuerzosSw) {
        this.colaRefuerzosSw = colaRefuerzosSw;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}
