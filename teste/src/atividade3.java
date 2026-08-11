import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informe seu peso : ");
        double peso = sc.nextDouble();
        System.out.println("informe sua altura : ");
        double altura = sc.nextDouble();

        double pesoimc= peso / (altura * altura); //ou Math.pow(altura,2);
        if (pesoimc<=18.5){
            System.out.println("voce esta em estado de magreza!!!!");

        } else if (pesoimc>=18.5 & pesoimc<=24.9) {
            System.out.println("voce esta saudavel!!!");
        } else if (pesoimc>=25.0 & pesoimc<=29.9) {
            System.out.println("voce esta em sobre peso!!!");
        } else if (pesoimc>=30.0 & pesoimc<=34.9) {
            System.out.println("voce esta em obesidade grau 1!!!");
        }else if (pesoimc>=35.0 & pesoimc<=39.9) {
            System.out.println("voce esta em obesidade grau 2(severa)!!!");
        } if (pesoimc>40.0) {
            System.out.println("voce esta em obesidade grau 3(morbida)!!!");
        }




    }
}
