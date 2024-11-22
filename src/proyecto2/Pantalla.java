/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Personaje sw1 = new Personaje("Luke Skywalker", "1w", "/imgs/starwars/1w.jpg", 10, 9, 9, 0);
    Personaje sw2 = new Personaje("Anakin Skywalker", "2w", "/imgs/starwars/2w.jpg", 10, 9, 8, 0);
    Personaje sw3 = new Personaje("Yoda", "3w", "/imgs/starwars/3w.jpg", 8, 10, 9, 0);
    Personaje sw4 = new Personaje("Emperador Palpatine", "4w", "/imgs/starwars/4w.jpg", 8, 10, 9, 0);
    Personaje sw5 = new Personaje("Rey", "5w", "/imgs/starwars/5w.jpg", 8, 9, 10, 0);
    Personaje sw6 = new Personaje("Mace Windu", "6w", "/imgs/starwars/6w.jpg", 9, 9, 8, 0);
    Personaje sw7 = new Personaje("Kylo Ren", "7w", "/imgs/starwars/7w.jpg", 9, 8, 10, 0);
    Personaje sw8 = new Personaje("Darth Vader", "8w", "/imgs/starwars/8w.jpg", 7, 10, 9, 0);
    Personaje sw9 = new Personaje("Darth Maul", "9w", "/imgs/starwars/9w.jpg", 9, 8, 10, 0);
    Personaje sw10 = new Personaje("Snoke", "10w", "/imgs/starwars/10w.jpg", 8, 9, 10, 0);

// Creación de personajes de Star Wars Nivel 2
    Personaje sw11 = new Personaje("Obi-Wan Kenobi", "11w", "/imgs/starwars/11w.jpg", 8, 9, 7, 0);
    Personaje sw12 = new Personaje("Qui-Gon Jinn", "12w", "/imgs/starwars/12w.jpg", 7, 8, 6, 0);
    Personaje sw13 = new Personaje("Boba Fett", "13w", "/imgs/starwars/13w.jpg", 7, 8, 6, 0);
    Personaje sw14 = new Personaje("Ahsoka Tano", "14w", "/imgs/starwars/14w.jpg", 7, 8, 6, 0);
    Personaje sw15 = new Personaje("Lando Calrissian", "15w", "/imgs/starwars/15w.jpg", 7, 6, 8, 0);
    Personaje sw16 = new Personaje("Chewbacca", "16w", "/imgs/starwars/16w.jpg", 6, 10, 5, 0);
    Personaje sw17 = new Personaje("Poe Dameron", "17w", "/imgs/starwars/17w.jpg", 8, 7, 6, 0);
    Personaje sw18 = new Personaje("Jyn Erso", "18w", "/imgs/starwars/18w.jpg", 6, 8, 7, 0);
    Personaje sw19 = new Personaje("Cassian Andor", "19w", "/imgs/starwars/19w.jpg", 7, 6, 8, 0);
    Personaje sw20 = new Personaje("Han Solo", "20w", "/imgs/starwars/20w.jpg", 8, 6, 7, 0);

// Creación de personajes de Star Wars Nivel 3
    Personaje sw21 = new Personaje("Padmé Amidala", "21w", "/imgs/starwars/21w.jpg", 7, 6, 5, 0);
    Personaje sw22 = new Personaje("Jabba el Hutt", "22w", "/imgs/starwars/22w.jpg", 5, 7, 6, 0);
    Personaje sw23 = new Personaje("K-2SO", "23w", "/imgs/starwars/23w.jpg", 5, 6, 7, 0);
    Personaje sw24 = new Personaje("Maz Kanata", "24w", "/imgs/starwars/24w.jpg", 6, 5, 7, 0);
    Personaje sw25 = new Personaje("Rose Tico", "25w", "/imgs/starwars/25w.jpg", 5, 6, 7, 0);
    Personaje sw26 = new Personaje("Grogu (Baby Yoda)", "26w", "/imgs/starwars/26w.jpg", 6, 7, 5, 0);
    Personaje sw27 = new Personaje("General Grievous", "27w", "/imgs/starwars/27w.jpg", 7, 6, 5, 0);
    Personaje sw28 = new Personaje("R2-D2", "28w", "/imgs/starwars/28w.jpg", 4, 6, 5, 0);
    Personaje sw29 = new Personaje("C-3PO", "29w", "/imgs/starwars/29w.jpg", 3, 7, 4, 0);
    Personaje sw30 = new Personaje("Leia Organa", "30w", "/imgs/starwars/30w.jpg", 6, 5, 7, 0);

