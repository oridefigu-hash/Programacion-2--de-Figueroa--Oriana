
public class moto extends vehiculo{
    private int cilindradas;

    public moto(String marca, String modelo, int año, int cilindradas){
        super(marca,modelo,año);
        this.cilindradas= cilindradas;
    }

    public String toString(){   //funcion toString escribe, devuelve valores
        return super.toString()+", "+ cilindradas + " cilindradas ";

    }


}