public class Main{
    public static void main(String[] args) { //es un metodo de la clase main. Es el metodo principal que se ejecuta al correr el programa
       Persona p1 = new Persona("Oriana de Figueroa", 45099853, 22);
       Persona p2 = new Persona("Julian Alvarez", 39099673, 25);
       Persona p3 = new Persona("Eli Speranza", 27890456, 51);
       Persona p4 = new Persona("Lautaro Silva", 44802862, 23);

       System.out.println(p1); // también se puede escribir System.out.println(p1); ya que el metodo toString() se llama automaticamente
       System.out.println(p2);
       System.out.println(p3);
       System.out.println(p4);
    }
}