import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int teste=1;
        while(teste==1) {
            System.out.println("insira um numero de 1 á 4 : ");
            int numero = sc.nextInt();
            if (numero == 1) {
                imprimirverao();
            } else if (numero == 2) {
                imprimiroutono();
            } else if (numero == 3) {
                imprimirinverno();
            } else if (numero == 4) {
                imprimirprimavera();
            } else {
                System.out.println("valor invalido!!!");
            }
        }
    }

    public static void imprimirverao() {
        System.out.println("é verao e esta calor!");
    }

    public static void imprimiroutono() {
        System.out.println("é outono e as folhas caem!!");
    }

    public static void imprimirinverno() {
        System.out.println("é inverno e ta gelado para um caraleo!!");
    }

    public static void imprimirprimavera() {
        System.out.println("é primavera e a natureza esta maravilhosa!!");

    }
}
