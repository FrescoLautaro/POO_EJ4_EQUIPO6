package poo_4;


import java.util.ArrayList;

public class Desayuno {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente>listaI = new ArrayList<>();
    private int numeroDesayuno;

    public Desayuno(String nombre, ArrayList<Ingrediente> listaI, int num) {
        this.numeroDesayuno = num; 
        this.listaI = listaI;
        this.nombre = nombre;
    }
    public double precioTotal()
    {
        double total = 0.0;
        for (Ingrediente i:listaI) {
            total += i.getCosto();
        }
        this.precio = total;
        return total;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getListaI() {
        return listaI;
    }

    public void setListaI(ArrayList<Ingrediente> listaI) {
        this.listaI = listaI;
    }

    public int getNumeroDesayuno() {
        return numeroDesayuno;
    }

    public void setNumeroDesayuno(int numeroDesayuno) {
        this.numeroDesayuno = numeroDesayuno;
    }
    

    @Override
    public String toString() {
        return "nombre: " + nombre +"( "+this.detalleT()+ ")" +"..............$" + precio ;
    }

    private String detalleT() {
        String extra = "";
        for (Ingrediente i: listaI) {
            extra += i.getNombre() + " / ";
        }
        return extra;
    }

    
    
}
