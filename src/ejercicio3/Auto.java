/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 * //lo primero que debemos hacer es cambiar estos parametros, el codigo es nuestro
 * @author diego AAAAAAAAAAAA cabrera
 * @version 27-08
 */
public class Auto {
    //declaramos las variables
    private String marca,modelo,tipoCombustible;
    private int año;
    private double cilindrada;
    
    //constructor sin parametros, sirve para crear objetos
    //ctrl + espacio para buscarlo

    public Auto() {
        marca = "Suzuki";
        modelo = "Baleno";
        
    }
    
    //constructor con parametros, se le asigna a las variables de la clase
    
    public Auto(String marca, String modelo, String tipoCombustible, int año, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cilindrada = cilindrada;
    }

    //click derecho + insert code + getter and setter 
    //añadimos todas las variables para darles getter and setter
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // insert code + toString()
    //esto es como un print, pero da un return, nos muestra toda la informacion pero debemos arrojarla en un sout
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cilindrada=" + cilindrada + '}';
    }
    
    
    
    
}