// Creación de personajes de Star Trek Nivel 1
    Personaje st1 = new Personaje("Data", "1t", "/imgs/startreck/1t.jpg", 9, 10, 8, 0);
    Personaje st2 = new Personaje("Q", "2t", "/imgs/startreck/2t.jpg", 8, 10, 9, 0);
    Personaje st3 = new Personaje("Worf", "3t", "/imgs/startreck/3t.jpg", 9, 8, 10, 0);
    Personaje st4 = new Personaje("Spock", "4t", "/imgs/startreck/4t.jpg", 8, 9, 10, 0);
    Personaje st5 = new Personaje("James T. Kirk", "5t", "/imgs/startreck/5t.jpg", 9, 10, 8, 0);
    Personaje st6 = new Personaje("Jean-Luc Picard", "6t", "/imgs/startreck/6t.jpg", 8, 9, 10, 0);
    Personaje st7 = new Personaje("Seven of Nine", "7t", "/imgs/startreck/7t.jpg", 8, 10, 9, 0);
    Personaje st8 = new Personaje("Benjamin Sisko", "8t", "/imgs/startreck/8t.jpg", 9, 8, 10, 0);
    Personaje st9 = new Personaje("Odo", "9t", "/imgs/startreck/9t.jpg", 9, 10, 8, 0);
    Personaje st10 = new Personaje("Kathryn Janeway", "10t", "/imgs/startreck/10t.jpg", 8, 9, 10, 0);

// Creación de personajes de Star Trek Nivel 2
    Personaje st11 = new Personaje("Tuvok", "11t", "/imgs/startreck/11t.jpg", 7, 8, 6, 0);
    Personaje st12 = new Personaje("William Riker", "12t", "/imgs/startreck/12t.jpg", 8, 7, 6, 0);
    Personaje st13 = new Personaje("Geordi La Forge", "13t", "/imgs/startreck/13t.jpg", 6, 8, 7, 0);
    Personaje st14 = new Personaje("B'Elanna Torres", "14t", "/imgs/startreck/14t.jpg", 8, 6, 7, 0);
    Personaje st15 = new Personaje("Jonathan Archer", "15t", "/imgs/startreck/15t.jpg", 6, 8, 7, 0);
    Personaje st16 = new Personaje("Chakotay", "16t", "/imgs/startreck/16t.jpg", 7, 6, 8, 0);
    Personaje st17 = new Personaje("Sarek", "17t", "/imgs/startreck/17t.jpg", 7, 8, 6, 0);
    Personaje st18 = new Personaje("Gul Dukat", "18t", "/imgs/startreck/18t.jpg", 8, 7, 6, 0);
    Personaje st19 = new Personaje("Montgomery Scott", "19t", "/imgs/startreck/19t.jpg", 6, 8, 7, 0);
    Personaje st20 = new Personaje("T'Pol", "20t", "/imgs/startreck/20t.jpg", 7, 6, 8, 0);

