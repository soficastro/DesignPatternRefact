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

    public Turma(Integer id, Curso cursoTurma, String dataInicio, String nome,
                 HashMap<Integer, Aluno> alunosTurma, Professor professorTurma, Integer matriculado) {
        //super();
        this.id = id;
        this.cursoTurma = cursoTurma;
        this.dataInicio = dataInicio;
        this.nome = nome;
        this.alunosTurma = alunosTurma;
        this.professorTurma = professorTurma;
        this.matriculado = matriculado;
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


}
