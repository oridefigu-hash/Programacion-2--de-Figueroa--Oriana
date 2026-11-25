public class EmpleadoAsalariado extends Empleado{
private double sueldoBase;
private double bono;


public EmpleadoAsalariado(String nombre, int legajo, double sueldoBase, double bono){
    super(nombre, legajo);
    this.sueldoBase= sueldoBase;
    this.bono= bono;

}

//overloaded del contructor
public EmpleadoAsalariado(String nombre, int legajo){
    this(nombre, legajo, 0, 0); //establece un constructor donde el empleado es nuevo y no tiene sueldbase ni un bono. Por defecto coloca 0
}

public double calcularSueldo(){
    return sueldoBase + bono; 

}

}