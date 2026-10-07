public class Main{
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Elena Robles", 23908, 30000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ivan De Pineda", 25879);

        System.out.println("Titular: "+ cuenta1.getTitular() + 
        ", Numero de cuenta: " + cuenta1.getNroCuenta() 
        + ", Saldo: " + cuenta1.getSaldo() );

        System.out.println();
        
        System.out.println("Titular: "+ cuenta2.getTitular()
         + ", Numero de cuenta: " + cuenta2.getNroCuenta() 
         + ", Saldo: " + cuenta2.getSaldo());


    }
}