package galosanchez;

public class Main {
    public static void main(String[] args) {

        /*--Ejercicio con IF--*/
        System.out.println("--* Ejercicio con IF *--");
        int numeroIf = -12;
        if(numeroIf == 0){
            System.out.println("El número es "+numeroIf);
        }else if (numeroIf > 0){
            System.out.println("El número "+numeroIf+" es positivo");
        }else {
            System.out.println("El número "+numeroIf+" es negativo");
        }

        /*--Ejercicio con While--*/
        System.out.println("\n--* Ejercicio con While *--");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("numeroWhile = "+numeroWhile);
            numeroWhile++;
        }

        /*--Ejercicio con Do While--*/
        System.out.println("\n--* Ejercicio con Do While *--");
        int numeroDoWhile = 3;
        do {
            System.out.println("numeroWhile = "+numeroWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        /*--Ejercicio con For--*/
        System.out.println("\n--* Ejercicio con For *--");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor+=1){
            System.out.println("numeroFor = "+numeroFor);
        }

        /*--Ejercicio con Switch--*/
        System.out.println("\n--* Ejercicio con Switch *--");
        String estacion = "INVIER";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Estación no reconocida");
        }

    }
}
