public class Retangulo {
private double largura;
private double altura;

    public Retangulo(double altura, double largura) {
       setAltura(altura);
       setLargura(largura);
    }
    public double obterArea(){
        double area = largura*altura;
        return area;
    }public double obterPerimetro(){
        double perimetro = largura*2+altura*2;
        return perimetro;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura<0){

            throw new IllegalArgumentException("invalido");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura<0){
            throw new IllegalArgumentException("invalido");
        }

        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}

