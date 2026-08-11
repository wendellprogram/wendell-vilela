import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informe seu nome : ");
        String nome = sc.next();
        System.out.println("informe seu salario fixo : ");
        double salariof = sc.nextDouble();
        System.out.println("informe a quantidades de venda do mes : ");
        double vendas = sc.nextDouble();
        double salariot = (vendas * 0.15);

        System.out.printf("seu salario final será : %.2f R$%n",salariof+salariot);





    }
}
