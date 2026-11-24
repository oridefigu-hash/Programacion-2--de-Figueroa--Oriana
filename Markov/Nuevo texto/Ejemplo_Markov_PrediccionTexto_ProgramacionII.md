UNIVERSIDAD TECNOLÓGICA NACIONAL FACULTAD REGIONAL RESISTENCIA
Tecnicatura Universitaria en Programación
Asignatura: Programación II (1° Año – 2° Cuatrimestre)
Cátedra: Ing. Juan Manuel Goya / Equipo Docente

# MATERIAL DE ENRIQUECIMIENTO: PREDICCIÓN DE TEXTO CON CADENAS DE MARKOV (VERSIÓN SIMPLE)

Nota: este material no forma parte de la planificación oficial de la cátedra — es una propuesta de enriquecimiento, en la misma línea que la “Clase Especial de Git/GitHub” ya incorporada. Esta es la versión más simple posible: todo el código va dentro de main(), instrucción por instrucción, sin métodos propios y sin HashMap — solo una lista de palabras y un for que la recorre.

## 1. La idea, sin estructuras auxiliares
Para predecir qué palabra viene después de una palabra dada, no hace falta armar ningún mapa de antemano: alcanza con volver a mirar el texto entero cada vez y anotar qué palabra apareció justo después, cada vez que se encontró la palabra actual. Si “el” aparece 4 veces en el texto y 3 de esas veces fue seguida de “perro”, entonces al buscar todas las coincidencias se obtiene una lista con “perro” repetido 3 veces y otra palabra 1 vez — elegir al azar de esa lista ya respeta esa proporción, sin calcular ningún porcentaje.
Generar texto es, entonces: partir de una palabra, buscar en todo el texto las palabras que la siguieron, elegir una al azar, avanzar, y repetir.
Esta versión vuelve a recorrer la lista completa de palabras en cada paso (en vez de guardar de antemano, en un HashMap, quién sigue a quién). Es menos eficiente para un texto muy largo, pero no necesita ninguna estructura de datos más allá de una lista — todo lo que hace falta entender ya se vio en clase.

## 2. Prerrequisitos y ubicación recomendada
Solo usa dos herramientas: ArrayList<String> (Clase 15, Unidad 3) y lectura de un archivo de texto con BufferedReader (Clase 22, Unidad 4). Mismo momento recomendado que antes: después de la Clase 22, como cierre motivador de la Unidad 4, antes de arrancar la Unidad 5.

##3. Código completo
Archivo de entrada, texto.txt:
el perro corre en el parque. el gato duerme en la casa.
el perro juega con la pelota en el parque. el gato mira
al perro desde la ventana. el perro corre y el gato duerme.
Crear el archivo PredictorMarkovSimple.java:
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PredictorMarkovSimple {

    public static void main(String[] args) throws IOException {

        // Leer el archivo y guardar todas las palabras en una lista, en el orden en que aparecen
        List<String> palabras = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));
        String linea;
        while ((linea = lector.readLine()) != null) {
            linea = linea.toLowerCase().replaceAll("[.,;:!?\"()]", "");
            for (String palabra : linea.split("\\s+")) {
                if (!palabra.isEmpty()) {
                    palabras.add(palabra);
                }
            }
        }
        lector.close();

        // Elegir una palabra inicial al azar entre todas las del texto
        String actual = palabras.get((int) (Math.random() * palabras.size()));
        StringBuilder textoGenerado = new StringBuilder(actual);

        // Generar 20 palabras más, una por vuelta
        for (int contador = 0; contador < 20; contador++) {

            // Recorrer TODO el texto buscando cada vez que aparece "actual",
            // y guardar la palabra que la siguió en cada una de esas veces
            List<String> posiblesSiguientes = new ArrayList<>();
            for (int i = 0; i < palabras.size() - 1; i++) {
                if (palabras.get(i).equals(actual)) {
                    posiblesSiguientes.add(palabras.get(i + 1));
                }
            }

            // Si "actual" nunca apareció seguida de otra palabra, se corta acá
            if (posiblesSiguientes.isEmpty()) {
                break;
            }

            // Elegir una al azar entre las encontradas, y esa pasa a ser la nueva palabra actual
            String siguiente = posiblesSiguientes.get((int) (Math.random() * posiblesSiguientes.size()));
            textoGenerado.append(" ").append(siguiente);
            actual = siguiente;
        }

        System.out.println("Texto generado: " + textoGenerado);
    }
}

## 4. Ejemplo de ejecución
El resultado cambia en cada corrida, porque depende de Math.random():
Texto generado: el perro corre y el gato mira al perro desde la ventana el perro juega con la pelota en el parque

## 5. Nota para la clase: el costo de la simplicidad
Buscar “todas las veces que aparece la palabra actual” recorriendo la lista completa, en cada una de las 20 vueltas, es una buena excusa para retomar Big-O (Unidad 1): con un texto de n palabras y k palabras a generar, este programa hace del orden de n × k comparaciones — nada grave para un texto de unos cientos de palabras, pero notoriamente más lento que la versión con HashMap si el texto de entrenamiento fuera muy largo (un libro completo, por ejemplo). Es un buen momento para preguntar al curso: “¿qué estructura de datos usarían para no tener que re-recorrer todo el texto en cada paso?” — la respuesta es exactamente el HashMap<String, List<String>> de la versión completa, que queda como desafío opcional para quien quiera ir más allá.
