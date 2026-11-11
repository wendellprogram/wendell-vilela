public class pessoa {
    private String nome;
    private Endereco endereco;

    public pessoa(String nome, Endereco endereco) {
        setNome(nome);
       setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null || nome.isBlank()){
            throw new IllegalArgumentException("nome invalido");
        }
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null ){
            throw new IllegalArgumentException("endereco invalido");
        }
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
