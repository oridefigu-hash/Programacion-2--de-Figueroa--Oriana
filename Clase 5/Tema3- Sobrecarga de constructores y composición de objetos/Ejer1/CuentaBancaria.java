public class CuentaBancaria{
     private String titular;
    private int nroCuenta;
    private double saldo;

// Constructor 1: recibe los 3 datos
    public CuentaBancaria(String titular, int nroCuenta, double saldo){   //Esto se llama sobrecarga de constructores: tenés varios constructores con el mismo nombre (el de la clase), pero diferentes parámetros.
        setTitular(titular);
        this.nroCuenta= nroCuenta;
        setSaldo(saldo);

    }

    //Constructor 2: recibe solo titular y cuenta

    public CuentaBancaria(String titular, int  nroCuenta){
        this(titular, nroCuenta, 0); //Llamá al otro constructor de esta misma clase, pasándole estos valores.
        //Se utiliza this() para llamar a otro constructor de la misma clase y así evitar duplicar código.
    }

    public String getTitular(){
        return titular;

    }
    public int getNroCuenta(){
        return nroCuenta;

    }

     public double getSaldo(){
        return saldo;

    }

    public void setTitular(String titular){
        if (titular == null || titular.trim().isEmpty()) { //isEmpty() es un método de la clase String que devuelve true si la cadena está vacía, es decir, si no contiene ningún carácter. Tambien podríamos utilizar .trim().isEmpty() para eliminar los espacios en blanco al inicio y al final de la cadena antes de verificar si está vacía.

            throw new IllegalArgumentException("Error, el nombre no puede estar vacío"); //podría utilizar throw new IllegalArgumentException("Error, el nombre no puede estar vacío"); para lanzar una excepción en lugar de imprimir un mensaje de error. En ese caso, interrumpe el programa y no guarda el error en saldo 
            
        }
        this.titular= titular;
    }  

    public void setSaldo(double saldo){
            if (saldo<0) {

                throw new IllegalArgumentException("Error, no debe ser saldo negativo");
            }
      
        this.saldo = saldo;
    }   
        

    public void setNroCuenta(int nroCuenta){
      this.nroCuenta = nroCuenta;

    }
     
    public void Depositar(double monto){
        if (monto <= 0) {
            throw new IllegalArgumentException ("Error: el monto ingresado debe ser mayor a cero");
            
        }
        saldo = monto+saldo;
        System.out.println("Depósito: "+ monto);
        System.out.println("El saldo actual: "+ saldo); //informa el saldo actualizado

    }

    public void Extraer(double monto){
        if (monto > saldo) {

            throw new IllegalArgumentException("Saldo insuficiente");

        } else if (monto<= 0) {
            throw new IllegalArgumentException("Error: el monto debe ser mayor a cero");

            
        }

        saldo= saldo-monto;
    
    }
     
 
}