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
public class Persona {
    
    
    private String nombre;
    private int edad;
    private double cash;

    public Persona(String nombre, int edad, double cash) {
        this.nombre = nombre;
        this.edad = edad;
        this.cash = cash;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
    
    public void pago(double precio){
        
        cash -= precio;
    }
    
    public boolean edadSuf(int edadMin){
        return edad >= edadMin;
    }
    
    public boolean cashSuf(double costEnt){
        
        return cash >= costEnt;
    }
    
    @Override
    
    public String toString(){
        
        return nombre+" con edad "+edad+" años cantidad total de dinero $"+cash;
    }
    
    
    
}
