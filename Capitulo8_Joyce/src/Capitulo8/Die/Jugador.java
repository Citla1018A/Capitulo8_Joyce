/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.Die;

import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Jugador {
    private ArrayList<Die> dados;
    private Integer puntaje;

    public Jugador(){
        this.dados = new ArrayList<>();
        this.puntaje = 0;
    }

    public void lanzarLosDados(){
        for (int i = 0; i < 4; i++) {
            dados.add(new Die());
        }
    }

    public Integer contarRepetidos(){
        int contador = 0;
        int aux = 0;
        for (int i = 0; i <dados.size() ; i++) {
            for (int j = 0; j < dados.size() ; j++) {
                if (this.dados.get(i).getNumero() ==this.dados.get(j).getNumero() ){
                    contador++;
                }
            }
            if (contador>aux){
                aux = contador;
                this.puntaje = aux;
            }
            contador = 0;
        }
        return aux;
    }

    public void repetidos(int x){
        switch (x){
            case 2:
                System.out.println("Un par");
            break;
            case 3:
                System.out.println("Tres dados iguales");
            break;
            case 4:
                System.out.println("Cuatro dados iguales");
            break;
            case 5:
                System.out.println("Cinco dados iguales");
            break;
            default:
                System.out.println("a");
        }

    }

    public void imprimir(){
        for (int i = 0; i < dados.size() ; i++) {
            System.out.println(dados.get(i).getNumero());

        }
    }
}
