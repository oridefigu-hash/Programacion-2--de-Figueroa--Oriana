
public class auto extends vehiculo{
    private int cant_puertas;

    public auto(String marca, String modelo, int año, int cant_puertas){
        super(marca,modelo,año);
        this.cant_puertas= cant_puertas;
    }

    public String toString(){   //funcion toString escribe, devuelve valores
        return super.toString()+", "+ cant_puertas+ " puertas";

    }


}