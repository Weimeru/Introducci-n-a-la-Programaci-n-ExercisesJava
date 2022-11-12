
public class Main{

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(16, "Lizzie", 3122222, 1000 );
        System.out.println("Soy " + cliente1.nombre + ", tengo " + cliente1.edad + " años y mi telefono es " + cliente1.telefono
        + " y mi credito disponible es " + cliente1.credito + " Pesos");

        Trabajador wei = new Trabajador(34, "Weimeru", 31049216, 150);
        System.out.println("Soy " + wei.nombre + ", tengo " + wei.edad + " años y mi telefono es " + wei.telefono
        + " y mi salario es " + wei.salario + " Pesos");
    } 
}

 class Persona{
    int edad;
    String nombre;
    int telefono;
 }

 class Cliente extends Persona{
     int credito;


     public Cliente(int edad, String nombre, int telefono, int credito){
         this.edad = edad;
         this.nombre = nombre;
         this.telefono = telefono;
         this.credito = credito;
     }
 }

 class Trabajador extends Persona{
     int salario;

     public Trabajador(int edad, String nombre, int telefono, int salario){
        this.edad = edad;
         this.nombre = nombre;
         this.telefono = telefono;
         this.salario = salario; 
     }
 }