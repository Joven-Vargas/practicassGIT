/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Cuadrado implements FiguraGeometrica{

    
    //atributos 
    
    private double lado;
      //contructor 
    
    public Cuadrado(){
    
     
    }
    
    
    //emcapsulamento

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public void area() {
        return "figura geometrica "+
                "lado:"+ getLado();
        
        
    
    
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
