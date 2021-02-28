/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.GameZSecretPhrase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Citlalli
 */
public class SecretPhrase2 {
     private ArrayList<String> frases;
    private StringBuilder descubir;
    private String frase;
    private Scanner sc;

    public SecretPhrase2(){
        this.sc = new Scanner(System.in);
        this.frases = new ArrayList<>();
        añadirFrases();
        this.frase = frases.get(seleccionarFrase());
    }

    public Boolean completado(){
        return this.frase.equals(this.descubir.toString()) ? true : false;
    }

    private Integer seleccionarFrase(){
        return (int)(Math.random()*5+1);
    }

    public void taparFrase(){
        this.descubir = new StringBuilder();
        for (int i = 0; i < this.frase.length(); i++) {
            if (this.frase.charAt(i) != ' '){
                this.descubir.append('*');
            }else{
                this.descubir.append(' ');
            }
        }
    }

    public StringBuilder getDescubir() {
        return descubir;
    }

    public void setDescubir(StringBuilder descubir) {
        this.descubir = descubir;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void destaparFrase(char a){
        for (int i = 0; i < this.frase.length() ; i++) {
            if (this.frase.charAt(i) == a){
                this.descubir.setCharAt(i,a);
            }
        }
    }

    public void descrubrirFrase(){
        System.out.println("la frase es: " + this.frase);
    }

    public void añadirFrases(){
        this.frases.add("Frase numero uno");
        this.frases.add("Frase numero tres");
        this.frases.add("Frase numero dos");
        this.frases.add("Frase numero tres");
        this.frases.add("Frase numero cuatro");
        this.frases.add("Frase numero cinco");
    }

}
