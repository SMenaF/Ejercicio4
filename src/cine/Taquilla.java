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
public class Taquilla {

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
    
    
    
    public Taquilla(int filas,int columnas, double precio, Pelicula pelicula) {
        
        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        asientosRellenados();
    }
    
    private void asientosRellenados(){
        
        int fila = asientos.length;
        for(int i=0;i < asientos.length; i++){
            for(int j=0; j < asientos[0].length;j++){
                
                asientos[i][j] = new Asiento((char)('A' + j),fila);
            }
            fila--;
        }
    }
    
    public boolean cupo(){
        
        for(int i=0;i < asientos.length; i++){
            for(int j=0; j < asientos[0].length;j++){
                
                if(!asientos[i][j].ocupado()){
                    return true;
                }
            }
           
        }
        return false;
    }
    
    
    public boolean asientoVacio(int fila,char letra){
        return parameterAsiento(fila,letra).ocupado();
    }
    
    public boolean cumpleReq(Persona p){
        return p.cashSuf(precio) && p.edadSuf(pelicula.getEdadMin());
    }
    
    public void asignarAsiento(int fila, char letra, Persona p){
        parameterAsiento(fila,letra).setPersona(p);
    }
    
    public Asiento parameterAsiento(int fila,char letra){
        
        return asientos[asientos.length - fila - 1][letra - 'A'];
        
    }
    
    
    public int obtenerFilas(){
        
        return asientos.length;
    }
    
    
    public int obtenerColumnas(){
        
        return asientos[0].length;
    }
    
    public String datos(){
        
        String resultado ="";
        
        resultado += "Cargando Datos....";
        
        resultado += "\n";
        
        resultado += "Bienvenido a la simulacion de cine";
        
        resultado += "\n";
        
        resultado += "La pelicula de hoy "+pelicula;
        
        resultado += "\n";
        
        resultado += "Entrada general: $"+precio;
        
        resultado += "\n";
        
        
        
         for(int i=0;i < asientos.length; i++){
            for(int j=0; j < asientos[0].length;j++){
                
                resultado += asientos[i][j]+ "\n";
                
                
                }
            
            }
           return resultado;
        }
        
        
        
        
    }
       
            
            
            
        
        
        
        
        
    
    
    
    

