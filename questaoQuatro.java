import java.util.Scanner;
import java.lang.Math;

public class questaoQuatro {

    public static int verificarIdade(int idade1, int idade2) {
        int diferenca = Math.abs(idade1 - idade2);
        return diferenca;
    }


    static class Pessoa {
        String nome;
        int idade;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Digite dois nomes e duas idades de pessoas diferentes:");

        pessoa1.nome = entrada.nextLine();
        pessoa2.nome = entrada.nextLine();

        pessoa1.idade = entrada.nextInt();
        pessoa2.idade = entrada.nextInt();

        int diferenca = verificarIdade(pessoa1.idade, pessoa2.idade);

        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n",
                pessoa1.nome, pessoa2.nome, diferenca);

        entrada.close();
    }
}


