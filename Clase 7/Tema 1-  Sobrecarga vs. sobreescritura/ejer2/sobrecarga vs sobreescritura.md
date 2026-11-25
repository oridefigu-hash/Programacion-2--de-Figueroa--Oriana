/*
 * # SOBRECARGA (overloading) vs SOBREESCRITURA (overriding)
 *
 * ## SOBRECARGA DE CONSTRUCTOR

 *  - Mismo nombre (EmpleadoAsalariado), DISTINTA firma:
 *      EmpleadoAsalariado(String, int)
 *      EmpleadoAsalariado(String, int, double, double)
 *  - Se resuelve en COMPILACIÓN, según la cantidad y el tipo de los
 *    argumentos que aparecen en el new.
 *  - ejemplo:
 *      new EmpleadoAsalariado("Ana", 101);                 // elige (String, int)
 *      new EmpleadoAsalariado("Luis", 102, 500000, 50000); // elige (String, int, double, double)
 *    El compilador ya sabe qué constructor se ejecutará antes de correr el programa.
 *
 * ## SOBREESCRITURA DE calcularSueldo()
 *  - MISMA firma en superclase y subclase (calcularSueldo(), sin parámetros,
 *    retorna double); la subclase reemplaza la implementación heredada.
 *  - Se resuelve en EJECUCIÓN (binding dinámico), según el tipo REAL del objeto,
 *    no según el tipo de la variable.
 *  - ejemplo:
 *      Empleado e = new EmpleadoAsalariado("Ana", 101, 500000, 50000);
 *      e.calcularSueldo();   // la variable es Empleado, pero se ejecuta
 *                            // la versión de EmpleadoAsalariado: 550000.0
 *    Si e apuntara a otra subclase (p. ej. EmpleadoPorHoras), la misma
 *    línea ejecutaría otro código.
 */