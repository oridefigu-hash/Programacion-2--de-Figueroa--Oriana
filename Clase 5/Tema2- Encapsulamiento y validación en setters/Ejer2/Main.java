//import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Oriana de Figueroa", 1234, 5400);

        System.out.println("Titular: "+ cuenta1.getTitular());
        System.out.println("N° de cuenta: " + cuenta1.getNroCuenta());
        System.out.println("Saldo: "+ cuenta1.getSaldo());

        /*Scanner cs = new Scanner(System.in);

        System.out.print("Ingrese el monto a depositar"); //opcion que el cliente ingrese el monto a depositar
        double monto = cs.nextDouble();

        cuenta1.Depositar(monto);*/

        

       //prueba de depósito

       try {

        cuenta1.Depositar(2500);

       } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException("Error al intentar depositar. "+ e.getMessage());
       }

       //prueba extracción
       try {
        cuenta1.Extraer(6000);

       } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException("Error al intentar extraer. "+ e.getMessage());
       }



        //probamos en el caso que de error, que el nombre del titular esté vacío y que el saldo sea negativo.
        /*try{
            cuenta1.setTitular("");
        } catch (IllegalArgumentException e) { // e es una variable que representa la excepción que se ha lanzado. En este caso, es una instancia de la clase IllegalArgumentException, que es una subclase de la clase Exception. La variable e se utiliza para acceder a los métodos y propiedades de la excepción, como getMessage(), que devuelve el mensaje de error asociado a la excepción.
            System.out.println("Error al cambiar el titular: " + e.getMessage()); //message() es un método de la clase Exception que devuelve el mensaje de error asociado a la excepción. En este caso, el mensaje de error es "Error, el nombre no puede estar vacío".
        }


        try{
            cuenta1.setSaldo(-1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al cambiar el saldo: " + e.getMessage());
        } */
        System.out.println("-------------------------------------------------");
        //comprobar que los valores originales se conervan
        System.out.println("Valores originales:");
        System.out.println("Titular: "+ cuenta1.getTitular());
        System.out.println("Saldo: "+ cuenta1.getSaldo());
        

    }
}