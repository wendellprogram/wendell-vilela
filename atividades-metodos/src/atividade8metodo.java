import java.util.Scanner;

public class atividade8metodo {
    public static double chamandomedia (double n1,double n2,double n3 ) {


        if (n1 < 0 || n2 < 0 || n3 < 0) {
            return 0;
        } else if (n1 > 10 || n2 > 10 || n3 > 10) {/// //comparativo de valor
            return 0;
        } else {
            double media = (n1 + n2 + n3) / 3;
            return media;
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("informe sua primeira nota : ");
        double n1 = sc.nextDouble();
        System.out.println("informe sua segundda nota : ");
        double n2 = sc.nextDouble();
        System.out.println("informe sua terceira nota : ");
        double n3 = sc.nextDouble();
        System.out.println("sua media : ");
        System.out.println(chamandomedia(n1, n2, n3));
    }
}
