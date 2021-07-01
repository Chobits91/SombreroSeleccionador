package pkgfinal.hogwarts;

import javax.swing.*;

public class FinalFinalHogwarts {

    public static void main(String[] args) {
        int toth = 0, totr = 0, totg = 0, tots = 0;
        String a, b, c, d;
        int[] puntosj1 = new int[4]; // arrays para puntos de jugador 1
        String[] jugadores = new String[1]; // arrays jugador 1 [0]
        String inicio = JOptionPane.showInputDialog(null, "¿Comenzar test?");
        while (inicio.equalsIgnoreCase("si")) {
            for (int i = 0; i < 1; i++) { //recorre las posiciones del array 1 y 2.
                jugadores[0] = JOptionPane.showInputDialog(null, "Ingrese nombre jugador 1");//guarda el nombre en posición 0
                switch (JOptionPane.showInputDialog(null, "1° Pregunta: ¿Qué es lo que más te molestaría que dijeran que sos?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Egoísta");
                        puntosj1[0] = toth += 1; //¿acumulador?
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Ignorante");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Cobarde");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Común");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "2° Pregunta: Una vez cada siglo, el arbusto Flutterby produce flores que adaptan su aroma para atraer a los incautos. Si te atraía, olería a:")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Pergamino Fresco");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "El Mar");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Una Chimenea Crepitante");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Casa");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "3° Pregunta: Preferirías inventar una poción que te garantice:")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Amor");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Sabiduría");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Gloria");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Poder");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "4° Pregunta: Después de que hayas muerto, ¿cómo te gustaría que reaccionen las personas cuando escuchen tu nombre?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Te extrañen con una sonrisa");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Piensen en tus logros con admiración");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Pidan escuchar más historias de tus aventuras");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Es más importante lo que piensan de mí mientras estoy vivo.");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "5° Pregunta: ¿Qué instrumento te gusta más?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Tambor");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Piano");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Trompeta");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Violín");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "6° Pregunta: ¿Qué te resulta más difícil de aguantar?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Hambre");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Soledad");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Aburrimiento");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Ser Ignorado");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "7° Pregunta: ¿Qué mascota elegirías llevar a Hogwarts?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Sapo");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Búho");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Lechuza");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Gato Negro");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "8° Pregunta: ¿Qué es lo que más deseas aprender en Hogwarts?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Secretos sobre el castillo");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Aparición y Desaparicion (Materializarse y Desmaterializarse a voluntad)");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Volar en escoba");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Maleficios y Hechizos");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                switch (JOptionPane.showInputDialog(null, "9° Pregunta: ¿Cuál de las siguientes criaturas te gustaría estudiar más?")) {
                    case "a":
                        //JOptionPane.showMessageDialog(null, "Trolls");
                        puntosj1[0] = toth += 1;
                        //System.out.println(puntosj1[0]);
                        break;
                    case "b":
                        //JOptionPane.showMessageDialog(null, "Duendes");
                        puntosj1[1] = totr += 1;
                        //System.out.println(puntosj1[1]);
                        break;
                    case "c":
                        //JOptionPane.showMessageDialog(null, "Centauros");
                        puntosj1[2] = totg += 1;
                        //System.out.println(puntosj1[2]);
                        break;
                    case "d":
                        //JOptionPane.showMessageDialog(null, "Vampiros");
                        puntosj1[3] = tots += 1;
                        //System.out.println(puntosj1[3]);
                        break;
                }
                //condiciones para determinar qué casa le toca al jugador1.
                if ((toth > totr) && (toth > totg) && (toth > tots)) { //GANA HUFFLEPUFF
                    JOptionPane.showMessageDialog(null, jugadores[0] + " ¡Perteneces a Hufflepuff!"); //muestra en la consola nombre del jugador 1
                    System.out.println(jugadores[0] + " ¡Perteneces a Hufflepuff!"); //muestra en la consola nombre del jugador 1
                } else if ((totr > toth) && (totr > totg) && (totr > tots)) { //GANA RAVENCLAW
                    JOptionPane.showMessageDialog(null, jugadores[0] + " ¡Perteneces a Ravenclaw!"); //muestra en la consola los nombres de los jugadores
                    System.out.println(jugadores[0] + " ¡Perteneces a Ravenclaw!"); //muestra en la consola los nombres de los jugadores
                } else if ((totg > toth) && (totg > totr) && (totg > tots)) { // GANA GRYFFINDOR
                    JOptionPane.showMessageDialog(null, jugadores[0] + " ¡Perteneces a Gryffindor!"); //muestra en la consola los nombres de los jugadores
                    System.out.println(jugadores[0] + " ¡Perteneces a Gryffindor!"); //muestra en la consola los nombres de los jugadores
                } else if ((tots > toth) && (tots > totr) && (tots > totg)) { // GANA SLYTHERIN
                    JOptionPane.showMessageDialog(null, jugadores[0] + " ¡Perteneces a Slytherin!"); //muestra en la consola los nombres de los jugadores
                    System.out.println(jugadores[0] + " ¡Perteneces a Slytherin!"); //muestra en la consola los nombres de los jugadores
                }
                System.out.println(puntosj1[0]); // = hufflepuff; //muestra en la consola cuantas respuestas A del jugador 1
                System.out.println(puntosj1[1]); // = ravenclaw; //muestra en la consola cuantas respuestas B puntos del jugador 1
                System.out.println(puntosj1[2]); // = gryffindor; //muestra en la consola cuantas respuestas C puntos del jugador 1
                System.out.println(puntosj1[3]); // = slytherin; //muestra en la consola cuantas respuestas D puntos del jugador 1
            }//pregunta de nuevo para saber si vuelve a empezar o termina
            inicio = JOptionPane.showInputDialog(null, "¿Comenzar un nuevo test?");
        }
        System.out.println("GAME OVER");
    }
}
