import java.util.Scanner;

public class atividade10metodo {

    public static String chamarlimite(int limite,int min,int numero){
        if(numero<min){
            return numero+"esta abaixo do limite minimo";
        }else if(numero>limite){
            return  numero+"esta acima do limite maximo";
        }else {
            return numero+"esta dentro dos limites pre estabelecidos";
        }




    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe um limite maximo : ");
        int limite = sc.nextInt();
        System.out.println("informe um limite minimo : ");
        int min= sc.nextInt();
        System.out.println("informe um numero : ");
        int numero = sc.nextInt();
        System.out.println(chamarlimite(limite, min, numero));
    }
}