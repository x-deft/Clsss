package Hi;

public class GradingSystem {
    
    public static void PorcentajeAprobacion(Build[] notes){
        double aprobados = 0;
        double total = 0;
        for(Build fore: notes){
            total++;
            if(fore.getNotas() >=60)
                aprobados++;
        }
        double POrcAprobado = aprobados / total ;
        System.out.print(""+POrcAprobado); 
    }
    
    public static void NotasRegulares(Build[] notes){
        double regulares = 0;
        for(Build fore: notes){
            if(fore.getNotas() >=60 && fore.getNotas()<80)
                regulares++;
        }
        System.out.print(""+regulares); 
    }
    public static void MejorPromedio(){
        
    }
}            

