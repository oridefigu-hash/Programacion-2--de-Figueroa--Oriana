public class Empleadoxhoras extends Empleado{
private int horasTrabajo;
private double valorHora;

    public Empleadoxhoras(String nombre, int legajo, int horasTrabajo, double valorHora){ //constructor de la clase
        super(nombre, legajo); //inicializa el constructro de la clase padre
        this.horasTrabajo= horasTrabajo;
        this.valorHora= valorHora;
    }

   

            
}

