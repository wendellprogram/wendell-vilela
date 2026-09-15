///a) Qual aeronave leva o maior número de passageiros?
///b) Qual das aeronaves pode ficar mais tempo no ar?
///c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe
///?



public class Aeronave {

    String modelo;
    int passageiros;
    double velocidadeMax;
    double capacidadeCombustivel;
    double queimaCombustivelMin;

    public Aeronave(String modelo, int passageiros, double velocidadeMax,
                    double capacidadeCombustivel, double queimaCombustivelMin) {

        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMin = queimaCombustivelMin;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                ", Passageiros: " + passageiros +
                ", Velocidade: " + velocidadeMax +
                ", capacidade de combustivel: " + capacidadeCombustivel +
                ", queima de combustivel por minuto: " + queimaCombustivelMin;
    }

    public double calcularTempoVoo() {
        return capacidadeCombustivel / queimaCombustivelMin;
    }public double calcularDistancia() {

        return velocidadeMax * calcularTempoVoo();
    }

}
