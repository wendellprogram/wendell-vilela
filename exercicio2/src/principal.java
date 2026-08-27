public class principal {
    public static void main(String[] args) {
   mercado v1 = new mercado();
   mercado v2 = new mercado();
   mercado v3 = new mercado();
   v1.nome= "unidadeBlumenau";
   v1.maca=10;
   v1.precom=2.50;
   v1.laranja=10;
   v1.precol=1;
        System.out.println(v1.nome + "\n" + v1.maca + "\n" + v1.precom + "\n" + v1.laranja + "\n" + v1.precol);
   v2.nome="unidadeJoinville";
        v2.maca=5;
        v2.precom=2.50;
        v2.laranja=20;
        v2.precol=2;
        System.out.println(v2.nome + "\n" + v2.maca + "\n" + v2.precom + "\n" + v2.laranja + "\n" + v2.precol);
        v3.nome="unidadeFloripa";
        v3.maca=30;
        v3.precom=2.50;
        v3.laranja=50;
        v3.precol=2;
        System.out.println(v3.nome + "\n" + v3.maca + "\n" + v3.precom + "\n" + v3.laranja + "\n" + v3.precol);

    }
}
