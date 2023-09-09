# EjercicioNro2_Sendra
Ejericio Nro 2 clase 8/9

# Enunciado

Dada una lista de enteros (argumentos) definir cuantos son pares y cuantos son impares


# ingreso de argumentos acomodado

    if (args.length == 0)
        {
            System.out.println("No proporciono elementos");
        } else {
    
            System.out.print("Ingreso los siguientes argumentos: ");
            for (String argumento : args) {
                System.out.print(argumento + " ");
            }
        }

 # Codigo

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

# Terminal

Ingreso los siguientes argumentos: 1 2 3 4 5 6 7 8 9 10 11  
 
La cantidad de pares es: 5

La cantidad de impares es: 6


