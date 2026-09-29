public class empleadoHijo extends empleado{

    public empleadoHijo(String nombre, String identificacion, double salariobase) {
        super(nombre, identificacion, salariobase);
    }

    @Override
    public double calcularpago() {
        return salariobase;
    }
}
