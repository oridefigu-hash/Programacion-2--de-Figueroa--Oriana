public class Main{
 
    public static void main(String[] args) {
        Empleado[] empleadosOrdenados = CreaEmpleado(); //creamos un auxiliar para crearempleados()
       
        System.out.println("Empleados ordenados por legajo de menor a mayor: ");
        System.out.println(); //para dejar un renglon en blanco
        for (Empleado tranajador : empleadosOrdenados) { //recorremos el arreglo de empleados ordenados y mostramos su nombre y legajo 
            System.out.println(tranajador.getNombre() + " - " + tranajador.getLegajo());
        }
    }

    public static Empleado[] CreaEmpleado() { //metodo que crea un arreglo de empleados y los ordena por legajo de menor a mayor. Es estatico porque lo llamamos desde el main que es estático      

        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Oriana", 28064);
        empleados[1] = new Empleado("Micaela", 28674);
        empleados[2] = new Empleado("Lautaro", 25663);
        empleados[3] = new Empleado("Santiago", 23235);

        Empleado[] aux = empleados.clone(); // clone() para crear un arreglo auxiliar y no modificar el original.

        for (int i = 0; i < aux.length - 1; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                if (aux[i].getLegajo() > aux[j].getLegajo()) {
                    Empleado temp = aux[i];
                    aux[i] = aux[j];
                    aux[j] = temp;
                }
            }
        }

        return aux;
    }
}

/* En el caso de que no quiera utilizar el metodo clone() para crear un arreglo auxiliar, puedo crear un arreglo auxiliar de la siguiente manera:
Empleado[] auxiliar = new Empleado[trabajadores.length];

for (int i = 0; i < trabajadores.length; i++) { //recorremos el arreglo de trabajadores y copiamos cada elemento en el arreglo auxiliar
    auxiliar[i] = trabajadores[i];
}
 */