package parcial_2;

public class LocalComercial extends Local{
    
    private String descripcion;
    private boolean viaPrincipal;

    public LocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }

    @Override
    public String Dar_Informacion() {
         String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n" + 
                "Estrato: " + this.Estrato + "\n" + 
                "Valor Arriendo: " + this.Valor_Arriendo + "\n" + 
                "Área construida: " + this.Area_Construida + "\n" + 
                "Disponible: " + this.Arrendado + "\n" + 
                "Se encuentra en vía Principal: " + this.viaPrincipal + "\n" + 
                "Descripción: " + this.descripcion;
        return info;
    }

}    
