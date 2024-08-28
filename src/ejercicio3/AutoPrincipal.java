/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author diego cabrera
 * @version hmmmmm
 */
public class AutoPrincipal {
    
    //main + tab
    public static void main(String[] args) {
        
        //creamos un nuevo constructor sin parametros
        //sacamos los datos que estan dentro del constructor
        Auto objAuto = new Auto();
        System.out.println(objAuto.getMarca());
        System.out.println(objAuto.getModelo());
        
        //dentro de los parentesis de new Auto() presionamos control espacio para que nos coloque las variables
        //ahi reemplazamos las variables
        Auto objAuto2 = new Auto("KIA", "Morning","Bencina", 2022, 1500);
        System.out.println(objAuto2.getMarca());
        System.out.println(objAuto2.getModelo());
        
        //aqui colocamos en uso el toString()
        System.out.println(objAuto);
        System.out.println(objAuto2);
        
        //es lo mismo si yo no hago el toString() en el archivo anterior
        //y coloco directamente asi:
        System.out.println(objAuto.toString());
        
         
        
    }
    
}
