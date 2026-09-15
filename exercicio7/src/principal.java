public class principal {

    public static void main(String[] args) {

        Aeronave a1 = new Aeronave("boeing 777", 100, 1000, 100, 1);
        Aeronave a2 = new Aeronave("jetpack", 1, 1000000, 10000, 5);
        Aeronave a3 = new Aeronave("b-2", 2, 11000, 1000, 3);
        Aeronave a4 = new Aeronave("boing 737", 130, 15000, 15000, 5);

        Aeronave[] avioes = {a1, a2, a3, a4};

        Aeronave maiorPassageiros = avioes[0];

        for (int i = 1; i < avioes.length; i++) {

            if (avioes[i].passageiros > maiorPassageiros.passageiros) {
                maiorPassageiros = avioes[i];
            }

        }

        System.out.println("Aeronave com maior número de passageiros:");
        System.out.println(maiorPassageiros);


        // AVIÃO QUE FICA MAIS TEMPO NO AR

        Aeronave maiorTempoVoo = avioes[0];

        for (int i = 1; i < avioes.length; i++) {

            if (avioes[i].calcularTempoVoo() > maiorTempoVoo.calcularTempoVoo()) {
                maiorTempoVoo = avioes[i];
            }

        }

        System.out.println();
        System.out.println("Aeronave que fica mais tempo no ar:");
        System.out.println(maiorTempoVoo);
        System.out.println("Tempo de voo: " + maiorTempoVoo.calcularTempoVoo() + " minutos");

        Aeronave maiorDistancia = avioes[0];

        for (int i = 1; i < avioes.length; i++) {

            if (avioes[i].calcularDistancia() > maiorDistancia.calcularDistancia()) {
                maiorDistancia = avioes[i];
            }

        }

        System.out.println();
        System.out.println("Aeronave que vai mais longe:");
        System.out.println(maiorDistancia);
        System.out.printf("Distância: %.0f km%n", maiorDistancia.calcularDistancia());

    }
}

