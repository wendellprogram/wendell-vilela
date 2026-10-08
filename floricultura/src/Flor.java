public class Flor {
    private String nome;
    private double preco;
    private String cliente;

    public Flor(String nome, double preco, String cliente) {
     setNome(nome);
     setPreco(preco);
     setCliente(cliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null || nome.isBlank()){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco<=0){
            throw new IllegalArgumentException();
        }
        this.preco = preco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if(cliente==null || cliente.isBlank()){
            throw new IllegalArgumentException();
        }
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
