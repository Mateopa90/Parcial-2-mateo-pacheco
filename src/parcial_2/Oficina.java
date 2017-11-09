package parcial_2;



public class Oficina extends Local{

    private String Tipo_Oficinas;
    
    public Oficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String TO) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Tipo_Oficinas = TO;
    }

    @Override
    public String Dar_Informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTipo_Oficinas() {
        return Tipo_Oficinas;
    }

    public void setTipo_Oficinas(String Tipo_Oficinas) {
        this.Tipo_Oficinas = Tipo_Oficinas;
    }
    
    
}
