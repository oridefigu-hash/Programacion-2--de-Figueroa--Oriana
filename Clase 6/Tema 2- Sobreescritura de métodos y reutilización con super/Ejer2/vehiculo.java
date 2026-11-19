public class vehiculo{

    private String marca;
    private String modelo;
    private int año;

    public vehiculo(String marca, String modelo, int año){
        this.marca=  marca;
        this.modelo= modelo;
        this.año= año;

    }
    
    public String toString(){ //esta funcion es generica y aparece en todas las subclases

        return marca+" "+ modelo +" "+ año;
    }


    
}