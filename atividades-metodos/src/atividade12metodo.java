import java.util.Scanner;

public class atividade12metodo {


  Scanner sc= new Scanner(System.in);

        public static char verificarpalavra(String palavra) {

            if (palavra.length() % 2 == 0) {
                return palavra.charAt(0);
            }
            else {
                return palavra.charAt(1);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite uma palavra:");
            String palavra = sc.nextLine();

            System.out.println("Resultado: " + verificarpalavra(palavra));

            sc.close();
        }
    }

