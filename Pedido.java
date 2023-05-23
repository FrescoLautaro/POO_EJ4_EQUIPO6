package poo_breakfast;
import java.util.ArrayList;
import java.util.Scanner;


public class Pedido {
    private double importe;
    private ArrayList<Desayuno> arrayDesayuno = new ArrayList<>();
    private Cliente cli;


    public Pedido(int cantDPedido, Cliente cli) {
       
        cargarListaD(arrayDesayuno,cantDPedido);
        this.cli = cli;
       
    }

    public boolean desGratis(){
    // Valoramos si la cantidad de acumulados del cliente (despues de agregar los que lleva el dia de hoy, son mas de 10, en ese caso retorna true)
     if ( this.cli.getAcumulados()>10){
         return true;
     }else{       return false;}
     
    }
    
    private static void cargarListaD(ArrayList<Desayuno> listaD, int cantDesayunos) { //pasamos el array ListaD y la cantidad de desayunos
      Scanner t=new Scanner(System.in);  
      String n=" ";  
      int cantI=0;
        for (int i = 0; i < cantDesayunos; i++) {
           //Preguntamos el nombre y la cantidad de ingredientes del desayuno y se lo añadimos a la lista D hasta que no haya mas desayunos que añadir
           System.out.println("Nombre desayuno?");
            n=t.next();
            System.out.println("cantidad de Ingredientes?");
            cantI=t.nextInt();
            listaD.add( new Desayuno(n,cantI)); //Creamos un nuevo objeto de Desayuno que tiene nombre y cantidad de ingrediientes, y se lo añadimos a listaD      
        }
    }
    
    
    
    public void emitirTicket(){
        System.out.println("Desayunos: ");
        
        for(Desayuno d:arrayDesayuno){ 
            System.out.println(d.toString()); //Printeamos el to string de la clase desayuno del desayuno en el que nos encontramos del array de desayunos
        }   
        System.out.println("Total .....$: "+ this.CalcularImporte()); //Al final de todos los desayunos mostramos el total llamando a calcular importe
    }
    
    public double CalcularImporte(){
        
        for(Desayuno d: arrayDesayuno){ 
              importe+= d.precioTotal(); ////Se suma el precio total de cada desayuno al importe
         }
        // modifico la cantidad de desayuno acumulados del cliente; 
        // le agrego lo que lleva en este pedido
        this.cli.setCantDesayunos(this.cli.getAcumulados()+this.arrayDesayuno.size());
        int ultimo=this.arrayDesayuno.size()-1; //Calculo cual es el ultimo desayuno
        if (desGratis()) // Si la funcion desGratis retorna true al importe se le resta el ultimo desayuno
        {importe = importe -arrayDesayuno.get(ultimo).getPrecio(); }
        return importe;
        
        }
        
        
      
    public void AgregarDesayuno(Desayuno d){
       arrayDesayuno.add(d);
    }  
  
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public ArrayList<Desayuno> getArrayDesayuno() {
        return arrayDesayuno;
    }

    public void setArrayDesayuno(ArrayList<Desayuno> arrayDesayuno) {
        this.arrayDesayuno = arrayDesayuno;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    

}
