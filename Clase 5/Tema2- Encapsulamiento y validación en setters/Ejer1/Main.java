public class Main{

    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria("Oriana", 28064, 5700.0);

        System.out.println("Titular: "+ c1.getTitular());
        System.out.println("Numero de cuenta: "+ c1.getNroCuenta());
        System.out.println("Saldo: "+ c1.getSaldo());


        //probamos en el caso que de error, que el nombre del titular esté vacío y que el saldo sea negativo.

        try{
            c1.setTitular("");
        } catch (IllegalArgumentException e) { // e es una variable que representa la excepción que se ha lanzado. En este caso, es una instancia de la clase IllegalArgumentException, que es una subclase de la clase Exception. La variable e se utiliza para acceder a los métodos y propiedades de la excepción, como getMessage(), que devuelve el mensaje de error asociado a la excepción.
            System.out.println("Error al cambiar el titular: " + e.getMessage()); //message() es un método de la clase Exception que devuelve el mensaje de error asociado a la excepción. En este caso, el mensaje de error es "Error, el nombre no puede estar vacío".
        }

        try{
            c1.setSaldo(-1000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al cambiar el saldo: " + e.getMessage());
        }
        System.out.println("-------------------------------------------------");
        //comprobar que los valores originales se conervan
        System.out.println("Valores originales:");
        System.out.println("Titular: "+ c1.getTitular());
        System.out.println("Saldo: "+ c1.getSaldo());

    }

}