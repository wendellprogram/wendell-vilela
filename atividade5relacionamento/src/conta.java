public class conta {
    private String nome;
    private double saldo;

    public conta(String nome, double saldo) {
       setNome(nome);
       setSaldo(saldo);
    }
    public double  depositarDinheiro (double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("invalido");

        }
        this.saldo += saldo;
return this.saldo;
    }
    public double sacarDinheiro(double saldo) {
            if (saldo <= 0 || saldo > this.saldo) {
                throw new IllegalArgumentException("Valor invalido para saque");
            }

            this.saldo -= saldo;

            return this.saldo;
        }
        public double transferirDinheiro(conta destinatario,double saldo) {
            if (saldo <= 0|| destinatario==null) {
                throw new IllegalArgumentException("invalido");
            }
            this.saldo -= saldo;
            return destinatario.saldo += saldo;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null || nome.isBlank()){
            throw new IllegalArgumentException("invalido");
        }
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo<0){
            throw new IllegalArgumentException("invalido");

        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "conta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
