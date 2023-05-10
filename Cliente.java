

public class Cliente extends Persona{
    
   private int cantDesayunos;

    public Cliente(String nombre, int cantDesayunos) {
        super(nombre);
        this.cantDesayunos = cantDesayunos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cantDesayunos=" + cantDesayunos + '}';
    }

    public int getCantDesayunos() {
        return cantDesayunos;
    }

    public void setCantDesayunos(int cantDesayunos) {
        this.cantDesayunos = cantDesayunos;
    }
    
    
}
