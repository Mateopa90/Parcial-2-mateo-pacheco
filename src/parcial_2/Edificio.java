package parcial_2;

import java.util.ArrayList;



public class Edificio extends Inmueble{


    private String Propietario;
    private ArrayList<Piso_Oficinas> piso_Oficinas;
    private ArrayList<Oficina> Oficinas;
    private ArrayList<Local_Comercial> Locales;
    
    public Edificio(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String P) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Propietario = P;
    }

    public void AddPiso_Oficinas(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, int Num, double Area){
        Piso_Oficinas PO = new Piso_Oficinas( nombreBarrio, estrato,  valorArriendo, areaConstruida, disponible, Num, Area);
        this.piso_Oficinas.add(PO);
    }
    
    public void AddOficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String TO){
        Oficina o = new Oficina( nombreBarrio,  estrato,  valorArriendo,  areaConstruida,  disponible, TO);
        this.Oficinas.add(o);
    }
    
    public void AddlOCAL_cOMERCIAL(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible){
        Local_Comercial LC = new Local_Comercial( descripcion,  viaPrincipal, nombreBarrio, estrato,  valorArriendo, areaConstruida,  disponible);
        this.Locales.add(LC);
    }
    
    @Override
    public String Dar_Informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }
    
    
}
