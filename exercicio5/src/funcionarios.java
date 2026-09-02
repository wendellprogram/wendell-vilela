//Crie uma classe Funcionário que terá como atributos:
 //       • Identificação
//• Nome
///• Sobrenome
///Crie métodos para:
///Obter o salário anual do funcionário
///Obter o nome completo do funcionário
///Modificar o salário. O parâmetro do método deve ser o percentual de aumento


public class funcionarios {
    String nome = "wendell";
    String sobrenome = "vilela";
    double salario = 500;
    double percentual = 10;

    public double ObterSalario() {
        return salario * 12;


    }

    public String ObterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double ObterPercAumento() {
      return  salario = salario + (salario * percentual / 100);

    }


}
