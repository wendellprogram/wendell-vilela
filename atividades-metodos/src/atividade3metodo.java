import java.util.Scanner;

public class atividade3metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero qualquer : ");
        int numero = sc.nextInt();
        chamarnum(numero);


    }public static void chamarnum(int num){

        for (int i = 0; i <=20 ; i++) {
            System.out.println(num+i);
        }

    }
}
