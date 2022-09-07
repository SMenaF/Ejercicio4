/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;





public class Metodos {
    
    public static final String nombres[] = {"Carolina","Aaron","Alan","Gabriela","Alma"};
    
    public static int numerosAleatorios(int min,int max){
        
        int num= (int)(Math.random()*(min-(max+1))+(max+1));
        return num;
    }
    
    
}
