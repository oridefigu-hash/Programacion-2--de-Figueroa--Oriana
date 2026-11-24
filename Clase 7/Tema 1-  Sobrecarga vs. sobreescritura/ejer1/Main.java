public class Main{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
            int r1= calc.operar(2,4); //llamada 1
            double r2= calc.operar(3.7,5.0);// llamada 2
            int r3= calc.operar(1,34,46,33,786,23,55,3,244,845); //llamada 3
       

        System.out.println();

        System.out.println(r1 +" "+ r2 +" "+ r3);
    }
}

/*Java elige la versión en tres fases, y se queda con la primera que encuentra una candidata aplicable:

Coincidencia exacta o ampliación (por ejemplo, int → double), sin boxing ni varargs.
Con boxing/unboxing (int ↔ Integer).
Con varargs. */