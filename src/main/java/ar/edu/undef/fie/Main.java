package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args)
    {

    if (args.length == 0)
    {
        System.out.println("No proporciono elementos");
    } else {

        System.out.print("Ingreso los siguientes argumentos: ");
        for (String argumento : args) {
            System.out.print(argumento + " ");
        }
    }



    }
}