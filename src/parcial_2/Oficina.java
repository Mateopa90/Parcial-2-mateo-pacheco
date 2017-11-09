package parcial_2;

public class Oficina extends Local {
    private String tipoOficina;

    public Oficina(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.tipoOficina = tipoOficina;
    }
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.valorArriendo + "\n" + 
                "Área construida: " + this.areaConstruida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Tipo de Oficina: " + this.tipoOficina;
        return info;
    }     
}
