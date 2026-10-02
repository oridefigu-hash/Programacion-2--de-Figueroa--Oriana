public class Persona { //clase principal. Public: utilizable en cualuier metodo o clase
    private String nombre;
    private int edad;
    private int dni; 

    public Persona(String nombre, int edad, int dni){ //metodo constructor que no devuelve nada. Solo inicializa los atributos de persona
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    @Override //sobreescribimos el metodo tostring
    public String toString(){
        return "Nombre: "+ nombre //sino también podría escribirse retur "nombre:"+ nombre + ",edad:"+ edad + ",DNI:"+ dni; todo en un mismo renglon
                +"\nEdad: "+ edad //saltea renglon \n y concatena la edad
                +"\nDNI: "+ dni;                    

    }


}

