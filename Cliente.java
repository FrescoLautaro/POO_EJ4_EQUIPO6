package poo_breakfast;


public class Cliente extends Persona{
    
    int acumulados;

    public Cliente(String nombre, int acumulados) {
        super(nombre);
        this.acumulados = acumulados;
    }


    @Override
    public String toString() {
        return "Cliente{" + "acumulados=" + acumulados + '}';
    }

    public int getAcumulados() {
        return acumulados;
    }

   

    public void setCantDesayunos(int acumulados) {
        this.acumulados = acumulados;
    }
    
    
}
