class CuentaBancaria{
    private String titular;
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int nroCuenta, double saldo){
        setTitular(titular);
        this.nroCuenta= nroCuenta;
        setSaldo(saldo);

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
     
     
}