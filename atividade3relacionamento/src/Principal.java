public class Principal {
    public static void main(String[] args) {
       Aluno a1 =new Aluno("uelison",18,"141053","ADS",6.00);
        Aluno a2 =new Aluno("zoro",25,"999","edf",10.00);
        Aluno a3 =new Aluno("walter white",40,"6767","quimica",1.00);
        Aluno a4 =new Aluno("douglas",5,"141053","treta",5.00);

 SistemasAlunos s1 = new SistemasAlunos();
        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);
        s1.adicionarAluno(a4);


        System.out.println(s1.obterAlunoIdadeMaior(18));
        System.out.println(s1.obterAlunoPorMatricula("141053"));


    }
}
