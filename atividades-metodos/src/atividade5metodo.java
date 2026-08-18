import java.util.Scanner;

public class atividade5metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero base : ");
        int numerob = sc.nextInt();
        System.out.println("insira um numero : ");
        int numerodois = sc.nextInt();
        System.out.println("insira outro numero : ");
        int numerotres = sc.nextInt();
        numeroprox(numerob, numerodois, numerotres);


    }

    public static void numeroprox(int numerob, int numerodois, int numerotres) {
        double distancia1 = Math.abs(numerob - numerodois);
        double distancia2 = Math.abs(numerob - numerotres);

        if (distancia1 < distancia2) {
            System.out.println(numerodois + " está mais perto de " + numerob);
        } else if (distancia2 < distancia1) {
            System.out.println(numerotres + " está mais perto de " + numerob);
        } else {
            System.out.println("Os dois números estão igualmente perto.");
        }
    }
}
