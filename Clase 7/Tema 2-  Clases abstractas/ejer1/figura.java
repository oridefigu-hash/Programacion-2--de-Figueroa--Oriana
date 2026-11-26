public abstract class figura{ //abstract en la clase impide instanciarla. Si una clase tiene un método abstracto, debe ser abstracta. Lo inverso no es cierto: una clase abstracta puede tener cero métodos abstractos
    private String nombre;

    public figura(String nombre){
       this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void SetNombre(String nombre){
        this.nombre= nombre;
    }
    
    public abstract double calcularArea(); //abstract en el metodo tampoco permite que se implemente 
    

}