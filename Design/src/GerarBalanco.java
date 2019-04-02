import java.util.HashMap;

import javax.swing.JOptionPane;

public class GerarBalanco {
    HashMap<Integer, Funcionario> funcionarios;
    HashMap<Integer, Turma> turmas;

    Double custoTotal = 0.0;
    Double receitaTotal = 0.0;
    Integer matriculados = 0;
    Double valorCurso = 0.0;
    private static GerarBalanco onlyInstance;

    private GerarBalanco(HashMap<Integer, Funcionario> funcionario, HashMap<Integer, Turma> turma) {
        this.funcionarios = funcionario;
        this.turmas = turma;
    }

    public static GerarBalanco getInstance(HashMap<Integer, Funcionario> funcionario, HashMap<Integer, Turma> turma) {
        if(onlyInstance == null) {
            onlyInstance = new GerarBalanco(funcionario, turma);
        }
        return onlyInstance;
    }

    public void gerarBalanco() {
        Double balanco = 0.0;

        gerarCusto();
        gerarReceita();

        balanco = (receitaTotal - custoTotal);

        String texto = "- - Total de Receita - - \n "
                + "(Matriculados * Curso): " + receitaTotal
                + "\n"
                + "- - Total de Custos - - \n"
                + "(Soma dos Salarios): \n"+ custoTotal
                + "\n Total em Caixa: " + balanco;

        JOptionPane.showMessageDialog(null, texto);

    }

    public Double gerarCusto () {

        for (Funcionario funcionario : funcionarios.values()) {
            custoTotal += funcionario.getSalario();
        }

        for (Turma turma : turmas.values()) {
            custoTotal += turma.getProfessorTurma().getSalario();
        }
        return custoTotal;

    }

    public Double gerarReceita () {

        for (Turma turma : turmas.values()) {
            matriculados = turma.getMatriculados();
            valorCurso = turma.getCursoTurma().getValor();
            receitaTotal += (matriculados * valorCurso);
        }
        return receitaTotal;
    }

}
