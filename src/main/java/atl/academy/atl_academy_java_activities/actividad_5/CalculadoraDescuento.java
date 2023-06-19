package atl.academy.atl_academy_java_activities.actividad_5;

import java.util.Scanner;
public class CalculadoraDescuento {
    /*
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario.
    */
    public static void main (String[] args) {
        Scanner lecturaDato = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto:");
        double precioOriginal = lecturaDato.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento:");
        double porcentajeDescuento = lecturaDato.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100);

        System.out.println("El precio final del producto con el descuento aplicado es: " + precioFinal);

    }
}
