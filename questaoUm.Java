import java.util.Scanner;
import java.time.Year;

class questaoUm {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        var nome = leitura.nextLine();

        System.out.println("Digite seu ano de nascimento:");
        var ano = leitura.nextInt();
        int anoAtual = Year.now().getValue(); // Assim o ano fica mutável ao presente, sem alteração manual.
        var idade = anoAtual - ano;

        System.out.printf("Olá %s, você tem %d anos\n", nome, idade);

    }
}
//Não leva em conta o mês de de nascimento.
