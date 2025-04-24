import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Jugadores con datos quemados
//Crear instancia Jugador
        Jugador jugador1=new Jugador("Critiano Ronaldo","Delantero",40,7);
        Jugador jugador2=new Jugador("Luis Suarez     ","Delantero",38,9);

// Jugadores con Scanner
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador:");
        String nombre = leer.nextLine();

        System.out.println("Ingrese la posición del jugador:");
        String posicion = leer.nextLine();

        System.out.println("Ingrese la edad del jugador:");
        int edad = leer.nextInt();

        System.out.println("Ingrese el número de camiseta:");
        int numCamiseta = leer.nextInt();

        Jugador jugador3 = new Jugador(nombre, posicion, edad, numCamiseta);

        //Llamar metodo registro
        System.out.println("---------------------------REGISTRO--------------------------");
        System.out.println("|     Nombre      |  Posicion |  Edad  | Numero de Camiseta  |");
        System.out.println("-------------------------------------------------------------");

        jugador1.registro();
        jugador2.registro();
        jugador3.registro();
    }
}