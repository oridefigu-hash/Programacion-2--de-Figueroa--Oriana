//el metodo podría estar dentro del main pero así queda más ordenado
public class Calculadora{
    public static double TotalArea(figura[] figuras){
    
        double total =0;
        
        for (figura f: figuras){
            total+= f.calcularArea();
        }
        return total;






    }
}