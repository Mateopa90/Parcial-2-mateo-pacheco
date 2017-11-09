package parcial_2;



public abstract class Inmueble {
    protected String Nombre_Barrio;
    protected int Estrato;
    protected double Valor_Arriendo;
    protected double Area_Construida;
    protected boolean Arrendado;


    public Inmueble(String Nombre_Barrio, int Estrato, double Valor_Arriendo, double Area_Construida, boolean Arrendado) {
        this.Nombre_Barrio = Nombre_Barrio;
        this.Estrato = Estrato;
        this.Valor_Arriendo = Valor_Arriendo;
        this.Area_Construida = Area_Construida;
        this.Arrendado = Arrendado;
    }
    
    public abstract String Dar_Informacion();
}
