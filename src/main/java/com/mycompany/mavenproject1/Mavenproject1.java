/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;


/**
 *
 * @author Pato
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        String nombre, nombre2;
        int edad;
        int movil;
        boolean estado_civil;
        String DNI;
        char sexo;
        
        nombre = "Cintia";
        edad = 35;
        movil = 645060722;
        estado_civil = false;
        DNI = "15474998T";
        sexo = 'f';
        
        nombre = "Alvaro";
        System.out.println("Ficha de " + nombre);
        System.out.println("nombre: " + nombre);
        System.out.println("edad --> " + edad);
        System.out.println(movil);
        System.out.println(estado_civil);
        System.out.println(DNI);
        System.out.println(sexo);
        
        
        // Vamos a aprender a hacer operaciones.
        
        // SUMA
        int numero1;
        int numero2;
        double numero3;
        double numero4;
        double resultado;
        
        numero1 = 7;
        numero2 = 3;
        numero3 = 2.5;
        numero4 = 5.8;
        
        
        resultado = numero1 + numero4;
        System.out.println(resultado);
        
        resultado = numero2 + numero1;
        System.out.println(resultado);
        
        
      // if
      
      if(numero1 == numero1){
          System.out.println("Es igual");
      
      }
        
      if(numero1 == numero2){
          System.out.println("Es igual");
      }  
      else {
          System.out.println("No es igual");
          
      }
      
      if(numero1 > numero4 & numero1 == numero1 | numero1 < numero2){
          System.out.println("Es igual");
      
      }
      
      
      
      
      
      
/*
      
        while(mensaje != "fin"){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce una venta: ");
            int numero;
            numero = scanner.nextInt();
            System.out.println("¿Hay clientes?");
            mensaje = scanner.nextLine();
            
            
        }*/

        
        

        
        
        
        
        
        
        /*EJERCICIO CAJERO:
        
         - Si cliente paga se introduce importe venta
         - Se pueden introducir varios valores seguidos
        - Si no hay clientes escribe la palabra FIN
        
        Queremos saber:
            - Ventas del dia (suam de todos los importes)
            - clientes atendidos
            - promedio
        
        
        
        */
        
        
        String mnsj_especial = "Venta destacada del dia";
        
        int ventas_totales = 0;
        int venta = 0;
        double promedio = 0;
        int clientes_atendidos = 0;

        int fin = -1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una venta: ");
      

        
        while(fin != 0){
            System.out.println("El importe es: ");
            venta = scanner.nextInt();
           
            clientes_atendidos ++; 
            ventas_totales = ventas_totales + venta;
            
            if(venta>500){
                System.out.println(mnsj_especial);
            }
            
            System.out.println("¿Hay clientes?");
            fin = scanner.nextInt();
            
            
            
        }
        
        
        /*Estamos en un almacén de cajas:

Se meten cajas en camiones hasta que no queden cajas. 

Existen las cajas pequeñas que pesan menos de 8 kilos
Las cajas grandes que pesan 8 kilos o más
Las cajas frágiles que da igual lo que pesen.

Si la caja es pequeña se mete en un camión A 
Si la caja es grande se mete en un camión B

Al final del programa queremos saber  cuántas cajas frágiles se han metido en los camiones, cuánto peso lleva el camión A y cuanto el B. */ 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
