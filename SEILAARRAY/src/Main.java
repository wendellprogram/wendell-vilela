import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero");
        int idade = sc.nextInt();
        List<Integer> idades = new ArrayList<>();
       idades.addAll(Arrays.asList(10,20,30,50));

       int indice= idades.indexOf(idade);
       if(indice != -1){
           System.out.println(indice);
       }else {
           System.out.println("nao tem");
       }





      /// if(idades.contains(idade)){
       ///    System.out.println(idades.indexOf(idade));
     ///  }else {
       ///    System.out.println("seu animal");
      // }


        }
    }
