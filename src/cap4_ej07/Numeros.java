package cap4_ej07;

public class Numeros {
    
    protected static String Comparar(double A, double B){
        String comparar;
        if (A > B){
            comparar = "\nA es mayor que B";    
        } else if (A < B){
            comparar = "\nA es menor que B";
        } else{
            comparar = "\nA es igual que B";
        }
        return comparar;
    }

}