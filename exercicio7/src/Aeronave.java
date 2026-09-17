///a) Qual aeronave leva o maior número de passageiros?
///b) Qual das aeronaves pode ficar mais tempo no ar?
///c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais longe
///?



public class Aeronave {

    private String modelo;
    private int passageiros;
    private double velocidadeMax;
    private double capacidadeCombustivel;
    private double queimaCombustivelMin;

    public Aeronave(String modelo, int passageiros, double velocidadeMax,
                    double capacidadeCombustivel, double queimaCombustivelMin) {

        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMin = queimaCombustivelMin;
        setModelo  (modelo);/////para nao bugar é necessario
        setVelocidadeMax (velocidadeMax);
        setCapacidadeCombustivel  (capacidadeCombustivel);
        setQueimaCombustivelMin (queimaCombustivelMin);
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo==null||modelo.isBlank()){
            System.out.println("modelo errado maninho invalido");///caso resultado nulo ou espacosssss
        }else{
            this.modelo = modelo;
        }

    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        if (passageiros <0){
            System.out.println("erro numero de passageiros invalidos"); ////caso numero negativo
        }else {
            this.passageiros = passageiros;
        }
/// /so fazer com os outros tambemmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaCombustivelMin() {
        return queimaCombustivelMin;
    }

    public void setQueimaCombustivelMin(double queimaCombustivelMin) {
        this.queimaCombustivelMin = queimaCombustivelMin;
    }
}
