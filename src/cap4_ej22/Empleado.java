package cap4_ej22;

public class Empleado {
    String nombre; //Nombre del empleado
    double salario_hora; //Salario básico por hora
    double salario; //Salario mensual
    double horas_trabajadas; //Número de horas trabajadas en el mes
    
    Empleado(String nom, double salarioh, double htrabajo){
        nombre = nom;
        salario_hora = salarioh;
        horas_trabajadas = htrabajo;
        salario = salario_hora * horas_trabajadas;
    }
    protected String infoEmpleado(){
        String info_empleado;
        if (salario > 450000){
            info_empleado = 
                    "\nNombre del empleado: " + nombre +
                    "\nSalario mensual del empleado: $ " + salario;
        } else{
            info_empleado =
                    "\nNombre del empleado: " + nombre;
        }
        return info_empleado;
    }

}