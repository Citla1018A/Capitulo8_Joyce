/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8;

import Capitulo8.CasePEvent.Event;
import Capitulo8.CasePRental.Rental;
import Capitulo8.Die.Jugador;
import Capitulo8.GameZCard.FullDeck;
import Capitulo8.GameZCuestionario.Pregunta;
import Capitulo8.GameZSecretPhrase2.SecretPhrase2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CASE PROBLEM");
        System.out.println("1");
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Event> eventos = new ArrayList<>();

        for (int i = 0; i < 1 ; i++) {
            System.out.println("Introduce el nombre del evento " + i+1 + ".");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el numero de telefono");
            String telefono = sc.nextLine();

            System.out.println("Ingrese el tipo de evento Modo de evento: [0]boda [1]bautizo [2]cumpleanios [3]empresarial [4]otro");
            int evento = sc.nextInt();

            eventos.add(new Event(nombre,telefono,evento));
        }

        for (int i = 0; i <eventos.size() ; i++) {
            System.out.println(eventos.get(i).getEvento());
            System.out.println(eventos.get(i).getNumeroDeTelefono());
            System.out.println(eventos.get(i).getNombreDeltipoDeEvento());

        }
        System.out.println("2");
     
       //Scanner sc = new Scanner(System.in);
        ArrayList<Rental> renta = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero de contrato para " +i + 1 + "renta");
            String noContrato = sc.nextLine();

            System.out.println("Introduce el total de minutos");
            int minutos = sc.nextInt();

            System.out.println("Introduce tu numero de telefono");
            String telefoo = sc.nextLine();

            System.out.println("Introduce el numero de equipo [1]Moto acuatica [2]Ponton [3]Bote de remos");
            System.out.println("[4]Canoa [5]Kayac [6]Silla de playa [7]Paraguas [8]Otro");
            int equipo = sc.nextInt();

            renta.add(new Rental(noContrato,minutos,telefoo,equipo));
        }

        for (int i = 0; i < renta.size(); i++) {
            System.out.println(renta.get(i).getNoContrato());
            System.out.println(renta.get(i).getNoMinutos());
            System.out.println(renta.get(i).getNoTelefono());
            System.out.println(renta.get(i).getTipoDeEquipo());
        }
        System.out.println("GAME ZONE");
        System.out.println("1");
   //     Scanner sc = new Scanner(System.in);
        Pregunta pregunta = new Pregunta();
        System.out.println("Introduce tu respuesta");
        char x = sc.next().charAt(0);
        pregunta.checar(x);
        System.out.println("2");
         Jugador jugador1 = new Jugador();
        Jugador pc = new Jugador();

        jugador1.lanzarLosDados();
        pc.lanzarLosDados();

        System.out.println("Los dados repetidos del jugador son: "+jugador1.contarRepetidos());
        System.out.println("Los dados repetidos de la pc son: " + pc.contarRepetidos());

        if (pc.contarRepetidos() > jugador1.contarRepetidos()){
            System.out.println("La pc gana");
        }else if(pc.contarRepetidos() < jugador1.contarRepetidos()){
            System.out.println("Jugador gana");
        }else{
            System.out.println("empate");
        }
        System.out.println("3");
        FullDeck mazo = new FullDeck();
        
        mazo.imrpimirFullDeck();
        System.out.println("4");
   //     Scanner sc = new Scanner(System.in);
        SecretPhrase2 a = new SecretPhrase2();

        a.descrubrirFrase();
        a.taparFrase();
        char x;
        do {
            System.out.println("Introduce la letra");
            x = sc.next().charAt(0);
            a.destaparFrase(x);
            System.out.println(a.getDescubir());
        }while (!a.completado());

    }
}
