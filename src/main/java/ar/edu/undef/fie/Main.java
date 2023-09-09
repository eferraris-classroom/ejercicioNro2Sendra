package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No proporciono elementos");
        } else {

            System.out.print("Ingreso los siguientes argumentos: ");
            for (String argumento : args) {
                System.out.print(argumento + " ");
            }
        }

        System.out.println(" ");

        int pares = 0;
        int impares = 0;

        for (String argumento : args) {
            int numero = Integer.parseInt(argumento);

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de pares es: " + pares);
        System.out.println("La cantidad de impares es: " + impares);

    }
}