void main() {

    empleadoHijo e1 = new empleadoHijo("pedro", "8496", 1500000);

    empleadohoras e2 = new empleadohoras("juan ", "1075", 1250000, 45);
    System.out.println("empleado hijo");
    e1.mostrardatos();
    System.out.println(e1.calcularpago());


    System.out.println("empleado hijo");
    e2.mostrardatos();
    System.out.println(e2.calcularpago());




}
