import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


                int[] numeros = {10, 25, 7, 18, 30};

                int maior = numeros[0];
                int menor = numeros[0];
                int soma = 0;

                for (int numero : numeros) {
                    if (numero > maior) {
                        maior = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }

                    soma += numero;
                }

                double media = (double) soma / numeros.length;

                System.out.println("Maior elemento: " + maior);
                System.out.println("Menor elemento: " + menor);
                System.out.println("Média dos elementos: " + media);
            }
        }









