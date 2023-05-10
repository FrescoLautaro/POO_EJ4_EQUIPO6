
import java.util.ArrayList;


public class Pedido {
    private double importe;
    private ArrayList<Desayuno> arrayDesayuno;
    private Cliente cli;

    public Pedido(double importe, ArrayList<Desayuno> arrayDesayuno, Cliente cli) {
        this.importe = importe;
        this.arrayDesayuno = arrayDesayuno;
        this.cli = cli;
    }

    public boolean desGratis(){
     
       
    }
    
    public void emitirTicket(){
    
    
    }
    
    public double CalcularImporte(){
    
        
        
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
