public class Empleado {
    // Atributos de la clase
    public String nombre;
    public  String cargo;
    public  double salario;
    public  String fecha;



    // Constructor
    public Empleado(String nombre, String cargo, double salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;

    }

    // Metodo para mostrar informacion del empleado
    public void Registro() {

        System.out.printf("%-20s%-20s%-20.2f%-20s\n", nombre, cargo, salario, fecha);

    }


}
