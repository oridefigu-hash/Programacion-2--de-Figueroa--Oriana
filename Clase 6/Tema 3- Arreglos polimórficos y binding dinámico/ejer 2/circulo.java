public class circulo extends figura{
    private double radio;

    public circulo(String nombre, double radio){
        super(nombre);
        SetRadio(radio);
        
    }

    public double getRadio(){
        return radio;

    }

    public void SetRadio(double radio){

        if (radio <= 0){
            throw new IllegalArgumentException("el radio no puede ser negativo");
        }

        this.radio= radio;
    }

     @Override
    public double calcularArea(){
        return Math.PI*radio*radio;

    }
   
}