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
     System.out.println("Cuantos desayunos tenes acumulados?");
     int acumulados =t.nextInt();
     Cliente cli=new Cliente( nombre, acumulados);
     
     System.out.println("cuantos desayunos lleva el cliente?");
      int compraD =t.nextInt();
     // Creo lista de ingredientes para un desyuno
     ArrayList<Ingrediente> listaI=new ArrayList();
     ArrayList<Desayuno> listaD=new ArrayList();
     cargarListaD(listaD, listaI, compraD);
   
   // Creo un Pedido
   Pedido p1=new Pedido(listaD,cli);
   p1.emitirTicket();
    
    }

    private static ArrayList<Ingrediente>  cargarIngrediente( int cantI) {
      ArrayList<Ingrediente> lista=new ArrayList();
      Scanner t=new Scanner(System.in);  
      String nombre=" ";  
      double precio=0;   
        for (int i = 0; i < cantI; i++) {
            System.out.println("Ingrediente?");
            nombre=t.next();
            System.out.println("Precio?");
            precio=t.nextDouble();
            lista.add(new Ingrediente(nombre,precio));
        }
       return lista;
    }

    private static void cargarListaD(ArrayList<Desayuno> listaD, ArrayList<Ingrediente> listaI, int cantDesayunos) {
     
       Scanner t=new Scanner(System.in);  
      String n=" ";  
      int cantI=0;
        for (int i = 0; i < cantDesayunos; i++) {
           System.out.println("Nombre desayuno?");
           n=t.next();
            System.out.println("cantidad de Ingredientes?");
            cantI=t.nextInt();
           ArrayList <Ingrediente> lista=cargarIngrediente(cantI);
           listaD.add( new Desayuno(n,lista));           
        }
    
       
        
    }
    
}
