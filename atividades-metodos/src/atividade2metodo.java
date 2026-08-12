import java.sql.SQLOutput;
import java.util.Scanner;

public class atividade2metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int teste =1;
while (teste==1) {
    System.out.println("insira um nome de um dos coleguinhas do wendellk");
    String nome = sc.next();
    if (nome.equals("bruno") || nome.equals("Bruno")) {
        chamandobruno();
    } else if (nome.equals("otavio") || nome.equals("Otavio")) {
        chamandootavio();
    } else if (nome.equals("cauan") || nome.equals("Cauan")) {
        chamandocauan();
    } else {
        System.out.println("esse mano ai nao é meu colega nao !!!!!");
    }
}

    }
    public static void chamandobruno(){
        System.out.println(" bruno");
        System.out.println("tem 44anos");
    } public static void chamandootavio(){
        System.out.println("otavio");
        System.out.println("tem 5anos pq é um kid");

    } public static void chamandocauan(){
        System.out.println("cauan");
        System.out.println("tem 16anos fds");
    }
}
