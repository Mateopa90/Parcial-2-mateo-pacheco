package parcial_2;

import java.util.ArrayList;



public class Piso_Oficinas extends Inmueble{

    private int Num_Oficinas;
    private double Area;
    private ArrayList<Oficina> Oficinas;
    
    public Piso_Oficinas(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, int Num, double Area) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Area = Area;
        this.Num_Oficinas = Num;
    }

    public void AddOficina(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible, String TO){
        Oficina o = new Oficina( nombreBarrio,  estrato,  valorArriendo,  areaConstruida,  disponible, TO);
        this.Oficinas.add(o);
    }
    
    @Override
    public String Dar_Informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNum_Oficinas() {
        return Num_Oficinas;
    }

    public void setNum_Oficinas(int Num_Oficinas) {
        this.Num_Oficinas = Num_Oficinas;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }
    
    
    
}
