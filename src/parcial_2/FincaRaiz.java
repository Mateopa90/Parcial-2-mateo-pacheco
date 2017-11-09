package parcial_2;

import java.util.ArrayList;
import java.util.TreeMap;

public class FincaRaiz {
    private ArrayList<Persona> clientes;
    private TreeMap <String, Inmueble> inventario;
    
    public FincaRaiz(){
        this.clientes = new ArrayList<>();
        this.inventario = new TreeMap<>();
    }

    public void agregarCliente(Persona persona){
        if(persona.evaluarPersona() == true){
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
    
    
    
    
}
