import java.util.ArrayList;

public class concesionaria{
    private String nombre;
    private ArrayList <vehiculo> unidad;

    //constructor de consecionaria

    public concesionaria(String nombre){
        this.nombre= nombre;
        this.unidad= new ArrayList<>(); // A partir de la creación de una concesionaria, creamos un arreglo con los vehículos nuevos
    }

    //getter nombre

    public String getNombre(){
        return nombre;
    }

    //metodo que agrega vehiculos a un arreglo desde el main
    public void agregarVehiculo(vehiculo[] unidad){

        for (vehiculo Vehiculos: unidad ){
            this.unidad.add(Vehiculos); //add sirve para agregar algo a un arreglo. this.unidad hace referencia al nombre del arreglo nuevo y lo que está entreparentesis es lo que agregamos
            System.out.println();
            System.out.println("Se agrego el vehiculo: " + Vehiculos.getMarca() + " " + Vehiculos.getModelo() + " con un valor de: " + Vehiculos.getPrecio());
        }


    }


    //metodo que busca la marca solicitada y si no existe retorna null

    public vehiculo buscarPorMarca(String marca){ //(retorna el primer Vehiculo encontrado o null) Recibe la marca que quiere buscar
        for (vehiculo Vehiculos: unidad){
            if(Vehiculos.getMarca().equals(marca)){
                return Vehiculos;
            }

        }

        return null; 
    }

    //metodo que calcula el valor total del stock
    
    public double valorTotalStock(){ //este no recibe nada
        double total =0;
        for(vehiculo Vehiculos: unidad){
            total+= Vehiculos.getPrecio(); //recorre y suma todos los precios del arreglo
        }
        return total;

    }

}