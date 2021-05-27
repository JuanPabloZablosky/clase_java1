package Ejercitación;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ingresarMultiplos(){
        Scanner scanner = new Scanner(System.in);

        int cantMultiplos = 0;
        int multiplo = 0;

        while(true){
            System.out.print("Ingrese la cantidad de múltiplos a mostrar: ");
            cantMultiplos = scanner.nextInt();

            System.out.print("Ingrese el número cuyos múltiplos quiere mostrar: ");
            multiplo = scanner.nextInt();

            if(multiplo > 0 && cantMultiplos > 0){
                break;
            }else{
                System.out.println(multiplo);
            }

        }

        Ejercicio2.calcularMultiplos(cantMultiplos, multiplo);

        scanner.close();
    }

    public static void calcularMultiplos(int cantidadMultiplos, int multiplo){

        int multiplos = 0;

        for(int i = 1; multiplos < cantidadMultiplos; i++){
            if(i%multiplo==0){
                System.out.println(i);
                multiplos++;
            }
        }

    }
}

