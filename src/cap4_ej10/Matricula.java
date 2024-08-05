package cap4_ej10;

public class Matricula {
    String NI; //Número de inscripción
    String NOM; // Nombre
    double PAT; //Patrimonio
    int EST; //Estrato social
    double pagoMatricula;//Valor a pagar de la matrícula
    
    Matricula(String ni, String nom, double pat, int est){
        NI = ni;
        NOM = nom;
        PAT = pat;
        EST = est;
        pagoMatricula = 50000;
    }
    
    protected double pagoMatricula(){
        if (PAT > 2000000 && EST > 3){
            pagoMatricula = pagoMatricula + 0.03 * PAT;
        }
        return pagoMatricula;
    }    

}