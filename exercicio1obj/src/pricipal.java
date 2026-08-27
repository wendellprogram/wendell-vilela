public class pricipal {
    public static void main(String[] args) {
        usuario u1 = new usuario();
    u1.nome = "Wendell";
    u1.sexo = 'm';
    u1.data = "20/04/2005";
    u1.estadocivil= "namorando";
        System.out.println(u1.nome + "\n" + u1.sexo + "\n" + u1.data + "\n" + u1.estadocivil);
        System.out.println("=============================");
        usuario u2 = new usuario();
        u1.nome = "otavio";
        u1.sexo = 'f';
        u1.data = "20/04/2025";
        u1.estadocivil= "brincando";

        System.out.println(u1.nome + "\n" + u1.sexo + "\n" + u1.data + "\n" + u1.estadocivil);
    }
}
