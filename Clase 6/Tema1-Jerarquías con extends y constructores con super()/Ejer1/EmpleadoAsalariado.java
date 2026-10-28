public class EmpleadoAsalariado extends Empleado{
private double sueldoBase;
private double bono;


public EmpleadoAsalariado(String nombre, int legajo, double sueldoBase, double bono){
    super(nombre, legajo);
    this.sueldoBase= sueldoBase;
    this.bono= bono;

}

@Override 
public double calcularSueldo(){
    return sueldoBase+bono;
}



}