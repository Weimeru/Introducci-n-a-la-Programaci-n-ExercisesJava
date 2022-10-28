public class Coche {

    int puertas = 2;
    public static void main(String[] args) {
        Coche mercedes = new Coche();
        int puertaMercedes = mercedes.puertas;
        puertaMercedes = increPuertas(puertaMercedes, 1);
        System.out.println(puertaMercedes);
        
    }

    public static int increPuertas(int a, int b){
        return a + b;
    }

    
}
