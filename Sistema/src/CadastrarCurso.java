//package br.com.fean.si.poo1.av2.sistemadecurso.view;

/*
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.CadastroRapido;
import br.com.fean.si.poo1.av2.sistemadecurso.modelo.Curso;
*/
import java.util.HashMap;

import javax.swing.JOptionPane;



public class CadastrarCurso {

    private HashMap<Integer, Curso> cursos;
    Integer contadorCurso = 0;
    CadastroRapido cadastrarCursoRapido = new CadastroRapido();

    public CadastrarCurso () {
        this.cursos = new HashMap<>();
    }

    public void mostrarMenuCurso () {
        int opcao = 0;
        String opUsuario = null;
        do{
            opUsuario = JOptionPane.showInputDialog("Selecione uma opcao:\n"
                    + "1 - Cadastrar Curso \n"
                    + "2 - Listar Curso \n"
                    + "3 - Excluir Curso \n"
                    + "4 - Cadastro Rapido \n"
                    + "9 - Voltar ao Menu Principal");
            if(opUsuario != null){
                opcao = new Integer (opUsuario);
            };
            switch (opcao){
                case 1:
                    cadastrarCurso();
                    break;
                case 2:
                    listarCurso();
                    break;
                case 3:
                    excluirCurso();
                    break;
                case 4:
                    cadastrarCursoRapido.cadastrarRapidoCurso(cursos, contadorCurso);
                    break;
                default:
                    if (opcao != 9) {
                        JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
                    }
            }
        } while (opcao != 9);
    }

    public void cadastrarCurso() {
        String nome = JOptionPane.showInputDialog("Insira o nome do Curso: ");
        Double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Curso: "));
        contadorCurso ++;

        Curso cursoCadastrado = new Curso.CursoBuilder().setNome(nome).setId(contadorCurso).setValor(valor).build();
        cursos.put(cursoCadastrado.getId(), cursoCadastrado);

    }

    public void listarCurso() {
        String dadosCursos = "-- Lista de Cursos Cadastrados: \n";
        for (Curso curso : cursos.values()) {
            dadosCursos += curso + "\n";
        }

        JOptionPane.showMessageDialog(null, dadosCursos);
    }

    public void excluirCurso() {
        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Insira o ID do Curso que deseja excluir: "));
        cursos.remove(id);
    }

	/*public void cadastroRapidoCurso() {

		contadorCurso ++;
		Curso cursoRapido = new Curso(contadorCurso,"Maquiagem", 200.00);
		cursos.put(cursoRapido.getId(), cursoRapido);

		contadorCurso ++;
		Curso cursoRapido2 = new Curso(contadorCurso,"Cabeleireiro", 250.00);
		cursos.put(cursoRapido2.getId(), cursoRapido2);

		contadorCurso ++;
		Curso cursoRapido3 = new Curso(contadorCurso,"Depila��o", 300.00);
		cursos.put(cursoRapido3.getId(), cursoRapido3);

		contadorCurso ++;
		Curso cursoRapido4 = new Curso(contadorCurso,"Manicure", 150.00);
		cursos.put(cursoRapido4.getId(), cursoRapido4);

	} */

    public HashMap<Integer, Curso> getCurso(){
        return cursos;

    }

}

