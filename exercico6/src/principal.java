public class principal {
    public principal() {
    }

    public static void main(String[] args) {

                mercado v1 = new mercado();
                mercado v2 = new mercado();
                mercado v3 = new mercado();
                v1.nome= "unidadeBlumenau";
                v1.maca=10;
                v1.precom=2.50;
                v1.laranja=10;
                v1.precol=1;
                System.out.println(v1.nome + "\n" + v1.maca + "\n" + v1.precom + "\n" + v1.laranja + "\n" + v1.precol);
                v2.nome="unidadeJoinville";
                v2.maca=5;
                v2.precom=2.50;
                v2.laranja=20;
                v2.precol=2;
                System.out.println(v2.nome + "\n" + v2.maca + "\n" + v2.precom + "\n" + v2.laranja + "\n" + v2.precol);
                v3.nome="unidadeFloripa";
                v3.maca=30;
                v3.precom=2.50;
                v3.laranja=50;
                v3.precol=2;
                System.out.println(v3.nome + "\n" + v3.maca + "\n" + v3.precom + "\n" + v3.laranja + "\n" + v3.precol);
// Vetor com as 3 lojas
        mercado[] lojas = {v1, v2, v3};

        // Variáveis para comparação
        mercado maiorMaca = lojas[0];
        mercado menorLaranja = lojas[0];

        // a) Maior receita com maçãs
        for (int i = 1; i < lojas.length; i++) {

            double receitaMaca = lojas[i].maca * lojas[i].precom;
            double receitaMacaMaior = maiorMaca.maca * maiorMaca.precom;

            if (receitaMaca > receitaMacaMaior) {
                maiorMaca = lojas[i];
            }
        }

        // b) Menor receita com laranjas
        for (int i = 1; i < lojas.length; i++) {

            double receitaLaranja = lojas[i].laranja * lojas[i].precol;
            double receitaLaranjaMenor = menorLaranja.laranja * menorLaranja.precol;

            if (receitaLaranja < receitaLaranjaMenor) {
                menorLaranja = lojas[i];
            }
        }

        // c) Segunda maior receita total
        mercado maiorTotal = lojas[0];
        mercado segundaMaiorTotal = lojas[1];

        // Corrige a ordem inicial caso necessário
        double total0 = lojas[0].maca * lojas[0].precom
                + lojas[0].laranja * lojas[0].precol;

        double total1 = lojas[1].maca * lojas[1].precom
                + lojas[1].laranja * lojas[1].precol;

        if (total1 > total0) {
            maiorTotal = lojas[1];
            segundaMaiorTotal = lojas[0];
        }

        for (int i = 2; i < lojas.length; i++) {

            double total = lojas[i].maca * lojas[i].precom
                    + lojas[i].laranja * lojas[i].precol;

            double totalMaior = maiorTotal.maca * maiorTotal.precom
                    + maiorTotal.laranja * maiorTotal.precol;

            if (total > totalMaior) {
                segundaMaiorTotal = maiorTotal;
                maiorTotal = lojas[i];
            } else {
                double totalSegundo = segundaMaiorTotal.maca * segundaMaiorTotal.precom
                        + segundaMaiorTotal.laranja * segundaMaiorTotal.precol;

                if (total > totalSegundo) {
                    segundaMaiorTotal = lojas[i];
                }
            }
        }

        // d) Receita total de maçãs e laranjas
        double totalMacas = 0;
        double totalLaranjas = 0;

        for (int i = 0; i < lojas.length; i++) {
            totalMacas += lojas[i].maca * lojas[i].precom;
            totalLaranjas += lojas[i].laranja * lojas[i].precol;
        }

        // Resultados
        System.out.println("a) Maior receita com maçãs:");
        System.out.println(maiorMaca.nome);

        System.out.println("\nb) Menor receita com laranjas:");
        System.out.println(menorLaranja.nome);

        System.out.println("\nc) Segunda maior receita total:");
        System.out.println(segundaMaiorTotal.nome);

        System.out.println("\nd) Comparação da franquia:");
        System.out.println("Receita com maçãs: R$ " + totalMacas);
        System.out.println("Receita com laranjas: R$ " + totalLaranjas);

        if (totalMacas > totalLaranjas) {
            System.out.println("A franquia teve maior receita vendendo maçãs.");
        } else if (totalLaranjas > totalMacas) {
            System.out.println("A franquia teve maior receita vendendo laranjas.");
        } else {
            System.out.println("A franquia teve a mesma receita com maçãs e laranjas.");
        }
    }
}




