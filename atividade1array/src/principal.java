public class principal {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo( 5, 4);
        Retangulo r2 = new Retangulo( 18, 1);

        Arrayretangulo a1 = new Arrayretangulo();


        a1.adicionarRetangulo(r1);
        a1.adicionarRetangulo(r2);
        System.out.println(a1.obterMaiorArea());
        System.out.println(a1.obterMaiorPerimetro());







    }
}
