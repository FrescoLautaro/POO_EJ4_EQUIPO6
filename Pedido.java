package poo_breakfast;
import java.util.ArrayList;


public class Pedido {
    private double importe;
    private ArrayList<Desayuno> arrayDesayuno = new ArrayList<>();
    private Cliente cli;


    public Pedido(ArrayList<Desayuno> arrayDesayuno, Cliente cli) {
       
        this.arrayDesayuno = arrayDesayuno;
        this.cli = cli;
       
    }

    public boolean desGratis(){
     if ( this.cli.getCantDesayunos()>10){
         return true;
     }else{       return false;}
     
    }
    
    public void emitirTicket(){
        System.out.println("Desayunos: ");
        
        for(Desayuno d:arrayDesayuno){
            System.out.println(d.toString());
        }   
        System.out.println("Total .....$: "+ this.CalcularImporte());
    }
    
    public double CalcularImporte(){
        
        for(Desayuno d: arrayDesayuno){
              importe+= d.precioTotal(); 
         }
        this.cli.setCantDesayunos(this.cli.getCantDesayunos()+this.arrayDesayuno.size());
        int ultimo=this.arrayDesayuno.size()-1;
        if (desGratis())
        {importe = importe -arrayDesayuno.get(ultimo).getPrecio(); }
        return importe;
        
        }
         //evaluar cuantos desayunos quiere (cantdesayunos) e ir a�adiendo el total de cada desayuno al importe
        //Importe es igual al precio de todos los desayunos
        //Precio es igual al precio de un desayuno
        //llamar a la desgratis
        
      
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
