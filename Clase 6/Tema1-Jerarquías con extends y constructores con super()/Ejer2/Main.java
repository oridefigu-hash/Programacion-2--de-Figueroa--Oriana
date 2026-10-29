public class Main{

    public static void main(String[] args){
        figura Figu1= new circulo("círculo", 4.5 );
        figura Figu2= new rectangulo("rectángulo", 5.2, 11.0);
        //No quise instanciar figura pq en sí es genérsica y no representa nada

        System.out.println("Nombre:" + Figu1.getnombre());

        circulo c= (circulo) Figu1;
        System.out.println("Radio: "+ c.getRadio());

        System.out.println("Nombre:" + Figu2.getnombre());

        rectangulo r= (rectangulo) Figu2;
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Base: "+ r.getBase());
    }
}