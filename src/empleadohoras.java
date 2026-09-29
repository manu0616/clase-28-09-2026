public class empleadohoras extends empleado{

    private int horastrabajadas;

    public empleadohoras() {
    }

    public empleadohoras(String nombre, String identificacion, double salariobase, int horastrabajadas) {
        super(nombre, identificacion, salariobase);
        this.horastrabajadas = horastrabajadas;
    }



    @Override
    public double calcularpago() {
        return 0;
    }
}
