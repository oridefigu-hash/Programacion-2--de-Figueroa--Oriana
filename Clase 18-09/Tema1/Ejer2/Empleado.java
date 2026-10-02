public class Empleado {
    private  String nombre; // error: sin coloco private no puede utilizarse en el mismo paquete, es decir, no funciona en Main.java, pero si se coloca private puede utilizarse en la misma clase, es decir, funciona en Empleado.java
    private  int legajo;

    public  Empleado(String nombre, int legajo){
        this.nombre = nombre;
        this.legajo = legajo;

    }

    public int getLegajo(){ //tuve que construir un get para poder utilizarlo en otra clase, en el main, ya que private solo se puede utilizar en la misma clase 
        return legajo;
    }

     public String getNombre(){
        return nombre;
    }
    
    public double calcular_sueldo(){
        return 0;
        
    }


   

}
