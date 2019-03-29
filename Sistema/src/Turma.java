//package br.com.fean.si.poo1.av2.sistemadecurso.modelo;
import java.util.HashMap;

public class Turma {

    private Integer id;
    private Curso cursoTurma;
    private String dataInicio;
    private String nome;
    private HashMap<Integer, Aluno> alunosTurma;
    private Professor professorTurma;
    private Integer matriculado;


    public Turma(TurmaBuilder builder) {
        this.id = builder.id;
        this.cursoTurma = builder.cursoTurma;
        this.dataInicio = builder.dataInicio;
        this.nome = builder.nome;
        this.alunosTurma = builder.alunosTurma;
        this.professorTurma = builder.professorTurma;
        this.matriculado = builder.matriculado;
    }



    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Curso getCursoTurma() {
        return cursoTurma;
    }
    public void setCursoTurma(Curso cursoTurma) {
        this.cursoTurma = cursoTurma;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public HashMap<Integer, Aluno> getAlunosTurma() {
        return alunosTurma;
    }
    public void setAlunosTurma(HashMap<Integer, Aluno> alunosTurma) {
        this.alunosTurma = alunosTurma;
    }
    public Professor getProfessorTurma() {
        return professorTurma;
    }
    public void setProfessorTurma(Professor professorTurma) {
        this.professorTurma = professorTurma;
    }
    public Integer getMatriculados() {
        return matriculado;
    }
    public void setMatriculados(Integer matriculado) {
        this.matriculado = matriculado;
    }


    @Override
    public String toString() {
        String dadosCurso = "";
        String dadosProfessor = "";
        String dadosAlunos = "";


        dadosCurso += cursoTurma.getNome();

        dadosProfessor += professorTurma.getNome() +"\n Forma��o: " +professorTurma.getFormacao();

        for (Aluno aluno : alunosTurma.values()) {
            dadosAlunos += "Matricula: "+ aluno.getMatricula() + "; Nome: " +  aluno.getNome() + "; Curso: " + aluno.getCursoMatriculado().getNome() + "\n";
        }

        return "ID: " + id + "\n Curso: " + dadosCurso + "\n Data Inicio: " + dataInicio + "\n Matriculados: "+ matriculado +"\n Nome: "
                + nome + "\n Professor: " + dadosProfessor + "\n Alunos: \n" + dadosAlunos;

    }

    public static class TurmaBuilder {
        private Integer id;
        private Curso cursoTurma;
        private String dataInicio;
        private String nome;
        private HashMap<Integer, Aluno> alunosTurma;
        private Professor professorTurma;
        private Integer matriculado;


        public TurmaBuilder(){

        }

        public TurmaBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public TurmaBuilder setCursoTurma(Curso cursoTurma) {
            this.cursoTurma = cursoTurma;
            return this;
        }

        public TurmaBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public TurmaBuilder setDataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
            return this;
        }

        public TurmaBuilder setAlunosTurma(HashMap<Integer, Aluno> alunosTurma) {
            this.alunosTurma = alunosTurma;
            return this;
        }

        public TurmaBuilder setProfessorTurma(Professor professorTurma) {
            this.professorTurma = professorTurma;
            return this;
        }

        public TurmaBuilder setMatriculado(Integer matriculado) {
            this.matriculado = matriculado;
            return this;
        }

        public Turma build() {
            return new Turma(this);
        }
    }

}
