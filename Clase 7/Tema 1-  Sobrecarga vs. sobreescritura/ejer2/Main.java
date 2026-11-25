    public class Main{

    public static void main(String[] args){

        //cargamos los datos en un arreglo
        
        Empleado[] empleados = {
            new EmpleadoAsalariado("Juan Manuel", 1234, 600000.00, 345987.99),
            new EmpleadoAsalariado("María del Mar", 3895, 645000.34, 345987.99),
            new Empleadoxhoras("Lautaro Martinez", 3345, 6, 5400.00),
            new Empleadoxhoras("Micaela Lopez", 3477, 7, 5400.00),
            new EmpleadoAsalariado("Miguel Fuentes", 5034)
        };

            //utilizamos un for-each para contar el sueldo total de cada empleado de cada tipo
        System.out.println();
        for (Empleado e: empleados){

            System.out.println(e.getnombre()+" "+ e.getlegajo()+" "+"Sueldo bruto: $"+ e.calcularSueldo());

        }



    }

    
}