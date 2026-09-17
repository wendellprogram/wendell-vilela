public class principal {
    public static void main(String[] args) {

        contribuinte c1 = new contribuinte("wendell", "14034491981", "SC", 30000);
        contribuinte c2 = new contribuinte("bruno", "999999995", "SC",10000);
        contribuinte c3 = new contribuinte("otavio", "140344915555", "RS", 5000);
        contribuinte c4 = new contribuinte("cauan", "142342342342", "RJ", 20000);
        contribuinte c5 = new contribuinte("monkey d luffy", "676767676767", "EB", 100);

        contribuinte[] impostos = {c1, c2, c3, c4, c5};

        contribuinte.calcularImposto(impostos);

        contribuinte maior = contribuinte.maiorImposto(impostos);

        System.out.println("Quem paga mais: " + maior.getNome());
        System.out.println("Imposto: R$ " + maior.getImposto());
        double total = contribuinte.totalImposto(impostos);

        System.out.println("Total de impostos: R$ " + total);
    }
}
