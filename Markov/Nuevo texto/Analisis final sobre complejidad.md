# Analisis final sobre complejidad

## ¿Por qué decimos que es menos eficiente?

Acá aparece el concepto de complejidad algorítmica que ya vieron en clase.

Recordemos:

    n representa la cantidad de palabras que tiene el texto.

    k representa la cantidad de palabras nuevas que queremos generar.

Cada vez que queremos generar una palabra, recorremos prácticamente toda la lista.

Si tenemos 1.000 palabras en el texto y queremos generar 20 palabras:
1000×20=20.000
1000×20=20.000

Aproximadamente hacemos 20.000 comparaciones.

Si el texto tiene 100.000 palabras:
100.000×20=2.000.000
100.000×20=2.000.000

¡Son muchísimas más comparaciones!

Por eso decimos que su costo es:
O(n×k)
O(n×k)

¿Cómo podríamos mejorarlo?

Podríamos usar un HashMap<String, List<String>>.

La idea sería guardar previamente qué palabras siguen a cada palabra.

Así no tendríamos que recorrer todo el texto cada vez.

Pero eso requiere aprender una estructura de datos más avanzada.

Por eso esta versión es interesante: permite entender el funcionamiento de un predictor de palabras utilizando solamente listas y recorridos.

