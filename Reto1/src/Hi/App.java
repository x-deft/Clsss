package Hi;
import java.util.Scanner;
import java.util.*;

public class App {
  
    public static void main(String[] args) {
     
        //Scanner
        Scanner ingreso = new Scanner (System.in);
        ingreso.useLocale(Locale.US);
          
        //crear la matriz
        int columna = 18;
        Build[] CrearNotas = new Build[columna];
        
        //orden de ingreso de datos
        System.out.print("Orden de datos(Nombre,Genero,Materia,Nota)");
        
        //recorrido de matriz
        for (int i=0; i < columna; i++){  
            double nombre = ingreso.nextDouble();
            double genero  = ingreso.nextDouble();
            double materia  = ingreso.nextDouble();
            double notas = ingreso.nextDouble();
            CrearNotas[i] = new Build(nombre,genero,materia, notas);
        }
        
        //llamar a los metodos 
        GradingSystem.PorcentajeAprobacion(CrearNotas);
        GradingSystem.NotasRegulares(CrearNotas);   
    }
}  
