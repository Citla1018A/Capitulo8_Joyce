/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.GameZCuestionario;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Cuestionario {
  private ArrayList<Pregunta> preguntas;
    private Integer puntaje;

    public Cuestionario(){
        preguntas = new ArrayList<>(4);
        this.puntaje = 0;
    }  
}
