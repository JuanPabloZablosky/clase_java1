package Ejercitación;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ingresarNumerosPares(){
        Scanner scanner = new Scanner(System.in);

        int cantNumerosPares = 0;

        while(true){
            System.out.print("Ingrese un número: ");
            cantNumerosPares = scanner.nextInt();
            if(cantNumerosPares > 0){
                break;
            }else{
                System.out.println(cantNumerosPares);
            }

        }

        Ejercicio1.calcularNumerosPares(cantNumerosPares);

        scanner.close();
    }

    public static void calcularNumerosPares(int cantidadNumerosPares){

        int numerosPares = 0;

        for(int i = 0; numerosPares < cantidadNumerosPares; i++){
            if(i%2==0){
                System.out.println(i);
                numerosPares++;
            }
        }

    }
}

