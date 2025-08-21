import java.util.Scanner;

public class questaoTres {
    public static double areaRetangulo(double base, double altura){
        double areaRetangulo = base * altura;
        return areaRetangulo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base e a altura:");
        double base = entrada.nextInt();
        double altura = entrada.nextInt();
        double area2 = areaRetangulo(base, altura);
        System.out.printf("A área do Retângulo é: %.2f", area2);
    }
}
