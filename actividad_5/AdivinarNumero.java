package actividad_5;

import java.util.Scanner;

public class AdivinarNumero {
    /*
        Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
    */
    public static void main (String[] args) {
        Scanner lecturaDato = new Scanner(System.in);

        Integer numeroAleatorio = (int)((Math.random() * 100) + 1);

        Integer numeroUsuario = 0;

        while (numeroUsuario != numeroAleatorio){
            System.out.println("Ingrese un numero del 1 al 100:");
            numeroUsuario = (int) lecturaDato.nextDouble();
        }

        System.out.println("Adivinaste! el numero era: " + numeroAleatorio);


    }
}
