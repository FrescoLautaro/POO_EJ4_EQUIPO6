/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_breakfast;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ET36
 */

    public class POO_Breakfast {

    
    public static void main(String[] args) {
        
     Scanner t=new Scanner(System.in);  
     // creo un cliente
     System.out.println("Nombre del cliente?");
     String nombre=t.next();
     System.out.println("acumulados?");
     int acumulados =t.nextInt();
     Cliente cli=new Cliente( nombre, acumulados);
        // Creo un Pedido
     System.out.println("cuantos desayunos lleva hoy el cliente?");
     int cantDesayunos =t.nextInt();
     // Creo lista de ingredientes para un desyuno
     Pedido p1=new Pedido(cantDesayunos,cli);
     p1.emitirTicket();
    
    }
    

    
    
}
