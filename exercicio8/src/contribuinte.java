public class contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;
    private double imposto;

    public contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;

    }

    @Override
    public String toString() {
        return "contribuinte{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }

    public static void calcularImposto(contribuinte[] impostos) {

        for (int i = 0; i < impostos.length; i++) {

            double rendaAnual = impostos[i].getRendaAnual();

            if (rendaAnual <= 4000) {
                impostos[i].setImposto(0);

            } else if (rendaAnual <= 9000) {
                impostos[i].setImposto(rendaAnual * 0.058);

            } else if (rendaAnual <= 25000) {
                impostos[i].setImposto(rendaAnual * 0.15);

            } else if (rendaAnual <= 35000) {
                impostos[i].setImposto(rendaAnual * 0.275);

            } else {
                impostos[i].setImposto(rendaAnual * 0.30);
            }
        }
    }

    public static contribuinte maiorImposto(contribuinte[] vetor) {

        contribuinte maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i].getImposto() > maior.getImposto()) {
                maior = vetor[i];
            }
        }

        return maior;
    }
    public static double totalImposto(contribuinte[] vetor) {

        double total = 0;

        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i].getImposto();
        }

        return total;
    }




    /// /////calculos modulos/////////////////////////////////////////////////////

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("modelo errado maninho invalido");///caso resultado nulo ou espacosssss
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            System.out.println("modelo errado maninho invalido");///caso resultado nulo ou espacosssss
        } else {
            this.cpf = cpf;
        }

    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()) {
            System.out.println("modelo errado maninho invalido");///caso resultado nulo ou espacosssss
        } else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual <= 0) {
            System.out.println("modelo errado maninho invalido");///caso resultado nulo ou espacosssss
        } else {
            this.rendaAnual = rendaAnual;
        }
    }
}




