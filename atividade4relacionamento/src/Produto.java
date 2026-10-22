
public class Produto {
    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public Produto(String marca, String modelo, double preco, int quantidade) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public int aumentarProduto(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
        return this.quantidade;
    }

    public int venderProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("valor invalido");
        }
        return this.quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
