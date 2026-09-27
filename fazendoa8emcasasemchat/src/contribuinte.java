public class contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaanual;

    public contribuinte(String nome, String cpf, String uf, double rendaanual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaanual(rendaanual);
    }public double calcularImposto() {
        if(rendaanual <= 4000) {
            return 0;
        }
        else if(rendaanual <= 9000) {
            return rendaanual * 0.058;
        }
        else if(rendaanual <= 25000) {
            return rendaanual * 0.15;
        }
        else if(rendaanual <= 35000) {
            return rendaanual * 0.275;
        }
        return rendaanual * 0.3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("nome invalido!");
        } else {
            this.nome = nome;
        }


    }

    public String getCpf() {
            return cpf;
        }


        public void setCpf(String cpf) {
            if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
                System.out.println("cpf invalido!");
            } else {
                this.cpf = cpf;
            }

        }

        public String getUf() {
            return uf;
        }

        public void setUf(String uf) {
        if (uf==null || uf.isBlank() || uf.length() != 2){
            System.out.println("uf invalida !");
        }else {
            this.uf = uf;
        }

        }

        public double getRendaanual() {
            return rendaanual;
        }

        public void setRendaanual(double rendaanual) {
        if (rendaanual<=0){
            System.out.println("renda anual invalida!");
        }else {
            this.rendaanual = rendaanual;
        }

        }

    @Override
    public String toString() {
        return "contribuinte{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaanual=" + rendaanual +
                '}';
    }
}



