package parcial_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileWriteEvent;

public class Parcial2_MateoPacheco {

    public static void main(String[] args) {
        
        Scanner c = new Scanner ( System.in);
        System.out.println("Ruta del archivo");
        String ruta = null;
        ruta = c.next();
        File f = new File(ruta);
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
           try {
               flujoEntrada = new Scanner(lectura);
               flujoEntrada.useDelimiter(",");
               String tipo = null, titulo= null, annio= null, director= null, genero = null;
               int temporada =0, capitulos = 0;
               while(flujoEntrada.hasNext()){
                   tipo = flujoEntrada.next().trim();
                   if(tipo.equals("O")){
                       //code
                   }else if(tipo.equals("PO")){
                       //code
                   }else if(tipo.equals("E")){
                       //code
                   }      
                   }} catch (FileNotFoundException ex) {
               System.out.println(" ");
           }
    }
    }
}
