public class Empleado {
    protected String nombre;
    protected int legajo; // si colocamos private tenemos que usar setters y getters

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public double calcularSueldo() { //metodo abztracto
        return 0;
    }

    

}






