public class Main{
    public static void main(String[] args){

        figura[] figuras={
            new circulo("circulo", 13.5),
            new rectangulo("rectángulo",5.6, 7.0),
            new triangulo("triángulo", 5.0, 6.7, 7.0),
            new circulo("circulo", 6.0)
        };

        System.out.println();
        for (figura f: figuras){
            System.out.printf(f.getNombre()+" "+ "área: %.2f%n ", f.calcularArea());
        }



    }





}