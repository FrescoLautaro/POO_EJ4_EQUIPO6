
public class Empleado extends Persona {
    private double sB;

    public Empleado(String nombre, double sB) {
        super(nombre);
        this.sB = sB;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sB=" + sB + '}';
    }

    public double getsB() {
        return sB;
    }

    public void setsB(double sB) {
        this.sB = sB;
    }
    
    
}
