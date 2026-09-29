public abstract class empleado {

    protected  String nombre;
    protected String identificacion;
    protected double salariobase;

    public empleado() {
    }

    public empleado(String nombre, String identificacion, double salariobase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salariobase = salariobase;
    }

    public  void mostrardatos(){
        System.out.println("nombre" + nombre);
        System.out.println("identificacion" + identificacion);
        System.out.println("salario base" + salariobase);


    }

    public abstract  double calcularpago();
}
