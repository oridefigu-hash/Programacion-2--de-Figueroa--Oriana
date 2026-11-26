public class rectangulo extends figura{
    private double lado;
    private double altura;

    public rectangulo(String nombre, double lado, double altura){
        super(nombre);
        setLados(altura, lado);

    }

    //getter

    public double getLado(){
        return lado;
    }

     public double getAltura(){
        return altura;
    }
    
    //setter

    public void setLados(double altura, double lado){
        if (lado <= 0 || altura <= 0){
            throw new IllegalArgumentException("Los valores deben ser positivos");
        }

        this.lado= lado;
        this.altura= altura;

    }


    @Override
    public double calcularArea(){
        return lado*altura;

    }


}