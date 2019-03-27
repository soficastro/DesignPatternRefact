//package br.com.fean.si.poo1.av2.sistemadecurso;
import javax.swing.JOptionPane;
/*
import br.com.fean.si.poo1.av2.sistemadecurso.view.CadastrarCurso;
import br.com.fean.si.poo1.av2.sistemadecurso.view.CadastrarPessoa;
import br.com.fean.si.poo1.av2.sistemadecurso.view.CadastrarTurma;
import br.com.fean.si.poo1.av2.sistemadecurso.view.GerarBalanco;
*/

public class SistemaDeCurso {

    private CadastrarCurso cadastrarCurso;
    private CadastrarPessoa cadastrarPessoa;
    private CadastrarTurma cadastrarTurma;
    private GerarBalanco gerarBalanco;


    public static void main(String[] args) {

        SistemaDeCurso sistemaCurso = new SistemaDeCurso();

        sistemaCurso.gerarClassesCadastro();
        sistemaCurso.mostrarMenu();

    }


    private void gerarClassesCadastro() {
        cadastrarCurso = new CadastrarCurso ();
        cadastrarPessoa = new CadastrarPessoa(cadastrarCurso.getCurso());
        cadastrarTurma = new CadastrarTurma(cadastrarPessoa.getAluno(),cadastrarPessoa.getProfessor(),cadastrarCurso.getCurso());
        gerarBalanco = new GerarBalanco(cadastrarPessoa.getFuncionario(),cadastrarTurma.getTurma());
    }


    public void mostrarMenu() {
        int opcao = 0;
        String opUsuario = null;
        do{
            opUsuario = JOptionPane.showInputDialog("Selecione uma opcao:\n"
                    + "1 - Curso \n"
                    + "2 - Pessoas (Aluno e Funcionarios (Professor)) \n"
                    + "3 - Turmas \n"
                    + "4 - Gerar Balanco \n"
                    + "9 - Sair do Sistema");
            if(opUsuario != null){
                opcao = new Integer (opUsuario);
            };
            switch (opcao){
                case 1:
                    cadastrarCurso.mostrarMenuCurso();
                    break;
                case 2:
                    cadastrarPessoa.mostrarMenuPessoa();
                    break;
                case 3:
                    cadastrarTurma.mostrarMenuTurma();
                    break;
                case 4:
                    gerarBalanco.gerarBalanco();
                    break;
                default:
                    if (opcao != 9) {
                        JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    }
            }
        } while (opcao != 9);
    }

}

