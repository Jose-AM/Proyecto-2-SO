/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import java.util.concurrent.Semaphore;

/**
 *
 * @author smoreno
 */
public class Proyecto2 {

    public static void main(String[] args) {

        int duracion = 5000;
        Semaphore mutex = new Semaphore(1);
        Cola<Personaje> Cola1Sw = new Cola<>();
        Cola<Personaje> ColaGanadoresSw = new Cola<>();
        Cola<Personaje> Cola2Sw = new Cola<>();
        Cola<Personaje> Cola3Sw = new Cola<>();
        Cola<Personaje> Cola1RSw = new Cola<>();
        Cola<Personaje> Cola2RSw = new Cola<>();
        Cola<Personaje> Cola3RSw = new Cola<>();
        Cola<Personaje> ColaRefuerzosSw = new Cola<>();
        Cola<Personaje> ColaGanadoresSt = new Cola<>();
        Cola<Personaje> Cola1St = new Cola<>();
        Cola<Personaje> Cola2St = new Cola<>();
        Cola<Personaje> Cola3St = new Cola<>();
        Cola<Personaje> Cola1RSt = new Cola<>();
        Cola<Personaje> Cola2RSt = new Cola<>();
        Cola<Personaje> Cola3RSt = new Cola<>();
        Cola<Personaje> ColaRefuerzosSt = new Cola<>();

        // Creación de personajes de Star Wars Nivel 1
        Personaje sw1 = new Personaje("Luke Skywalker", "1w", "", 9, 10, 8, 0);
        Personaje sw2 = new Personaje("Anakin Skywalker", "2w", "", 9, 10, 8, 0);
        Personaje sw3 = new Personaje("Yoda", "3w", "", 8, 10, 9, 0);
        Personaje sw4 = new Personaje("Emperador Palpatine", "4w", "", 8, 10, 9, 0);
        Personaje sw5 = new Personaje("Rey", "5w", "", 8, 9, 10, 0);
        Personaje sw6 = new Personaje("Mace Windu", "6w", "", 9, 9, 8, 0);
        Personaje sw7 = new Personaje("Kylo Ren", "7w", "", 9, 8, 10, 0);
        Personaje sw8 = new Personaje("Chewbacca", "8w", "", 8, 9, 10, 0);
        Personaje sw9 = new Personaje("Darth Maul", "9w", "", 9, 8, 10, 0);
        Personaje sw10 = new Personaje("Snoke", "10w", "", 8, 9, 10, 0);

// Creación de personajes de Star Wars Nivel 2
        Personaje sw11 = new Personaje("Obi-Wan Kenobi", "11w", "", 8, 9, 7, 0);
        Personaje sw12 = new Personaje("Qui-Gon Jinn", "12w", "", 7, 8, 6, 0);
        Personaje sw13 = new Personaje("Boba Fett", "13w", "", 7, 8, 6, 0);
        Personaje sw14 = new Personaje("Ahsoka Tano", "14w", "", 7, 8, 6, 0);
        Personaje sw15 = new Personaje("Lando Calrissian", "15w", "", 7, 6, 8, 0);
        Personaje sw16 = new Personaje("Finn", "16w", "", 6, 8, 7, 0);
        Personaje sw17 = new Personaje("Poe Dameron", "17w", "", 8, 7, 6, 0);
        Personaje sw18 = new Personaje("Jyn Erso", "18w", "", 6, 8, 7, 0);
        Personaje sw19 = new Personaje("Cassian Andor", "19w", "", 7, 6, 8, 0);
        Personaje sw20 = new Personaje("Han Solo", "20w", "", 8, 6, 7, 0);

// Creación de personajes de Star Wars Nivel 3
        Personaje sw21 = new Personaje("Padmé Amidala", "21w", "", 7, 6, 5, 0);
        Personaje sw22 = new Personaje("Jabba el Hutt", "22w", "", 5, 7, 6, 0);
        Personaje sw23 = new Personaje("K-2SO", "23w", "", 5, 6, 7, 0);
        Personaje sw24 = new Personaje("Maz Kanata", "24w", "", 6, 5, 7, 0);
        Personaje sw25 = new Personaje("Rose Tico", "25w", "", 5, 6, 7, 0);
        Personaje sw26 = new Personaje("Grogu (Baby Yoda)", "26w", "", 6, 7, 5, 0);
        Personaje sw27 = new Personaje("General Grievous", "27w", "", 7, 6, 5, 0);
        Personaje sw28 = new Personaje("R2-D2", "28w", "", 4, 6, 5, 0);
        Personaje sw29 = new Personaje("C-3PO", "29w", "", 3, 7, 4, 0);
        Personaje sw30 = new Personaje("Leia Organa", "30w", "", 6, 5, 7, 0);

// Creación de personajes de Star Trek Nivel 1
        Personaje st1 = new Personaje("Data", "1t", "", 9, 10, 8, 0);
        Personaje st2 = new Personaje("Q", "2t", "", 8, 10, 9, 0);
        Personaje st3 = new Personaje("Worf", "3t", "", 9, 8, 10, 0);
        Personaje st4 = new Personaje("Spock", "4t", "", 8, 9, 10, 0);
        Personaje st5 = new Personaje("James T. Kirk", "5t", "", 9, 10, 8, 0);
        Personaje st6 = new Personaje("Jean-Luc Picard", "6t", "", 8, 9, 10, 0);
        Personaje st7 = new Personaje("Seven of Nine", "7t", "", 8, 10, 9, 0);
        Personaje st8 = new Personaje("Benjamin Sisko", "8t", "", 9, 8, 10, 0);
        Personaje st9 = new Personaje("Odo", "9t", "", 9, 10, 8, 0);
        Personaje st10 = new Personaje("Kathryn Janeway", "10t", "", 8, 9, 10, 0);

// Creación de personajes de Star Trek Nivel 2
        Personaje st11 = new Personaje("Tuvok", "11t", "", 7, 8, 6, 0);
        Personaje st12 = new Personaje("William Riker", "12t", "", 8, 7, 6, 0);
        Personaje st13 = new Personaje("Geordi La Forge", "13t", "", 6, 8, 7, 0);
        Personaje st14 = new Personaje("B'Elanna Torres", "14t", "", 8, 6, 7, 0);
        Personaje st15 = new Personaje("Jonathan Archer", "15t", "", 6, 8, 7, 0);
        Personaje st16 = new Personaje("Chakotay", "16t", "", 7, 6, 8, 0);
        Personaje st17 = new Personaje("Sarek", "17t", "", 7, 8, 6, 0);
        Personaje st18 = new Personaje("Gul Dukat", "18t", "", 8, 7, 6, 0);
        Personaje st19 = new Personaje("Montgomery Scott", "19t", "", 6, 8, 7, 0);
        Personaje st20 = new Personaje("T'Pol", "20t", "", 7, 6, 8, 0);

// Creación de personajes de Star Trek Nivel 3
        Personaje st21 = new Personaje("Neelix", "21t", "", 5, 7, 6, 0);
        Personaje st22 = new Personaje("Phlox", "22t", "", 6, 7, 5, 0);
        Personaje st23 = new Personaje("Leonard McCoy", "23t", "", 7, 6, 5, 0);
        Personaje st24 = new Personaje("Nyota Uhura", "24t", "", 5, 6, 7, 0);
        Personaje st25 = new Personaje("Hikaru Sulu", "25t", "", 6, 7, 5, 0);
        Personaje st26 = new Personaje("Pavel Chekov", "26t", "", 7, 5, 6, 0);
        Personaje st27 = new Personaje("Tom Paris", "27t", "", 6, 5, 7, 0);
        Personaje st28 = new Personaje("Deanna Troi", "28t", "", 5, 6, 7, 0);
        Personaje st29 = new Personaje("Beverly Crusher", "29t", "", 7, 6, 5, 0);
        Personaje st30 = new Personaje("Quark", "30t", "", 6, 5, 7, 0);

// Agregar personajes a las colas
        Cola1Sw.enqueue(sw1);
        Cola1Sw.enqueue(sw2);
        Cola1Sw.enqueue(sw3);
        Cola1Sw.enqueue(sw4);
        Cola1Sw.enqueue(sw5);
        Cola1Sw.enqueue(sw6);
        Cola1Sw.enqueue(sw7);
        Cola1Sw.enqueue(sw8);
        Cola1Sw.enqueue(sw9);
        Cola1Sw.enqueue(sw10);

        Cola2Sw.enqueue(sw11);
        Cola2Sw.enqueue(sw12);
        Cola2Sw.enqueue(sw13);
        Cola2Sw.enqueue(sw14);
        Cola2Sw.enqueue(sw15);
        Cola2Sw.enqueue(sw16);
        Cola2Sw.enqueue(sw17);
        Cola2Sw.enqueue(sw18);
        Cola2Sw.enqueue(sw19);
        Cola2Sw.enqueue(sw20);

        Cola3Sw.enqueue(sw21);
        Cola3Sw.enqueue(sw22);
        Cola3Sw.enqueue(sw23);
        Cola3Sw.enqueue(sw24);
        Cola3Sw.enqueue(sw25);
        Cola3Sw.enqueue(sw26);
        Cola3Sw.enqueue(sw27);
        Cola3Sw.enqueue(sw28);
        Cola3Sw.enqueue(sw29);
        Cola3Sw.enqueue(sw30);

        Cola1St.enqueue(st1);
        Cola1St.enqueue(st2);
        Cola1St.enqueue(st3);
        Cola1St.enqueue(st4);
        Cola1St.enqueue(st5);
        Cola1St.enqueue(st6);
        Cola1St.enqueue(st7);
        Cola1St.enqueue(st8);
        Cola1St.enqueue(st9);
        Cola1St.enqueue(st10);

        Cola2St.enqueue(st11);
        Cola2St.enqueue(st12);
        Cola2St.enqueue(st13);
        Cola2St.enqueue(st14);
        Cola2St.enqueue(st15);
        Cola2St.enqueue(st16);
        Cola2St.enqueue(st17);
        Cola2St.enqueue(st18);
        Cola2St.enqueue(st19);
        Cola2St.enqueue(st20);

        Cola3St.enqueue(st21);
        Cola3St.enqueue(st22);
        Cola3St.enqueue(st23);
        Cola3St.enqueue(st24);
        Cola3St.enqueue(st25);
        Cola3St.enqueue(st26);
        Cola3St.enqueue(st27);
        Cola3St.enqueue(st28);
        Cola3St.enqueue(st29);
        Cola3St.enqueue(st30);

        Cola.desordenarCola(Cola1Sw);
        Cola.desordenarCola(Cola2Sw);
        Cola.desordenarCola(Cola3Sw);
        Cola.desordenarCola(Cola1St);
        Cola.desordenarCola(Cola2St);
        Cola.desordenarCola(Cola3St);

        for (int i = 1; i <= 2; i++) {
            Cola1RSw.enqueue(Cola1Sw.dequeue());
            Cola1RSt.enqueue(Cola1St.dequeue());
        }

        for (int i = 1; i <= 4; i++) {
            Cola2RSw.enqueue(Cola2Sw.dequeue());
            Cola2RSt.enqueue(Cola2St.dequeue());
            Cola3RSw.enqueue(Cola3Sw.dequeue());
            Cola3RSt.enqueue(Cola3St.dequeue());
        }

        Administrador so = new Administrador(mutex, null, null, Cola1St, Cola2St, Cola3St, ColaRefuerzosSt, Cola1Sw, Cola2Sw, Cola3Sw, ColaRefuerzosSw, Cola1RSw, Cola2RSw, Cola3RSw, Cola1RSt, Cola2RSt, Cola3RSt);
        Procesador ia = new Procesador(mutex, so, duracion, ColaGanadoresSt, Cola1St, ColaRefuerzosSt, ColaGanadoresSw, Cola1Sw, ColaRefuerzosSw);

        so.start();
        ia.start();
        //        
        //        
        //        
        //        double empate = Math.floor(Math.random() * 100);
        //        System.out.println(empate);
        //        if (empate >= 0 && empate < 10) {
        //            System.out.println("proyecto2.Proyecto2.main()");;
        //        }
        //
        //        Cola<Integer> queue = new Cola<>();
        //
        //        // Agregar elementos
        //        queue.enqueue(10);
        //        queue.enqueue(20);
        //        queue.enqueue(30);
        //
        //        // Imprimir la cola
        //        System.out.println("Queue elements:");
        //        queue.printQueue();
        //
        //        // Ver tamaño y primer elemento
        //        System.out.println("Size: " + queue.size());
        //        System.out.println("First element: " + queue.peek());
        //
        //        // Retirar elementos
        //        System.out.println("Dequeue: " + queue.dequeue());
        //        System.out.println("Queue after dequeue:");
        //        queue.printQueue();
        //
        //        queue.enqueue(40);
        //
        //        queue.printQueue();
        //
        //        // Verificar si está vacía
        //        System.out.println("Is empty? " + queue.isEmpty());
    }

}
