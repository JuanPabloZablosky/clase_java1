package Ejercitación;

import java.util.Scanner;

public class Ejercicio3 {

    public static void validarNumeroPrimo() {
        Scanner scanner = new Scanner(System.in);

        int numeroPrimo = 0;
        boolean primo = false;

        System.out.print("Ingrese un numero: ");
        numeroPrimo = scanner.nextInt();

        if (numeroPrimo > 0) {
            primo = esPrimo(numeroPrimo);
        } else {
            System.out.println("Ingrese un número válido.");
        }

        System.out.println("El número es primo?" + primo );
        scanner.close();
    }

    public static boolean esPrimo(int numeroPrimo){
        boolean esPrimo = true;
        int contador = 2;

        while(esPrimo && contador < numeroPrimo){
            if(numeroPrimo%contador==0){
                esPrimo = false;
            }
            contador++;
        }
        return esPrimo;
    }
}
