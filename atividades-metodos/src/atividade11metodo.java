import java.util.Scanner;

public class atividade11metodo {
    Scanner sc = new Scanner(System.in);

    // a) Método que encontra o maior valor
    public static int maior(int[] vetor) {
        int maior = vetor[0];// ou maxvalue e minvalue

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    // b) Método que encontra o menor valor
    public static int chamarmenor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    // c) Método que calcula a média
    public static double chamarmedia(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
/// //ou cria variavel e so joga o return da variavel criada
        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números terá o vetor? ");
        int quantidade = sc.nextInt();

        int[] vetor = new int[quantidade];

        // Usuário escolhe os números
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nMaior elemento: " + maior(vetor));
        System.out.println("Menor elemento: " + chamarmenor(vetor));
        System.out.println("Média: " + chamarmedia(vetor));

        sc.close();
    }
}
