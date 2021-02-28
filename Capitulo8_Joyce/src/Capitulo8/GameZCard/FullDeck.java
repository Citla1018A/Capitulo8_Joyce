/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.GameZCard;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class FullDeck {
  private ArrayList<Card> cartas;
    private  ArrayList<Integer> repetidos;

    public FullDeck(){
        cartas = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            Card aux = new Card();
            cartas.add(aux);
        }
    }

    public void imrpimirFullDeck(){
        for (int i = 0; i < cartas.size() ; i++) {
            System.out.println("Carta "+i + ":  "+cartas.get(i).getNumero());
        }
    }  
}
