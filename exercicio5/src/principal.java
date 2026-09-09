public class principal {
    public static void main(String[] args) {
funcionarios f1= new funcionarios();

        System.out.println("Nome completo: " + f1.ObterNomeCompleto());
        System.out.println("Salário mensal: " + f1.salario);
        System.out.println("Salário anual: " + f1.ObterSalario());
        System.out.println("salario anual atualizado com percentual: "+f1.ObterPercAumento());


    }

}
