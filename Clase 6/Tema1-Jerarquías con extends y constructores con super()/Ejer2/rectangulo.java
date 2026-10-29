public class rectangulo extends figura{
    private double altura;
    private double base;
    
    public rectangulo(String nombre, double altura, double base){
        super(nombre);
        setAltura(altura);
        setBase(base);
    }    

     public double getAltura(){
        return altura;
    }

     public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public void setBase(double base){
        this.base=base;
    }
}
