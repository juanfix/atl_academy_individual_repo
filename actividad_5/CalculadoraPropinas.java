package actividad_5;

import java.util.Scanner;

public class CalculadoraPropinas {
    /*
        Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
    */
    public static void main (String[] args) {
        Scanner lecturaDato = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta del restaurante:");
        double totalCuenta = lecturaDato.nextDouble();

        System.out.println("Ingrese el porcentaje de propina a dejar:");
        double porcentajePropina = lecturaDato.nextDouble();

        double totalPropina = totalCuenta * (porcentajePropina / 100);

        System.out.println("El monto de la propina es2: " + totalPropina);
    }
}
