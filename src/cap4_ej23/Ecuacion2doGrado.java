package cap4_ej23;

public class Ecuacion2doGrado {
    double A,B,C;
    double d; //Discriminante
    double x1,x2; //Soluciones de la ecuación
    
    Ecuacion2doGrado(double a, double b, double c){
        A = a;
        B = b;
        C = c;
        d = Math.pow(B,2) - 4 * A * C;
    }
    
    protected String SolucionEc(){
        String solucion;
        if (d < 0){
            solucion = "\nLa ecuación de segundo grado no tiene soluciones reales";
        } else if (d == 0){
            x1 = -B / (2 * A);
            solucion = "\nLa ecuación de segundo grado tiene dos soluciones iguales: x1= x2= " + x1;
        } else{
            x1 = (-B + Math.sqrt(d))/ (2 * A);
            x2 = (-B - Math.sqrt(d))/ (2 * A);
            solucion = "\nLa ecuación de segundo grado tiene dos soluciones: x1= " + x1 + " y x2= " + x2;
        }
        return solucion;
    }
    
}