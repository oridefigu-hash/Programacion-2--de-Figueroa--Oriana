public class AmbitosYPrimitivos {
    public static int global= 100;

    public static void intentarModifPrimitivo (int num){
        System.out.println("(Dentro del método) Recibido: "+ num);
        num= num+500;// modifica solo la copia local
        System.out.println("(Dentro del método modificado) modificado a: "+ num);

    }

    public static void main(String[] args){
        int minumero = 10;
        System.out.println("1. Antes de llamar al método mi numero vale:"+ minumero);

        intentarModifPrimitivo(minumero); //se envía una copia del valor minumero
        System.out.println("2. Despues de llamar al metodo, mi numero vale: "+ minumero);
        System.out.println("3. Comprobamos que el valor primitivo no cambia");
        System.out.println("4. Variable de clase accesible desde cualquier metodo:"+ global);
    }

}