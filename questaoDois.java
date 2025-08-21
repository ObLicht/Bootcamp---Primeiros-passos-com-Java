import java.util.Scanner;
import java.lang.Math;

class questaoDois {
    public static double areaQuadrado(double lado) {
        double area = Math.pow(lado, 2);
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do lado: ");
        double lado = entrada.nextDouble();

        double area = areaQuadrado(lado);
        System.out.printf("A área é: %.1f", area);

        entrada.close();
    }
}