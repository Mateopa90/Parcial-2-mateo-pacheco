package parcial_2;

import java.util.ArrayList;
import java.util.TreeMap;



public class Finca_Raiz {
    
    private String Nombre;  
    private ArrayList<Persona> clientes;
    private TreeMap <String, Inmueble> inventario;
    
    public Finca_Raiz(String Nombre) {
        this.Nombre = Nombre;
        this.clientes = new ArrayList<>();
        this.inventario = new TreeMap<>();
    }
    
    public void agregarCliente(Persona persona){
        if(persona.Evaluacion_Inquilino() == true){
            clientes.add(persona);
        } else {
            System.out.println("Esta persona no cumple con los requisitos necesarios para "
                    + "alquilar uno de los Inmuebles");
        }
    }
    
    public void agregarLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible){
        LocalComercial l = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.put("Local Comercial", l);
    }
    
    public void agregarOficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String TO){
        Oficina o = new Oficina ( nombreBarrio,  estrato,  valorArriendo,  areaConstruida,  disponible,  TO);
        inventario.put("Oficina", o);
    }
    
    public void agregarPiso(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, int Num, double Area){
        Piso_Oficinas p = new Piso_Oficinas (nombreBarrio, estrato,  valorArriendo,  areaConstruida,  disponible, Num,  Area);
        inventario.put("Piso", p);
    }
    
    
}
