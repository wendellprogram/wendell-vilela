import java.util.ArrayList;
import java.util.List;

public class SistemasAlunos {
    private List<Aluno> alunos;

    public SistemasAlunos() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                throw new IllegalArgumentException("aluno ja cadastrado");
            }

        }
        alunos.add(aluno);
    }

        public List<Aluno> obterAlunoIdadeMaior ( double idade){
            List<Aluno> idadesAlunos = new ArrayList<>();
            for (Aluno a : alunos) {
                if (a.getIdade() >= 18 & a.getMediaFinal() >= 5) {
                    idadesAlunos.add(a);
                }

            }
            return idadesAlunos;
        }

        public List<Aluno> obterAlunoPorMatricula (String matricula){
            List<Aluno> matriculasAlunos = new ArrayList<>();
            for (Aluno a : alunos) {
                if (a.getMatricula() == matricula) {
                    matriculasAlunos.add(a);
                }

            }
            return matriculasAlunos;
        }

    }




