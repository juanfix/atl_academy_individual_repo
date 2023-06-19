package atl.academy.atl_academy_java_activities.actividad_5;

import java.util.Scanner;

public class CalculadoraEdadPerruna {
    /*
      Pídele al usuario que ingrese la edad de su perro.
      Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
    */
    public static void main (String[] args){
        Scanner lecturaDato = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro");
        Integer edadPerro = lecturaDato.nextInt();

        System.out.println("La edad de su perro en edad humana es: " + (edadPerro * 7));

    }
}
