public class principal {
    public static void main(String[] args) {
Endereco e1 = new Endereco("sc","blumenau","88888888","foda",0);
pessoa p1 = new pessoa("macaco",e1);
/// /vc pode add new endereco ao inves de e1
        System.out.println(p1);
    }
}
