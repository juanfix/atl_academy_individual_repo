package actividad_7;

import java.util.Arrays;
import java.util.Scanner;

public class CincoNumerosArray {
    /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
    */
    public static void main(String[] args) {
        int[] listaNumeros = new int[5];
        Scanner lecturaDato = new Scanner(System.in);

        for (int contador = 0; contador < listaNumeros.length ; contador++) {
            System.out.println("Ingrese un numero: ");
            listaNumeros[contador] = lecturaDato.nextInt();
        }

        Arrays.stream(listaNumeros).forEach(numero -> System.out.print(numero + " "));
        System.out.println();

        int numeroMayor = listaNumeros[0];
        int numeroMenor = listaNumeros[0];
        int sumaNumeros = 0;

        for (int numero: listaNumeros) {
            sumaNumeros += numero;
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
            if(numero < numeroMenor){
                numeroMenor = numero;
            }
        }

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);
        System.out.println("El promedio es: " + (float) sumaNumeros / listaNumeros.length);


    }
}
