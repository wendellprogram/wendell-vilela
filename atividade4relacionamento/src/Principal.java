
public class Principal {
    public static void main(String[] args) {

        Produto p1 = new Produto("Votoran", "Cimento", 35.00, 10);
        Produto p2 = new Produto("Tigre", "Cano PVC", 20.00, 15);
        Produto p3 = new Produto("Votoran", "xupacabra", 99.00, 10);
        MateriaisDeConstrucao m1 = new MateriaisDeConstrucao();
        m1.adicionarProduto(p1);
        m1.adicionarProduto(p2);
        m1.adicionarProduto(p3);




        System.out.println(p1.aumentarProduto(5));


        System.out.println(p1.venderProduto(3));



        System.out.println(m1.obterMarcaMaisCara("votoran"));
    }
}
