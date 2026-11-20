public class triangulo extends figura{
    private double a,b,c;

    public triangulo(String nombre, double a, double b, double c){
        super(nombre);
        SetLadosTri(a,b,c);
        
    }

    //getters

    public double getLadoA(){
        return a;

    }
    public double getLadoB(){
        return b;

    }

    public double getLadoC(){
        return c;

    }

    //setter

    public void SetLadosTri(double a, double b, double c){

        if (a <= 0 || b<= 0 || c<= 0){
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }

        if (a >= b+c || b >= a+c || c >= a+b){
            throw new IllegalArgumentException("No cumple com la condición de desigualdad triangular");
        }

        this.a= a;
        this.b= b;
        this.c= c;
    }

     @Override
    public double calcularArea(){
        
        double s= (a+b+c)/ 2; //S es el semiperimetro
        
        return (s *(s-a) *(s-b)* (s-c)); //utilizamos formula de heron

    }
   
}

/*
se usa la formula de heron porque desconocemos la altura y se obtiene del area si queremos utilizar la formula clásica

*/