import java.io.BufferedReader; //nos permite leer un archivo de texto línea por línea.
import java.io.FileReader; //nos permite abrrir una archivo
import java.io.IOException; //sirve para manejar posibles errores al leer el archivo.
import java.util.ArrayList;
import java.util.List;

public class PredictorMarkovSimple {

    public static void main(String[] args) throws IOException {

        // Leer el archivo y guardar todas las palabras en una lista, en el orden en que aparecen
        List<String> palabras = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader("La pregunta de sus ojos.txt"));
        String linea;
        while ((linea = lector.readLine()) != null) { //lector.readLine() lee una línea del archivo. y Si llegamos al final del archivo, devuelve null y termina el while.
            linea = linea.toLowerCase().replaceAll("[.,;:!?\"()]", ""); //toLowerCase(): convierte todas las letras a minúsculas.replaceAll(...): elimina signos de puntuación como puntos, comas, dos puntos, etc.
            for (String palabra : linea.split("\\s+")) { //linea.split("\\s+")Divide la línea en palabras.
                if (!palabra.isEmpty()) {  //verifica que la palabra no esté vacía 
                    palabras.add(palabra);
                }
            }
        }
        lector.close();

        // Elegir una palabra inicial al azar entre todas las del texto
        String actual = palabras.get((int) (Math.random() * palabras.size())); //Math.random()  Genera un número decimal aleatorio entre 0 (incluido) y 1 (excluido),  ej: 0.25 y Math.random() * palabras.size() Multiplicamos ese número por la cantidad de palabras que tenemos.

        //Si tenemos 50 palabras y el número aleatorio fue 0.25: 0.25 * 50 = 12.5, (int) 12.5 = 12 entero. Finalmente; palabras.get(12). Obtenemos la palabra que está en la posición 12 de la lista.

        /*¿Qué conseguimos?

        Elegimos una palabra inicial al azar entre todas las palabras del texto.*/
        StringBuilder textoGenerado = new StringBuilder(actual); //Creamos un StringBuilder para ir construyendo el texto generado. 

        // Generar 20 palabras más, una por vuelta
        for (int contador = 0; contador < 20; contador++) { //queremos generar 20 palabras adicionales después de la palabra inicial.

            // RecorrerTODO el texto buscando cada vez que aparece "actual",
            // y guardar la palabra que la siguió en cada una de esas veces
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) { //usamos palabras.size() - 1 Porque vamos a consultar también la posición siguiente (i + 1).
                if (palabras.get(i).equals(actual)) {
                    posiblesSiguientes.add(palabras.get(i + 1)); //Agregamos a nuestra lista la palabra que está inmediatamente después.
                }
            }

            // Si "actual" nunca apareció seguida de otra palabra, se corta acá
            if (posiblesSiguientes.isEmpty()) { //Esto verifica si nuestra lista quedó vacía. Puede pasar que una palabra aparezca al final del texto y no tenga otra palabra después.
                break;
            }

            // Elegir una al azar entre las encontradas, y esa pasa a ser la nueva palabra actual
            String siguiente = posiblesSiguientes.get((int) (Math.random() * posiblesSiguientes.size())); //Esta línea hace algo parecido a lo que hicimos cuando elegimos la palabra inicial. Pero ahora elegimos una palabra de la lista posiblesSiguientes.
            textoGenerado.append(" ").append(siguiente); // Agregamos un espacio y después la palabra que elegimos. append() es un método de la clase StringBuilder que sirve para agregar contenido al final de un texto.
            actual = siguiente; //Actualizamos nuestra palabra actual.
        }

        System.out.println();

        System.out.println("Texto generado: " + textoGenerado); //mostramos el texto que construimos.
    }
}

/*Aclaración: El resultado puede cambiar cada vez que ejecutamos el programa porque usamos Math.random(). 
En este caso sin usar la funcion hashmap
 */
