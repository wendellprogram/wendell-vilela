public class Endereco {
    private String uf ;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;

    public Endereco(String uf, String cidade, String cep, String logradouro, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if(uf.length() > 2|| uf==null || uf.isBlank() ){
            throw new IllegalArgumentException("uf invalida");
        }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if(cidade==null || cidade.isBlank()){
            throw new IllegalArgumentException("cidade invalida");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep==null || cep.isBlank() ||cep.length()>8 ){
            throw  new IllegalArgumentException("cep invalido");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro==null || logradouro.isBlank()){
            throw new IllegalArgumentException("logradouro invalido");
        }
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero<0){
            throw new IllegalArgumentException("numero invalido");
        }
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "endereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                '}';
    }
}
