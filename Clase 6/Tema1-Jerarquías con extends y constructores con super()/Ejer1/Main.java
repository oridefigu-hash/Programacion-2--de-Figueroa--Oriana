public class Main{

    public static void main(String[] args){
        Empleado E1 = new Empleado("Juan", 1234);
        Empleado E2 = new Empleadoxhoras("Alejandra", 1244, 7, 15000.0 );
        Empleado E3 = new EmpleadoAsalariado("Mariano", 2348, 678000.84, 250000.59);


        System.out.println(E1); //llama a un empleado de clase padre
        System.out.println(E2); //instancia a un empleado que trabaja por horas
        System.out.println(E3); // instancia a un empleado asalariado
    }

    
}