/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Diego "cuarta clase" Cabrera
 */
public class Condiciones {
    
    private int edad;
    private String nombre;
    
    //Sin parametros por que no tiene nada
    public Condiciones() {
    }

    //Con parametros por que tiene cosas dentro del parentesis
    public Condiciones(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void pruebaCondiciones(){
        
        if (this.edad > 18)
        {
            System.out.println("usted es mayor de edad");
        }
        else
        {
            if (this.edad <= 12 && this.getEdad()>=17){
                System.out.println("usted es un joven");
            }
            else{
                System.out.println("usted es un niño");
            }
           
        }
    }
    
    
}
