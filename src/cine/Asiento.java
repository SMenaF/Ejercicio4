/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author sofia
 */
public class Asiento {
    
    private char letra;
    private int fila;
    private Persona persona;

  

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.persona = null;
    }
    
    public boolean ocupado(){
        
        return persona !=null;
        
    }
    
    @Override
    
    public String toString(){
        
        if(ocupado()){
            return "El asiento: "+fila+letra+" Esta ocupado por "+persona;
        }
        return "El asiento: "+fila+letra+" el asiento esta vacio";
    }
    
    
    
    
    
    
    
}
