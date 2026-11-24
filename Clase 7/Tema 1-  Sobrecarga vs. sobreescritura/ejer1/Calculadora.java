public class Calculadora{
    
    //sobrecarga 1
    public int operar(int a, int b){
        return a+b;
    }

    //sobrecarga 2
    public double operar(double a, double b){
        return a+b;
    }

    //sobrecarga 3
    public int operar(int... valores){
        int total=0;

        for (int v : valores) {
            total+= v;
        }

        return total;
    }
}