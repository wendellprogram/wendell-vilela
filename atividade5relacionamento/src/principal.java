public class principal {
    public static void main(String[] args) {
 conta c1 = new conta("wendell",10000);
 conta c2 = new conta ("burninho do pix",100000);
       /// System.out.println(c1.depositarDinheiro(50));
      /// System.out.println(c1.sacarDinheiro(5000));
        System.out.println(c1.transferirDinheiro(c2,500));
        System.out.println(c1);
        System.out.println(c2);
    }
}
