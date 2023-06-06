package actividad_5;

import java.util.Scanner;
public class ConversorMillasKm {
    /*
        Pídele al usuario que ingrese una distancia en millas.
        Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
        Muestra la distancia en kilómetros al usuario.
    */
    public static void main (String[] args) {
        Scanner lecturaDato = new Scanner(System.in);

        System.out.println("Ingrese la distancia en millas:");
        double distanciaMillas = lecturaDato.nextDouble();

        System.out.println("La distancia en kilometros es: " + (distanciaMillas * 1.60934));
    }
}
