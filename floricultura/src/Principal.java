public class Principal {
    public static void main(String[] args) {
        Flor f1 = new Flor( "ROSA", 80,"kratos");
        Flor f2 = new Flor( "girassol", 100,"joao");
        Flor f3 = new Flor( "babosa", 50,"kratos");
        Flor f4 = new Flor( "abelhuda", 800,"kratos");
        Flor f5 = new Flor( "xxx", 10,"joao");


       Floricultura l1 = new Floricultura();

        l1.adicionarFlor(f1);
        l1.adicionarFlor(f2);
        l1.adicionarFlor(f3);
        l1.adicionarFlor(f4);
        l1.adicionarFlor(f5);

        System.out.println(l1.obterListaCliente("kratos"));
    }
}
