import java.util.Scanner;

public class atividade9metodo {


    public static boolean chamarpar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informe um numero : ");
        int numero = sc.nextInt();
        System.out.println(chamarpar(numero));


    }
}
