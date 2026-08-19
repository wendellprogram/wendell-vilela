import java.util.Scanner;

public class atividade8metodo {
    public static double chamandomedia (double n1,double n2,double n3 ){
        double media= (n1+n2+n3)/3;

        return media;
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
