/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import java.util.concurrent.Semaphore;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author smoreno
 */
public class Pantalla extends javax.swing.JFrame {

    int duracion = 5000;
    Semaphore mutex = new Semaphore(1);
    Icon iconSw;
    Icon iconSt;
    Cola<Personaje> cola1Sw = new Cola<>();
    Cola<Personaje> colaGanadoresSw = new Cola<>();
    Cola<Personaje> cola2Sw = new Cola<>();
    Cola<Personaje> cola3Sw = new Cola<>();
    Cola<Personaje> cola1RSw = new Cola<>();
    Cola<Personaje> cola2RSw = new Cola<>();
    Cola<Personaje> cola3RSw = new Cola<>();
    Cola<Personaje> colaRefuerzosSw = new Cola<>();
    Cola<Personaje> colaGanadoresSt = new Cola<>();
    Cola<Personaje> cola1St = new Cola<>();
    Cola<Personaje> cola2St = new Cola<>();
    Cola<Personaje> cola3St = new Cola<>();
    Cola<Personaje> cola1RSt = new Cola<>();
    Cola<Personaje> cola2RSt = new Cola<>();
    Cola<Personaje> cola3RSt = new Cola<>();
    Cola<Personaje> colaRefuerzosSt = new Cola<>();

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

    Administrador so = new Administrador(mutex, null, null, cola1St, cola2St, cola3St, colaRefuerzosSt, cola1Sw, cola2Sw, cola3Sw, colaRefuerzosSw, cola1RSw, cola2RSw, cola3RSw, cola1RSt, cola2RSt, cola3RSt);
    Procesador ia = new Procesador(mutex, so, duracion, colaGanadoresSt, cola1St, colaRefuerzosSt, colaGanadoresSw, cola1Sw, colaRefuerzosSw);

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initSimulation();
        initComponents();
        iniciarRefrescoAutomatico();
    }

    public void initSimulation() {

        cola1Sw.enqueue(sw1);
        cola1Sw.enqueue(sw2);
        cola1Sw.enqueue(sw3);
        cola1Sw.enqueue(sw4);
        cola1Sw.enqueue(sw5);
        cola1Sw.enqueue(sw6);
        cola1Sw.enqueue(sw7);
        cola1Sw.enqueue(sw8);
        cola1Sw.enqueue(sw9);
        cola1Sw.enqueue(sw10);

        cola2Sw.enqueue(sw11);
        cola2Sw.enqueue(sw12);
        cola2Sw.enqueue(sw13);
        cola2Sw.enqueue(sw14);
        cola2Sw.enqueue(sw15);
        cola2Sw.enqueue(sw16);
        cola2Sw.enqueue(sw17);
        cola2Sw.enqueue(sw18);
        cola2Sw.enqueue(sw19);
        cola2Sw.enqueue(sw20);

        cola3Sw.enqueue(sw21);
        cola3Sw.enqueue(sw22);
        cola3Sw.enqueue(sw23);
        cola3Sw.enqueue(sw24);
        cola3Sw.enqueue(sw25);
        cola3Sw.enqueue(sw26);
        cola3Sw.enqueue(sw27);
        cola3Sw.enqueue(sw28);
        cola3Sw.enqueue(sw29);
        cola3Sw.enqueue(sw30);

        cola1St.enqueue(st1);
        cola1St.enqueue(st2);
        cola1St.enqueue(st3);
        cola1St.enqueue(st4);
        cola1St.enqueue(st5);
        cola1St.enqueue(st6);
        cola1St.enqueue(st7);
        cola1St.enqueue(st8);
        cola1St.enqueue(st9);
        cola1St.enqueue(st10);

        cola2St.enqueue(st11);
        cola2St.enqueue(st12);
        cola2St.enqueue(st13);
        cola2St.enqueue(st14);
        cola2St.enqueue(st15);
        cola2St.enqueue(st16);
        cola2St.enqueue(st17);
        cola2St.enqueue(st18);
        cola2St.enqueue(st19);
        cola2St.enqueue(st20);

        cola3St.enqueue(st21);
        cola3St.enqueue(st22);
        cola3St.enqueue(st23);
        cola3St.enqueue(st24);
        cola3St.enqueue(st25);
        cola3St.enqueue(st26);
        cola3St.enqueue(st27);
        cola3St.enqueue(st28);
        cola3St.enqueue(st29);
        cola3St.enqueue(st30);

        Cola.desordenarCola(cola1Sw);
        Cola.desordenarCola(cola2Sw);
        Cola.desordenarCola(cola3Sw);
        Cola.desordenarCola(cola1St);
        Cola.desordenarCola(cola2St);
        Cola.desordenarCola(cola3St);

        for (int i = 1; i <= 2; i++) {
            cola1RSw.enqueue(cola1Sw.dequeue());
            cola1RSt.enqueue(cola1St.dequeue());
        }

        for (int i = 1; i <= 4; i++) {
            cola2RSw.enqueue(cola2Sw.dequeue());
            cola2RSt.enqueue(cola2St.dequeue());
            cola3RSw.enqueue(cola3Sw.dequeue());
            cola3RSt.enqueue(cola3St.dequeue());
        }

        so.start();
        ia.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cols1Label = new javax.swing.JLabel();
        Cols1Label1 = new javax.swing.JLabel();
        Cols1Label2 = new javax.swing.JLabel();
        Cols1Label3 = new javax.swing.JLabel();
        Cols1Label4 = new javax.swing.JLabel();
        Cols1Label5 = new javax.swing.JLabel();
        PeleadorSwImg = new javax.swing.JLabel();
        PeleadorStImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cols1Label6 = new javax.swing.JLabel();
        Cols1Label7 = new javax.swing.JLabel();
        NombreSt = new javax.swing.JLabel();
        HabilidadesSt = new javax.swing.JTextField();
        HabilidadesSw = new javax.swing.JTextField();
        NombreSw = new javax.swing.JLabel();
        estadoIa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textCola3Sw = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textCola1Sw = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textCola2Sw = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        textColaRSt = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        textCola1St = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        textCola2St = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        textCola3St = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        textColaRSw = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        GanadoresSw = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        GanadoresSt = new javax.swing.JTextArea();
        textGanador = new javax.swing.JTextField();
        rondas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cols1Label.setText("Cola 1");

        Cols1Label1.setText("Cola 2");

        Cols1Label2.setText("Cola 3");

        Cols1Label3.setText("Cola 1");

        Cols1Label4.setText("Cola 2");

        Cols1Label5.setText("Cola 3");

        PeleadorSwImg.setText("jLabel1");

        PeleadorStImg.setText("jLabel1");

        jLabel3.setText("VS");

        Cols1Label6.setText("Cola Refuerzos");

        Cols1Label7.setText("Cola Refuerzos");

        NombreSt.setForeground(new java.awt.Color(255, 51, 51));
        NombreSt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreSt.setText("Nombre");
        NombreSt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        HabilidadesSt.setEditable(false);

        HabilidadesSw.setEditable(false);

        NombreSw.setForeground(new java.awt.Color(255, 51, 51));
        NombreSw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreSw.setText("Nombre");
        NombreSw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        estadoIa.setEditable(false);

        jLabel1.setText("Estado IA");

        textCola3Sw.setColumns(20);
        textCola3Sw.setRows(5);
        jScrollPane2.setViewportView(textCola3Sw);

        textCola1Sw.setColumns(20);
        textCola1Sw.setRows(5);
        jScrollPane3.setViewportView(textCola1Sw);

        textCola2Sw.setColumns(20);
        textCola2Sw.setRows(5);
        jScrollPane4.setViewportView(textCola2Sw);

        textColaRSt.setColumns(20);
        textColaRSt.setRows(5);
        jScrollPane5.setViewportView(textColaRSt);

        textCola1St.setColumns(20);
        textCola1St.setRows(5);
        jScrollPane6.setViewportView(textCola1St);

        textCola2St.setColumns(20);
        textCola2St.setRows(5);
        jScrollPane7.setViewportView(textCola2St);

        textCola3St.setColumns(20);
        textCola3St.setRows(5);
        jScrollPane8.setViewportView(textCola3St);

        textColaRSw.setColumns(20);
        textColaRSw.setRows(5);
        jScrollPane9.setViewportView(textColaRSw);

        GanadoresSw.setColumns(20);
        GanadoresSw.setRows(5);
        jScrollPane1.setViewportView(GanadoresSw);

        GanadoresSt.setColumns(20);
        GanadoresSt.setRows(5);
        jScrollPane10.setViewportView(GanadoresSt);

        textGanador.setEditable(false);
        textGanador.setBorder(javax.swing.BorderFactory.createTitledBorder("Ganador"));

        rondas.setEditable(false);
        rondas.setBorder(javax.swing.BorderFactory.createTitledBorder("Rondas"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Cols1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cols1Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cols1Label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PeleadorSwImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreSw, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(HabilidadesSw)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NombreSt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(HabilidadesSt)))
                                    .addComponent(estadoIa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(PeleadorStImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Cols1Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cols1Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cols1Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cols1Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(229, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cols1Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cols1Label3)
                            .addComponent(estadoIa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(PeleadorStImg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PeleadorSwImg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NombreSt)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(textGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(NombreSw)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(HabilidadesSw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(HabilidadesSt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Cols1Label4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25)
                                            .addComponent(Cols1Label5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Cols1Label7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cols1Label2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cols1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cols1Label1)
                        .addGap(253, 253, 253)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cols1Label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Pantalla().setVisible(true);
            }
        });
    }

    private void iniciarRefrescoAutomatico() {
        Thread refrescoThread = new Thread(() -> {
            while (true) {
                try {
                    refreshFields();
                    Thread.sleep(1000); // Espera 1 segundo antes de la siguiente actualización
                } catch (InterruptedException e) {
                    e.printStackTrace();// Manejar la interrupción del hilo
                    break; // Salir del bucle si el hilo es interrumpido
                }
            }
        });
        refrescoThread.setDaemon(true); // Hacer que el hilo sea un hilo demonio
        refrescoThread.start(); // Iniciar el hilo
    }

    public void refreshFields() throws InterruptedException {

        this.textCola1Sw.setText(cola1Sw.getQueueName("", false));
        this.textCola2Sw.setText(cola2Sw.getQueueName("", false));
        this.textCola3Sw.setText(cola3Sw.getQueueName("", false));
        this.textColaRSw.setText(colaRefuerzosSw.getQueueName("", false));
        this.GanadoresSw.setText(colaGanadoresSw.getQueueName("", false));
        this.textCola1St.setText(cola1St.getQueueName("", false));
        this.textCola2St.setText(cola2St.getQueueName("", false));
        this.textCola3St.setText(cola3St.getQueueName("", false));
        this.textColaRSt.setText(colaRefuerzosSt.getQueueName("", false));
        this.GanadoresSt.setText(colaGanadoresSt.getQueueName("", false));
        if (so != null) {
            if (so.getStProximo() != null && so.getSwProximo().getNombre() != null) {
                this.NombreSt.setText(so.getStProximo().getNombre());
                this.HabilidadesSt.setText("Ag:" + so.getStProximo().getAgilidad() + ",Fz:" + so.getStProximo().getFuerza() + ",In:" + so.getStProximo().getInteligencia());
                iconSt = new ImageIcon(new ImageIcon(getClass().getResource("")).getImage().getScaledInstance(this.PeleadorStImg.getWidth(), this.PeleadorStImg.getHeight(), 0));
                this.PeleadorStImg.setIcon(iconSt);
                this.NombreSw.setText(so.getSwProximo().getNombre());
                this.HabilidadesSw.setText("Ag:" + so.getSwProximo().getAgilidad() + ",Fz:" + so.getSwProximo().getFuerza() + ",In:" + so.getSwProximo().getInteligencia());
                iconSw = new ImageIcon(new ImageIcon(getClass().getResource("")).getImage().getScaledInstance(this.PeleadorSwImg.getWidth(), this.PeleadorSwImg.getHeight(), 0));
                this.PeleadorSwImg.setIcon(iconSw);
            }
            this.rondas.setText(String.valueOf(so.getRondas()));
            this.estadoIa.setText(this.ia.getEstado());
            this.textGanador.setText(this.ia.getNombreGanador());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cols1Label;
    private javax.swing.JLabel Cols1Label1;
    private javax.swing.JLabel Cols1Label2;
    private javax.swing.JLabel Cols1Label3;
    private javax.swing.JLabel Cols1Label4;
    private javax.swing.JLabel Cols1Label5;
    private javax.swing.JLabel Cols1Label6;
    private javax.swing.JLabel Cols1Label7;
    private javax.swing.JTextArea GanadoresSt;
    private javax.swing.JTextArea GanadoresSw;
    private javax.swing.JTextField HabilidadesSt;
    private javax.swing.JTextField HabilidadesSw;
    private javax.swing.JLabel NombreSt;
    private javax.swing.JLabel NombreSw;
    private javax.swing.JLabel PeleadorStImg;
    private javax.swing.JLabel PeleadorSwImg;
    private javax.swing.JTextField estadoIa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField rondas;
    private javax.swing.JTextArea textCola1St;
    private javax.swing.JTextArea textCola1Sw;
    private javax.swing.JTextArea textCola2St;
    private javax.swing.JTextArea textCola2Sw;
    private javax.swing.JTextArea textCola3St;
    private javax.swing.JTextArea textCola3Sw;
    private javax.swing.JTextArea textColaRSt;
    private javax.swing.JTextArea textColaRSw;
    private javax.swing.JTextField textGanador;
    // End of variables declaration//GEN-END:variables
}
