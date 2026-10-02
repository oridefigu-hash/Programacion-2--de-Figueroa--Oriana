public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", 123);
        Empleado e2 = new Empleadoxhoras("Maria", 456, 20000, 40);
        Empleado e3 = new EmpleadoxComision("Pedro", 789, 1500000, 50);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}