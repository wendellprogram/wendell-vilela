public class principal {
    public static void main(String[] args) {


        veiculo v1 = new veiculo("honda", "civic", "999xxx", 2019, 50000);
        veiculo v2 = new veiculo("toyota", "supra", "999xx3x", 2000, 51000);
        veiculo v3 = new veiculo("carlos", "aviao", "999xxqx", 2015, 50200);


        concessionaria c1 = new concessionaria();


        c1.adicionarveiculo(v1);
        c1.adicionarveiculo(v2);
        c1.adicionarveiculo(v3);
        System.out.println(c1.obterVeiculoMaisBarato());


    }
}
