public class Jugador {
    //Atributos
    public String nombre, posicion;
    public int edad, numCamiseta;

    //Constructor
    public Jugador(String nombre, String posicion, int edad, int numCamiseta){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad=edad;
        this.numCamiseta=numCamiseta;

    }
    //Metodo para mostrar registtro
    public void registro(){
        System.out.println(nombre+"\t"+posicion+"\t "+edad+"\t\t\t"+numCamiseta);
    }
}
