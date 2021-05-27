package Ejercitación;

import java.util.Scanner;

public class Ejercicio4 {

    public static void mostrarNumerosPrimos() {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumerosPrimos = 0;

        while(true){
            System.out.print("Ingrese la cantidad de numeros primos a mostrar: ");
            cantidadNumerosPrimos = scanner.nextInt();
            if(cantidadNumerosPrimos > 0){
                break;
            }else{
                System.out.println(cantidadNumerosPrimos);
            }

        }

        calcularNumerosPrimos(cantidadNumerosPrimos);

        scanner.close();
    }

    public static void calcularNumerosPrimos(int cantNumerosPrimos){

        int numerosPrimos = 0;

        for (int i = 2; numerosPrimos < cantNumerosPrimos; i++) {
            boolean primo = true;
            int contador = 2;

            while(primo && contador < i){
                if(i%contador==0){
                    primo = false;
                }
                contador++;
            }

            if(primo){
                numerosPrimos++;
                System.out.println(i);
            }
        }
    }

}
