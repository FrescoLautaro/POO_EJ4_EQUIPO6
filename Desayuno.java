package poo_breakfast;


import java.util.ArrayList;

public class Desayuno {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente>listaI = new ArrayList<>();
   
   
    
    public Desayuno(String nombre, ArrayList<Ingrediente> listaI ) {
        
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

   

    @Override
    public String toString() {
        return "nombre: " + nombre +"( "+this.detalleT()+ ")" +"..............$" + this.precioTotal();
    }

    private String detalleT() {
        String extra = "";
        for (Ingrediente i: listaI) {
            
            extra += i.getNombre() + " / ";
        }
        return extra;
    }

    
    
}
