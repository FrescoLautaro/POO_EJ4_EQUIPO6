package poo_4;

import java.util.ArrayList;


public class Pedido {
    private double importe;
    private ArrayList<Desayuno> arrayDesayuno = new ArrayList<>();
    private Cliente cli;

    public Pedido(double importe, ArrayList<Desayuno> arrayDesayuno, Cliente cli) {
        this.importe = importe;
        this.arrayDesayuno = arrayDesayuno;
        this.cli = cli;
    }

    public boolean desGratis(Desayuno d){
     if ( d.getNumeroDesayuno()==11){
         return true;
     }
       return false;
    }
    
    public void emitirTicket(){
        System.out.println("Ingredientes: "+ arrayDesayuno.toString()+ "Precio: "+ this.precio );
    
    }
    
    public double CalcularImporte(){
        
        for(Desayuno d: arrayDesayuno){
         if (!desGratis(d)){
            importe+= d.precioTotal(); 
         }
        }
         //evaluar cuantos desayunos quiere (cantdesayunos) e ir añadiendo el total de cada desayuno al importe
        //Importe es igual al precio de todos los desayunos
        //Precio es igual al precio de un desayuno
        //llamar a la desgratis
        
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
