public class vehiculo{
    private String marca;
    private String modelo;
    private double precio;

    //constructor
    
    public vehiculo(String marca, String modelo, double precio){

        this.marca = marca;
        this.modelo= modelo;
        this.precio= precio;

    }

    //getters
    public String getMarca(){
        return marca;
    } 

    public String getModelo(){
        return modelo;
    } 

    public double getPrecio(){
        return precio;
    } 
}