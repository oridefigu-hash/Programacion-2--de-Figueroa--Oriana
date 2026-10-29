public class circulo extends figura{
    private double radio;

    public circulo(String nombre, double radio){
        super(nombre);
        setRadio(radio);
        
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio= radio;
    }
   
}