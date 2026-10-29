public class Empleado{

    private String nombre;
    private int legajo;


    //constructor

    public Empleado(String nombre, int legajo){
        setnombre(nombre);
        setlegajo(legajo);

    }


    //getters 
    public String getnombre(){
        return nombre;
    }


    public int getlegajo(){
        return legajo;
    }


    //setters
    public void setnombre(String nombre){

        this.nombre= nombre;

    }

    public void setlegajo(int legajo){

        this.legajo= legajo;

    }

    //Metodo abstracto
    public double calcularSueldo(){
        return 0;    //retorna cerom porque en la clase padre no se implementan los métodos
    }

    
    public String toString(){  //método compartido por todas las subclases
        return "Nombre: " + nombre
        + ", legajo: "+ legajo
        + ", sueldo: "+ calcularSueldo();
    }
}