public class principal {
    public static void main(String[] args) {
Produto p1= new Produto();
Produto p2= new Produto();
Produto p3= new Produto();
        p1.nome="caderno";
        p1.descricao = "Caderno em espiral tamanho médio";
        p1.precou = 4.50;
        p1.descont = 15;

        System.out.println(p1.nome + "\n" + p1.descricao + "\n" + p1.precou + "\n" + p1.descont);
        System.out.println("=======================");
        p2.nome="Caneta ESF";
        p2.descricao = "Caneta esferográfica 5mm";
        p2.precou = 1.20;
        p2.descont = 2;
        System.out.println(p2.nome + "\n" + p2.descricao + "\n" + p2.precou + "\n" + p2.descont);
        System.out.println("=======================");
        p3.nome="Esquadro";
        p3.descricao = "Esquadro de acrílico 20 cm";
        p3.precou = 2.35;
        p3.descont = 10;
        System.out.println(p3.nome + "\n" + p3.descricao + "\n" + p3.precou + "\n" + p3.descont);


    }
}
