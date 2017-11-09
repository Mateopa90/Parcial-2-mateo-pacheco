package parcial_2;



public class Oficina extends Local{

    private String Tipo_Oficinas;
    
    public Oficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String TO) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Tipo_Oficinas = TO;
    }

    @Override
    public String Dar_Informacion() {
        String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n" + 
                "Estrato: " + this.Estrato + "\n" + 
                "Valor Arriendo: " + this.Valor_Arriendo + "\n" + 
                "Área construida: " + this.Area_Construida + "\n" + 
                "Disponible: " + this.Arrendado + "\n" + 
                "Tipo de Oficina: " + this.Tipo_Oficinas;
        return info;
    }

    public String getTipo_Oficinas() {
        return Tipo_Oficinas;
    }

    public void setTipo_Oficinas(String Tipo_Oficinas) {
        this.Tipo_Oficinas = Tipo_Oficinas;
    }
    
}