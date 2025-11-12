/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       double costoF= (25);
       int edad;
       int dia_pago;
       double descuento;
       double total;
             
       
       String parroquia;
       String nombre;
       String apellido;
       String usuario;
       
       System.out.println("Ingrese su Nombre");
       nombre= entrada.nextLine();
       
       System.out.println("Ingrese su Apellido");
       apellido= entrada.nextLine();
       
       System.out.println("Ingrese su usuario");
       usuario= entrada.nextLine();
       
       System.out.println("Ingrese su Parroquia");
       parroquia= entrada.nextLine();
       
       System.out.println("Ingrese su edad");
       edad= entrada.nextInt();

       System.out.println("Ingrese su dia de pago");
       dia_pago= entrada.nextInt();
       
       if ((dia_pago < 10) &&
               (parroquia.equals("El Valle") || 
               parroquia.equals("El Sagrario"))){
           descuento= (costoF*0.05);
       total= (costoF-descuento);
       
       
       
       System.out.printf("Recibo\n Nombre: %s\n Apellido: %s\n"
                    + " Usuario: %s\n Edad: %s\n Parroquia: %s\n "
                    + "Día de pago: %s\n Descuento %.2f\n"
                    + " Total a cancelar: %.2f\n", nombre,
                    apellido,
                    usuario,
                    edad,
                    parroquia,
                    dia_pago,
                    descuento,
                    total);
                
    } else {
            System.out.printf("Recibo\n Nombre: %s\n Apellido: %s\n"
                    + " Usuario: %s\n Edad: %s\n Parroquia: %s\n"
                    + " Día de pago: %s\n Total a cancelar: %.2f\n",nombre,
                    apellido, 
                    usuario, 
                    edad, 
                    parroquia,
                    dia_pago,
                    costoF);
  
        }
       }
    }
    


    


