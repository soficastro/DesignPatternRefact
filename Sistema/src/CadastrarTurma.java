//package br.com.fean.si.poo1.av2.sistemadecurso.view;

import java.awt.Dimension;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/*
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.Aluno;
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.CadastroRapido;
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.Curso;
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.Professor;
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.Turma;
*/

public class CadastrarTurma {

    private HashMap<Integer, Turma> turmas = new HashMap<>();
    private HashMap <Integer, Aluno> alunos;
    private HashMap <Integer, Professor> professores;
    private HashMap <Integer, Curso> cursos;
    Curso cursoTurma;
    Professor professorTurma;
    Integer contadorTurma = 0;
    CadastroRapido cadastrarTurmaRapido = new CadastroRapido();
    Integer contadorAlunoTurma = 0;
    Integer contadorProfessorTurma = 0;

    public CadastrarTurma(HashMap <Integer, Aluno> alunos, HashMap <Integer, Professor> professores, HashMap <Integer, Curso> cursos ) {
        this.alunos = alunos;
        this.professores = professores;
        this.cursos = cursos;
    }

    public void mostrarMenuTurma() {
        int opcao = 0;
        String opUsuario = null;
        do{
            opUsuario = JOptionPane.showInputDialog("Selecione uma opcao:\n"
                    + "1 - Cadastrar Turma \n"
                    + "2 - Listar Turmas\n"
                    + "3 - Excluir Turmas \n"
                    + "4 - Cadastro Rapido \n"
                    + "9 - Voltar ao Menu Principal");
            if(opUsuario != null){
                opcao = new Integer (opUsuario);
            };
            switch (opcao){
                case 1:
                    cadastrarTurma();
                    break;
                case 2:
                    listarTurma();
                    break;
                case 3:
                    excluirTurma();
                    break;
                case 4:
                    cadastrarTurmaRapido.cadastrarRapidoTurma(alunos, professores, cursos, turmas, contadorTurma);
                    break;
                default:
                    if (opcao != 9) {
                        JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    }
            }
        } while (opcao != 9);

    }

    public void cadastrarTurma() {
        String cursosDisponiveis = "Cursos disponiveis: \n";
        Integer idAluno = null;
        Integer idProfessor = 0;

        for (Curso curso : cursos.values()) {
            cursosDisponiveis += "ID: "+ curso.getId() +"; Nome: "+ curso.getNome()+"\n";
        }

        Integer codCursoEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Insira o id do curso que deseja iniciar"
                + cursosDisponiveis));
        String dataInicio = JOptionPane.showInputDialog("Insira a data de Inicio da turma");
        String nomeTurma = JOptionPane.showInputDialog("Insira um nome para a Turma");
        HashMap<Integer, Aluno> alunosTurma = new HashMap<>();

        for (Curso curso : cursos.values()) {
            if(curso.getId().equals(codCursoEscolhido)) {
                cursoTurma =curso;

            }

        }

        do {
            try {
                String alunosDisponiveis = "Alunos para esse Curso: \n";
                for (Aluno aluno : alunos.values()) {
                    if(aluno.getCursoMatriculado().getId().equals(codCursoEscolhido)) {
                        alunosDisponiveis += "Matricula: " + aluno.getMatricula() +
                                "; Nome: "+ aluno.getNome() +" Curso matriculado: "+ aluno.getCursoMatriculado().getNome()+"\n";
                    }
                }

                idAluno = null;
                idAluno = Integer.valueOf(JOptionPane.showInputDialog("Insira a matricula do aluno \n "
                        + "Tecle enter para interromper a inclusao de alunos. \n"
                        + alunosDisponiveis));


                if(idAluno != null){

                    for (Aluno aluno : alunos.values()) {
                        if(aluno.getMatricula().equals(idAluno)) {
                            alunosTurma.put(idAluno, aluno );
                        }
                    }

                    contadorAlunoTurma++;
                    if(contadorAlunoTurma == 0){
                        JOptionPane.showMessageDialog(null, "Insira ao menos um aluno");
                    }
                }

            } catch (Exception e) {
            }

        }while(idAluno != null);



        String professoresDisponiveis = "Professores para esse Curso: \n";
        for (Professor professorDisp : professores.values()) {
            professoresDisponiveis += "Matricula: "+ professorDisp.getMatricula() +"; Nome: " + professorDisp.getNome() + " Formacao: "+ professorDisp.getFormacao() +"\n";

        }
        idProfessor = Integer.valueOf(JOptionPane.showInputDialog("Insira a matricula do professor \n "
                + "Tecle enter para interromper a inclusao. \n"
                + professoresDisponiveis));

        for (Professor professor : professores.values()) {
            if (professor.getMatricula().equals(idProfessor)) {
                professorTurma = new Professor (professor.getNome(), professor.getCpf(),
                        professor.getDataNascimento(), professor.getTelefone(), professor.getMatricula(),
                        professor.getTipo(), professor.getDataAdmissao(), professor.getSalario(), professor.getFormacao());
            }
        }



        contadorTurma++;  
        Turma turmaCadastrada = new Turma.TurmaBuilder().setAlunosTurma(alunosTurma).setCursoTurma(cursoTurma).setProfessorTurma(professorTurma).setDataInicio(dataInicio).setId(contadorTurma).setMatriculado(contadorAlunoTurma).setNome(nomeTurma).build();

        turmas.put(turmaCadastrada.getId(), turmaCadastrada);

    }

    public void listarTurma() {
        String dadosTurma = "-- Lista de Turmas Cadastradas: \n";
        for (Turma turma : turmas.values()) {
            dadosTurma += turma + "\n";
        }

        JTextArea area = new JTextArea(dadosTurma);
        JScrollPane painelScroll = new JScrollPane(area);
        painelScroll.setPreferredSize(new Dimension(1000,500));
        JOptionPane.showMessageDialog(null, painelScroll);

    }

    public void excluirTurma() {
        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID da Turma que deseja excluir: "));
        turmas.remove(id);
    }

    public HashMap<Integer, Turma> getTurma(){
        return turmas;

    }


}

