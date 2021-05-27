package Ejercitación;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void mostrarNumerosNaturales() {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumerosNaturales = 0;
        int cantidadDigitos = 0;
        int digito = 0;

        while(true) {
            System.out.print("Ingrese la cantidad de numeros naturales a mostrar: ");
            cantidadNumerosNaturales = scanner.nextInt();

            System.out.print("Ingrese la cantidad de digitos a mostrar: ");
            cantidadDigitos = scanner.nextInt();

            System.out.print("Ingrese el digito a mostrar: ");
            digito = scanner.nextInt();

            if (cantidadNumerosNaturales > 0 && cantidadDigitos > 0 && digito > 0) {
                break;
            } else {
                System.out.println("Ingrese valores mayores a cero.");
            }
        }

        calcularNumerosNaturales(cantidadNumerosNaturales, cantidadDigitos, digito);

        scanner.close();
    }

    public static void calcularNumerosNaturales(int cantNumNat, int cantDigitos, int digito){
        int numerosNaturales = 0;
        int i = 0;

        while(numerosNaturales < cantNumNat){
            String numeroString = Integer.toString(i);
            char[] arrDigitos = numeroString.toCharArray();

            int contadorRepeticiones = 0;
            for(char c: arrDigitos){
                if(Character.getNumericValue(c) == digito){
                    contadorRepeticiones++;
                }
            }

            if(contadorRepeticiones == cantDigitos){
                System.out.println(i);
                numerosNaturales++;
            }

            i++;
        }
    }

}
