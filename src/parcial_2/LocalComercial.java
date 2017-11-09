package parcial_2;

public class LocalComercial extends Local{
    
    private String descripcion;
    private boolean viaPrincipal;

    public LocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }
    
    public String darInformacion(){
        String info = "Nombre: " + this.;
    }

}    
