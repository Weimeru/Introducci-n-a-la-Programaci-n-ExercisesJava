public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //constructor
    /**
     * @param edad
     * @param nombre
     * @param telefono
     */
    public Persona(){

    }

    public Persona(int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //setters y getters
    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    } 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(32);
        persona1.setNombre("Carlos");
        persona1.setTelefono(320000000);

        System.out.println("la primer persona se llama: " + persona1.getNombre());
        System.out.println("la edad de " + persona1.getNombre() + " es " + persona1.getEdad());
        System.out.println("el numero de teléfono de " + persona1.getNombre() + " es " + persona1.getTelefono());

        Persona persona2 = new Persona(20, "Alejandra", 3111111 );

        System.out.println("la primer persona se llama: " + persona2.getNombre());
        System.out.println("la edad de " + persona2.getNombre() + " es " + persona2.getEdad());
        System.out.println("el numero de teléfono de " + persona2.getNombre() + " es " + persona2.getTelefono());

    }

    
    

}