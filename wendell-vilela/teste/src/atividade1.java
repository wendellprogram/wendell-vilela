import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;
public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("insira sua matricula : ");
        int matricula = sc.nextInt();//sempre que o valor nao for calculavel sempre utilize string (;
        System.out.println("insira seu nome : ");
        String nome= sc.next();
        System.out.println("informe a sua quantidade de horas trabalhadas na semana : ");
        double horas = sc.nextDouble();
        System.out.println("informe o valor que voce recebe por hora :");
        double valor = sc.nextDouble();
        double salario=valor*horas;
        System.out.println(matricula);
        System.out.println(nome);
        //System.out.printf("Você receberá: %.2f R$%n", salario*4);
        System.out.println("vc recebera : R$"+df.format(salario*4));





    }
}
