import java.util.Scanner;

public class atividade6metodo {

Scanner sc= new Scanner(System.in);


        public static String nomestar(String nome, String sobrenomeMae, String cidade) {

            String[] partesNome = nome.split(" ");

            String primeiroNome = partesNome[0];
            String sobrenome = partesNome[partesNome.length - 1];

            String primeiroNomeStarWars = sobrenome.substring(0, 3)
                    + primeiroNome.substring(0, 2);

            String sobrenomeStarWars = sobrenomeMae.substring(0, 2)
                    + cidade.substring(0, 3);

            return primeiroNomeStarWars + " " + sobrenomeStarWars;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite seu nome completo: ");
            String nome = sc.nextLine();

            System.out.print("Digite o sobrenome de solteira da sua mãe: ");
            String sobrenomeMae = sc.nextLine();

            System.out.print("Digite a cidade onde você nasceu: ");
            String cidade = sc.nextLine();

            String nomeStarWars = nomestar(nome, sobrenomeMae, cidade);

            System.out.println("Seu nome Star Wars é: " + nomeStarWars);

            sc.close();
        }
    }