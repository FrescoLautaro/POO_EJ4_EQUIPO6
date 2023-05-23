package poo_breakfast;


import java.util.ArrayList;
import java.util.Scanner;

public class Desayuno {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente>listaI = new ArrayList<>();
   
   
  public Desayuno(String nombre, int cantIn ) {
        cargarIngrediente(listaI,cantIn);
        this.listaI = listaI;
        this.nombre = nombre;
       
    }
    private static void cargarIngrediente(ArrayList<Ingrediente> listaI, int cantI) {
       Scanner t=new Scanner(System.in);  
      String nombre=" ";  
      double precio=0;   
        for (int i = 0; i < cantI; i++) {
            System.out.println("Ingrediente?");
            nombre=t.next();
            System.out.println("Precio?");
            precio=t.nextDouble();
            listaI.add(new Ingrediente(nombre,precio)); //Creamos un nuevo objeto de ingrediente que tiene nombre y precio, y se lo añadimos a listaI
        }
      
    }
    
       
    public double precioTotal() //Calcula el precio de cada desayuno recorriendo los costos de cada ingrediente de la listaI y sumandoloo a total
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

    private String detalleT() { //Tiene el detalle de todos los ingredientes de la listaI
        String extra = "";
        for (Ingrediente i: listaI) {
            
            extra += i.getNombre() + " / ";
        }
        return extra;
    }

    
    
}
