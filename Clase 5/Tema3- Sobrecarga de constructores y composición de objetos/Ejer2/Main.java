public class Main{

    public static void main(String[] args){

        //crear concesionaria
        concesionaria c1 = new concesionaria ("Concesionaria: CosmoAuto");

        //creamos stock
        vehiculo [] lista ={
            new vehiculo("Toyota", "yaris", 42000000.98),
            new vehiculo("Peugeot", "308", 35000000.00),
            new vehiculo("Renault", "Captur", 33500000.89),
            new vehiculo("Chevrolet", "cruze", 48900000.00),
            new vehiculo("Fiat", "Toro", 50000000.00),
        };

        c1.agregarVehiculo(lista);
        System.out.println();

        double total = c1.valorTotalStock();
        System.out.println("Valor total del stock: $"+total);


        System.out.println();

       //prueba de vehiculo existente
       vehiculo foundVehiculo = c1.buscarPorMarca("Honda");
    
        if (foundVehiculo != null){
            System.out.println( 

                "Vehículo: "+ foundVehiculo.getMarca()
                 +"/ "
                 +"Modelo: " + foundVehiculo.getModelo()
            );

        } else {
            System.out.println("Vehículo no encontrado");

        }

    }

    

}