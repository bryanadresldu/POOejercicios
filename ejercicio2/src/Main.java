import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        //Solicitar los datos por teclado
        System.out.println("Ingrese los datos de 3 empleados:");
        //Empleado 1
            System.out.println("\nEmpleado 1");

            System.out.print("Nombre: ");
            String nombre1 = leer.nextLine();

            System.out.print("Cargo: ");
            String cargo1 = leer.nextLine();

            System.out.print("Salario: ");
            double salario1 = leer.nextDouble();
            leer.nextLine(); // Limpiar el buffer

            System.out.println("Fecha de ingreso (formato AAAA-MM-DD):");
            String fecha1 = leer.nextLine();

        //Empleado 2
        System.out.println("\nEmpleado 2");

        System.out.print("Nombre: ");
        String nombre2 = leer.nextLine();

        System.out.print("Cargo: ");
        String cargo2 = leer.nextLine();

        System.out.print("Salario: ");
        double salario2 = leer.nextDouble();
        leer.nextLine(); // Limpiar el buffer

        System.out.println("Fecha de ingreso (formato AAAA-MM-DD):");
        String fecha2 = leer.nextLine();

        //Empleado 3
        System.out.println("\nEmpleado 3");

        System.out.print("Nombre: ");
        String nombre3 = leer.nextLine();

        System.out.print("Cargo: ");
        String cargo3 = leer.nextLine();

        System.out.print("Salario: ");
        double salario3 = leer.nextDouble();
        leer.nextLine(); // Limpiar el buffer

        System.out.println("Fecha de ingreso (formato AAAA-MM-DD):");
        String fecha3 = leer.nextLine();


        System.out.println("---------------------------REGISTRO--------------------------------");
        System.out.println("|     Nombre      |      Cargo       |  Salario   | Fecha Ingreso  |");
        System.out.println("-------------------------------------------------------------------");
        //Crear la instancia empleado
        Empleado empleado1=new Empleado(nombre1,cargo1,salario1,fecha1);
        Empleado empleado2=new Empleado(nombre2,cargo2,salario2,fecha2);
        Empleado empleado3 =new Empleado(nombre3,cargo3,salario3,fecha3);

        // Llamar al metodo registro
        empleado1.Registro();
        empleado2.Registro();
        empleado3.Registro();
    }
}