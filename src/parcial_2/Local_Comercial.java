package parcial_2;

public class Local_Comercial extends Local{
    
    private String Descripcion;
    private boolean via_Principal;

    public Local_Comercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Descripcion = descripcion;
        this.via_Principal = viaPrincipal;
    }

    @Override
    public String Dar_Informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isVia_Principal() {
        return via_Principal;
    }

    public void setVia_Principal(boolean via_Principal) {
        this.via_Principal = via_Principal;
    }

    
    
}    
