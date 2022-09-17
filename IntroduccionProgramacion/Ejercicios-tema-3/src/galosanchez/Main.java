package galosanchez;

public class Main {
    public static void main(String[] args) {
        suma(10,22,1);
        Coche coche = new Coche();
        coche.incrementPuerta();
        coche.incrementPuerta();
        System.out.println(coche.numeroPuertas);
    }
    private static void suma(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
}
class Coche {
    int numeroPuertas;
    public void incrementPuerta(){
        numeroPuertas++;
    }
}
