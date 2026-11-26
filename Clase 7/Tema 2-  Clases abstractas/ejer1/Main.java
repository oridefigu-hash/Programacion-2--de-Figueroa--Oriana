public class Main{
    public static void main(String[] args){

        figura[] figuras={
            //new figura(), tira error: no puede instanciarse figura por ser una clase abstracta
            new circulo("circulo", 13.5),
            new rectangulo("rectángulo",5.6, 7.0),
            new triangulo("triángulo", 5.0, 6.7, 7.0),
            new circulo("circulo", 6.0)
        };

        System.out.println();
        for (figura f: figuras){
            System.out.printf(f.getNombre()+" "+ "área: %.2f%n ", f.calcularArea());
        }

        System.out.println();
        System.out.printf("Area total: %.2f%n", Calculadora.TotalArea(figuras));

        
        try {
           new triangulo("triangulo", -4, 5, 0);
        } catch (IllegalArgumentException e) {
           System.out.println("Error: "+ e.getMessage());
        }

       
    }

    
   



}