// Creación de personajes de Star Trek Nivel 3
    Personaje st21 = new Personaje("Neelix", "21t", "/imgs/startreck/21t.jpg", 5, 7, 6, 0);
    Personaje st22 = new Personaje("Phlox", "22t", "/imgs/startreck/22t.jpg", 6, 7, 5, 0);
    Personaje st23 = new Personaje("Leonard McCoy", "23t", "/imgs/startreck/23t.jpg", 7, 6, 5, 0);
    Personaje st24 = new Personaje("Nyota Uhura", "24t", "/imgs/startreck/24t.jpg", 5, 6, 7, 0);
    Personaje st25 = new Personaje("Hikaru Sulu", "25t", "/imgs/startreck/25t.jpg", 6, 7, 5, 0);
    Personaje st26 = new Personaje("Pavel Chekov", "26t", "/imgs/startreck/26t.jpg", 7, 5, 6, 0);
    Personaje st27 = new Personaje("Tom Paris", "27t", "/imgs/startreck/27t.jpg", 6, 5, 7, 0);
    Personaje st28 = new Personaje("Deanna Troi", "28t", "/imgs/startreck/28t.jpg", 5, 6, 7, 0);
    Personaje st29 = new Personaje("Beverly Crusher", "29t", "/imgs/startreck/29t.jpg", 7, 6, 5, 0);
    Personaje st30 = new Personaje("Quark", "30t", "/imgs/startreck/30t.jpg", 6, 5, 7, 0);

    Administrador so = new Administrador(mutex, null, null, cola1St, cola2St, cola3St, colaRefuerzosSt, cola1Sw, cola2Sw, cola3Sw, colaRefuerzosSw, cola1RSw, cola2RSw, cola3RSw, cola1RSt, cola2RSt, cola3RSt);
    Procesador ia = new Procesador(mutex, so, duracion, colaGanadoresSt, cola1St, colaRefuerzosSt, colaGanadoresSw, cola1Sw, colaRefuerzosSw);

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initSimulation();

        initComponents();
        Icon mainIconSt = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/startreck/st.png")).getImage().getScaledInstance(this.tituloSt.getWidth(), this.tituloSt.getHeight(), 0));
        this.tituloSt.setIcon(mainIconSt);
        Icon mainIconSw = new ImageIcon(new ImageIcon(getClass().getResource("/imgs/starwars/sw.png")).getImage().getScaledInstance(this.tituloSw.getWidth(), this.tituloSw.getHeight(), 0));
        this.tituloSw.setIcon(mainIconSw);
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

        ia.setDuracion(duracion);
        so.setDuracion(duracion);

        so.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        cantGanadosSw = new javax.swing.JTextField();
        cantGanadosSt = new javax.swing.JTextField();
        tituloSt = new javax.swing.JLabel();
        tituloSw = new javax.swing.JLabel();

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

        jScrollPane2.setEnabled(false);

        textCola3Sw.setEditable(false);
        textCola3Sw.setColumns(20);
        textCola3Sw.setRows(5);
        jScrollPane2.setViewportView(textCola3Sw);

        textCola1Sw.setEditable(false);
        textCola1Sw.setColumns(20);
        textCola1Sw.setRows(5);
        jScrollPane3.setViewportView(textCola1Sw);

        textCola2Sw.setEditable(false);
        textCola2Sw.setColumns(20);
        textCola2Sw.setRows(5);
        jScrollPane4.setViewportView(textCola2Sw);

        textColaRSt.setEditable(false);
        textColaRSt.setColumns(20);
        textColaRSt.setRows(5);
        jScrollPane5.setViewportView(textColaRSt);

        textCola1St.setEditable(false);
        textCola1St.setColumns(20);
        textCola1St.setRows(5);
        jScrollPane6.setViewportView(textCola1St);

        textCola2St.setEditable(false);
        textCola2St.setColumns(20);
        textCola2St.setRows(5);
        jScrollPane7.setViewportView(textCola2St);

        textCola3St.setEditable(false);
        textCola3St.setColumns(20);
        textCola3St.setRows(5);
        jScrollPane8.setViewportView(textCola3St);

        textColaRSw.setEditable(false);
        textColaRSw.setColumns(20);
        textColaRSw.setRows(5);
        jScrollPane9.setViewportView(textColaRSw);

        GanadoresSw.setEditable(false);
        GanadoresSw.setColumns(20);
        GanadoresSw.setRows(5);
        jScrollPane1.setViewportView(GanadoresSw);

        GanadoresSt.setEditable(false);
        GanadoresSt.setColumns(20);
        GanadoresSt.setRows(5);
        jScrollPane10.setViewportView(GanadoresSt);

        textGanador.setEditable(false);
        textGanador.setBorder(javax.swing.BorderFactory.createTitledBorder("Ganador"));

        rondas.setEditable(false);
        rondas.setBorder(javax.swing.BorderFactory.createTitledBorder("Rondas"));

        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        jSlider1.setValue(5);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setText("Tiempo de simulacion(S)");

        cantGanadosSw.setEditable(false);

        cantGanadosSt.setEditable(false);

        tituloSt.setText("titulo");

        tituloSw.setText("titulo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Cols1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cols1Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cols1Label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cantGanadosSw, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PeleadorSwImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreSw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(HabilidadesSw, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadoIa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(PeleadorStImg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NombreSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(HabilidadesSt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cols1Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(tituloSw, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cols1Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cols1Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cols1Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(Cols1Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantGanadosSt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloSt, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloSt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloSw, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantGanadosSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cols1Label3)
                        .addGap(28, 28, 28)
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
                                .addComponent(HabilidadesSt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadoIa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantGanadosSw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cols1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cols1Label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addComponent(Cols1Label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cols1Label6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        so.setDuracion(jSlider1.getValue() * 1000);
        ia.setDuracion(jSlider1.getValue() * 1000);
        System.out.println(so.getDuracion());
        System.out.println(ia.getDuracion());
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

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
                iconSt = new ImageIcon(new ImageIcon(getClass().getResource(so.getStProximo().getImagen())).getImage().getScaledInstance(this.PeleadorStImg.getWidth(), this.PeleadorStImg.getHeight(), 0));
                this.PeleadorStImg.setIcon(iconSt);
                this.NombreSw.setText(so.getSwProximo().getNombre());
                this.HabilidadesSw.setText("Ag:" + so.getSwProximo().getAgilidad() + ",Fz:" + so.getSwProximo().getFuerza() + ",In:" + so.getSwProximo().getInteligencia());
                iconSw = new ImageIcon(new ImageIcon(getClass().getResource(so.getSwProximo().getImagen())).getImage().getScaledInstance(this.PeleadorSwImg.getWidth(), this.PeleadorSwImg.getHeight(), 0));
                this.PeleadorSwImg.setIcon(iconSw);
            }
            this.rondas.setText(String.valueOf(so.getRondas()));
            this.estadoIa.setText(this.ia.getEstado());
            this.textGanador.setText(this.ia.getNombreGanador());
            this.cantGanadosSw.setText(String.valueOf(colaGanadoresSw.size()));
            this.cantGanadosSt.setText(String.valueOf(colaGanadoresSt.size()));
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
    private javax.swing.JTextField cantGanadosSt;
    private javax.swing.JTextField cantGanadosSw;
    private javax.swing.JTextField estadoIa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSlider jSlider1;
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
    private javax.swing.JLabel tituloSt;
    private javax.swing.JLabel tituloSw;
    // End of variables declaration//GEN-END:variables
}
