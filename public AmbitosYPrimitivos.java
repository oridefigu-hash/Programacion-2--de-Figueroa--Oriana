public AmbitosYPrimitivos {
    public static int global= 100;

    public static void intentarModifPrimitivo (int num){
        system.out.println("(Dentro del método) Recibido:"+ num);
        num= num+500;// modifica solo la copia local
        system.out.println("(Dentro del método modificado) modificado a:"+ num);

    }

    publicstatic void main(String[] args){
        int minumero = 10;
        system.out.println("1. Antes de llam,ar al método mi numero vale:"+ minumero);

        intentarModifPrimitivo(minumero); //se envía una copia del valor minumero
        system.out.println("2. Despues de llamar al metodo, mi numero vale: "+ minumero);
        system.out.println("3. Comprobamos que el valor primitivo no cambia");
        system.out.println("4. Variable de clase accesible desde cualquier metodo:"+ global);
    }

}