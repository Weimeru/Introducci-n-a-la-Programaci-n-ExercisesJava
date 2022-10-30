public class CondSwitch {
    public static void main(String[] args) {
        
        String estacion = "invierno";
        
        switch (estacion){
            case "verano":
               System.out.println("la estacion es Verano");
               break;
            case "otoño":
                System.out.println("la estacion es Otoño");
                break;
            case "invierno":
                System.out.println("la estacion es Invierno");
                break;
            case "primavera":
                System.out.println("la estacion es Primavera");
                break;
            default:
                System.out.println("No es una estacion del año");
        }
    }
    
}
