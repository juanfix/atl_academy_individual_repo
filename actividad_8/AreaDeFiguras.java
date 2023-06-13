package actividad_8;

public class AreaDeFiguras {
    public static void main(String[] args) {
        System.out.println("El area del cuadrado es: " +  calcutateSquareArea(5.5));
        System.out.println("El area del triangulo es: " +  calcutateTriangleArea(5, 10));

    }

    public static double calcutateSquareArea(double side) {
        return side * side;
    }

    public static double calcutateTriangleArea(double base, double height) {
        return (base * height) /2;
    }
}
