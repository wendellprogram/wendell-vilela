import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inscricao;
        String inscricaoMaior = "", inscricaoMenor = "";

        int quantidade = 0;

        double altura;
        double maiorAltura = 0, menorAltura = 0;
        double somaAlturas = 0, media;

        System.out.print("Número de inscrição (0 para encerrar): ");
        inscricao = sc.next();

        while (!inscricao.equals("0")) {//quando ... for difernte de 0 tendeu?

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            if (quantidade == 0) {
                maiorAltura = altura;
                menorAltura = altura;
                inscricaoMaior = inscricao;
                inscricaoMenor = inscricao;
            } else {

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    inscricaoMaior = inscricao;
                }

                if (altura < menorAltura) {
                    menorAltura = altura;
                    inscricaoMenor = inscricao;
                }
            }

            somaAlturas += altura;
            quantidade++;

            System.out.print("Número de inscrição (0 para encerrar): ");
            inscricao = sc.next();
        }

        if (quantidade > 0) {

            media = somaAlturas / quantidade;

            System.out.println("\nAtleta mais alto:");
            System.out.println("Inscrição: " + inscricaoMaior);
            System.out.println("Altura: " + maiorAltura);

            System.out.println("\nAtleta mais baixo:");
            System.out.println("Inscrição: " + inscricaoMenor);
            System.out.println("Altura: " + menorAltura);

            System.out.printf("\nAltura média: %.2f\n", media);
            System.out.println("Quantidade de atletas: " + quantidade);

        } else {
            System.out.println("Nenhum atleta foi cadastrado.");
        }

        sc.close();
    }
}














