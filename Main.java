import java.time.LocalDate;
import java.time.Period;

public class Main{ // Definición de la clase persona
    private LocalDate FechaNacimiento; // Atributo privado para almacenar la fecha de nacimiento de la persona  
    private String nombre;
    private String direccion;

    
    public static void main(String[]args){
        Main p1 = new Main();// Crear un objeto de la clase persona p1
        p1.setNombre("Juan");
        p1.setDireccion("Calle 123");
        p1.setFechaNacimiento(LocalDate.of(1993, 3, 10)); // Suponiendo que la fecha de nacimiento es el 10 de marzo de 1993

        Main p2 = new Main();// Crear un objeto de la clase persona p2
        p2.setNombre("Ana");
        p2.setDireccion("Calle 124");
        p2.setFechaNacimiento(LocalDate.of(1998, 5, 15)); // Suponiendo que la fecha de nacimiento es el 15 de mayo de 1998
        
        // Mostrar los datos de las personas
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Direccion: " + p1.getDireccion());
        System.out.println("Fecha de Nacimiento: " + p1.getFechaNacimiento());
        System.out.println("Edad: " + p1.getEdad());

        System.out.println("Direccion: " + p2.getDireccion()); 
        System.out.println("Fecha de Nacimiento: " + p2.getFechaNacimiento());
        System.out.println("Edad: " + p2.getEdad());
        System.out.println("Nombre: " + p2.getNombre());
        
        
        //mostrar los metodos de la clase persona como: saludo y fecha de nacimiento
        p1.saludar();
        p1.nacimiento();
        p2. saludar();
        p2.nacimiento();

    }

    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(FechaNacimiento, hoy);
        return periodo.getYears();

    }

    // GET fecha de nacimiento
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    // SET fecha de nacimiento
    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setDireccion(String direccion) { // Método para establecer la dirección de la persona
        this.direccion = direccion;
    }

    public String getDireccion() { // Método para obtener la dirección de la persona
        return this.direccion;
    }


    public void setNombre(String nombre) { // Método para establecer el nombre de la persona
        this.nombre = nombre;
    }
    public String getNombre() { // Método para obtener el nombre de la persona
        return this.nombre;
    }

    public void saludar() { // Método para saludar a la persona
        System.out.println("Hola " + this.nombre + ", tienes " + this.getEdad() + " años y vives en " + this.direccion);
    }
    
    public void nacimiento() { // Método para mostrar la fecha de nacimiento de la persona
        System.out.println("Fecha de Nacimiento: " + this.FechaNacimiento);
    }

}
