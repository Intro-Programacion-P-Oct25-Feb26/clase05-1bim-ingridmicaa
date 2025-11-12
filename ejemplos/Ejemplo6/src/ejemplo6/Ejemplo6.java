/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       double costoF= 25;
       int edad;
       double dia_pago;
       double descuento= 0.25;
       double total;
             
       
       String parroquia= "El Valle";
       String nombre;
       String apellido;
       String usuario;
       
       System.out.println("Ingrese su Nombre");
       nombre= entrada.nextLine();
       
       System.out.println("Ingrese su Apellido");
       apellido= entrada.nextLine();
       
       System.out.println("Ingrese su usuario");
       usuario= entrada.nextLine();
       
       System.out.println("Ingrese su edad");
       edad= entrada.nextInt();
       
       System.out.println("Ingrese su Parroquia");
       parroquia= entrada.nextLine();
       
       System.out.println("Ingrese su dia de pago");
       dia_pago= entrada.nextDouble();
       
       total= costoF*descuento;
       
       if ((dia_pago < 10) &&
               (parroquia.equals("El Valle") || 
               parroquia.equals("El Sagrario"))){
       
               System.out.printf("%s\n", "descuento aplicado");
       } else {
            System.out.printf("%s\n", "no se aplica descuento");
                

    }
    
}
