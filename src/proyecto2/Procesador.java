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
public class Procesador extends Thread {

    private Semaphore mutex;
    private Administrador so;
    private int duracion;
    private String estado = "Espera";
    private String nombreGanador;
    private Cola<Personaje> colaGanadoresSt;
    private Cola<Personaje> colaNivel1St;
    private Cola<Personaje> colaRefuerzosSt;
    private Cola<Personaje> colaGanadoresSw;
    private Cola<Personaje> colaNivel1Sw;
    private Cola<Personaje> colaRefuerzosSw;

    public Procesador(Semaphore mutex, Administrador so, int duracion, Cola<Personaje> colaGanadoresSt, Cola<Personaje> colaNivel1St, Cola<Personaje> colaRefuerzosSt, Cola<Personaje> colaGanadoresSw, Cola<Personaje> colaNivel1Sw, Cola<Personaje> colaRefuerzosSw) {
        this.mutex = mutex;
        this.so = so;
        this.duracion = duracion;
        this.colaGanadoresSt = colaGanadoresSt;
        this.colaNivel1St = colaNivel1St;
        this.colaRefuerzosSt = colaRefuerzosSt;
        this.colaGanadoresSw = colaGanadoresSw;
        this.colaNivel1Sw = colaNivel1Sw;
        this.colaRefuerzosSw = colaRefuerzosSw;
    }

    @Override
    public void run() {
        while (true) {
            try {

                this.mutex.acquire();
                System.out.println("Ejecutando ia");

                this.estado = "Decidiendo";
                Thread.sleep(duracion / 2);
                double noPueden = Math.floor(Math.random() * 100);
                if (so.getSwProximo() != null || so.getStProximo() != null) {
                    if (noPueden >= 0 && noPueden < 10) {
                        this.nombreGanador = ("No pelean");
                        colaRefuerzosSw.enqueue(so.getSwProximo());
                        colaRefuerzosSt.enqueue(so.getStProximo());
                    } else {
                        Personaje ganador = this.batalla(so.getSwProximo(), so.getStProximo());
                        this.estado = "Completado";
                        this.nombreGanador = (ganador != null) ? ganador.getNombre() : "Empate";
                        if (ganador == null) {

                            this.colaNivel1Sw.enqueue(so.getSwProximo());
                            this.colaNivel1St.enqueue(so.getStProximo());
                        } else if (ganador.equals(so.getSwProximo())) {
                            this.colaGanadoresSw.enqueue(ganador);

                        } else if (ganador.equals(so.getStProximo())) {
                            this.colaGanadoresSt.enqueue(ganador);

                        }
//                        if (!colaGanadoresSw.isEmpty()) {
//                            this.colaGanadoresSw.printQueueName("----------Ganadores----------", true);
//                        }
//                        if (!colaGanadoresSt.isEmpty()) {
//                            this.colaGanadoresSt.printQueueName("----------Ganadores----------", true);
//                        }
                    }
                }
                this.so.setRondas(this.so.getRondas()+1);
                Thread.sleep(duracion / 2);
                this.nombreGanador = "";
                this.estado= "Espera";
                this.mutex.release();
                Thread.sleep(500);

//                Thread.sleep(duracion);
            } catch (InterruptedException ex) {
                Logger.getLogger(Procesador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public Personaje batalla(Personaje sw, Personaje st) {

        double puntosSw = sw.getAgilidad() + sw.getFuerza() + sw.getInteligencia();
        double puntosSt = st.getAgilidad() + st.getFuerza() + st.getInteligencia();

        if ((sw.getNaturaleza() == 1 && st.getNaturaleza() == 2) || (sw.getNaturaleza() == 2 && st.getNaturaleza() == 3) || (sw.getNaturaleza() == 3 && st.getNaturaleza() == 1)) {
            puntosSw = puntosSw * 1.5;
            System.out.println("Potenciando a " + sw.getNombre());
        } else if (sw.getNaturaleza() != st.getNaturaleza()) {
            puntosSt = puntosSt * 1.5;
            System.out.println("Potenciando a " + st.getNombre());

        }

        System.out.println(sw.getNombre() + "=" + puntosSw + " vs " + st.getNombre() + "=" + puntosSt);

        if (puntosSw > puntosSt) {
            return sw;
        } else if (puntosSw < puntosSt) {
            return st;
        } else {
            return null;
        }
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Administrador getSo() {
        return so;
    }

    public void setSo(Administrador so) {
        this.so = so;
    }

    public Cola<Personaje> getColaGanadoresSt() {
        return colaGanadoresSt;
    }

    public void setColaGanadoresSt(Cola<Personaje> colaGanadoresSt) {
        this.colaGanadoresSt = colaGanadoresSt;
    }

    public Cola<Personaje> getColaRefuerzosSt() {
        return colaRefuerzosSt;
    }

    public void setColaRefuerzosSt(Cola<Personaje> colaRefuerzosSt) {
        this.colaRefuerzosSt = colaRefuerzosSt;
    }

    public Cola<Personaje> getColaGanadoresSw() {
        return colaGanadoresSw;
    }

    public void setColaGanadoresSw(Cola<Personaje> colaGanadoresSw) {
        this.colaGanadoresSw = colaGanadoresSw;
    }

    public Cola<Personaje> getColaRefuerzosSw() {
        return colaRefuerzosSw;
    }

    public void setColaRefuerzosSw(Cola<Personaje> colaRefuerzosSw) {
        this.colaRefuerzosSw = colaRefuerzosSw;
    }

    public Cola<Personaje> getColaNivel1St() {
        return colaNivel1St;
    }

    public void setColaNivel1St(Cola<Personaje> colaNivel1St) {
        this.colaNivel1St = colaNivel1St;
    }

    public Cola<Personaje> getColaNivel1Sw() {
        return colaNivel1Sw;
    }

    public void setColaNivel1Sw(Cola<Personaje> colaNivel1Sw) {
        this.colaNivel1Sw = colaNivel1Sw;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreGanador() {
        return nombreGanador;
    }

    public void setNombreGanador(String nombreGanador) {
        this.nombreGanador = nombreGanador;
    }
    
    
    
}
