 public class Empleadoxhoras extends Empleado {
        private double valorHora;
        private int horasTrabajadas;

        public Empleadoxhoras(String nombre, int legajo, double valorHora, int horasTrabajadas) {
            super(nombre, legajo);
            this.valorHora = valorHora;
            this.horasTrabajadas = horasTrabajadas;
        }

        @Override
        public double calcularSueldo() {
            return valorHora * horasTrabajadas;
        }
    
    }