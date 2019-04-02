import java.awt.Dimension;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CadastrarPessoa {

    private HashMap <Integer, Aluno> alunos = new HashMap<>();
    private HashMap <Integer, Funcionario> funcionarios = new HashMap<>();
    private HashMap <Integer, Professor> professores = new HashMap<>();
    private HashMap <Integer, Curso> cursos;
    Integer contadorPessoas = 0;
    CadastroRapido cadastrarPessoaRapido = new CadastroRapido();
    private static CadastrarPessoa onlyInstance;


    private CadastrarPessoa (HashMap<Integer, Curso> cursos) { this.cursos = cursos; }

    public static CadastrarPessoa getInstance(HashMap<Integer, Curso> cursos) {

        if (onlyInstance == null)

        {

            onlyInstance = new CadastrarPessoa(cursos);

        }

        return onlyInstance;

    }

    public void mostrarMenuPessoa() {
        int opcao = 0;
        String opUsuario = null;
        do{
            opUsuario = JOptionPane.showInputDialog("Selecione uma op��o:\n"
                    + "1 - Cadastrar Pessoas \n"
                    + "2 - Listar Pessoas \n"
                    + "3 - Excluir Pessoas \n"
                    + "4 - Cadastro Rapido \n"
                    + "9 - Voltar ao Menu Principal");
            if(opUsuario != null){
                opcao = new Integer (opUsuario);
            }
            switch (opcao){
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoa();
                    break;
                case 3:
                    excluirPessoa();
                    break;
                case 4:
                    cadastrarPessoaRapido.cadastrarRapidoPessoa(alunos, funcionarios, professores, cursos, contadorPessoas);
                    break;
                default:
                    if (opcao != 9) {
                        JOptionPane.showMessageDialog(null, "Opcao invalida!");
                    }
            }
        } while (opcao != 9);

    }

    public void cadastrarPessoa() {
        Integer opcao = 0;
        String nome = JOptionPane.showInputDialog("Insira o nome:");
        Integer cpf = Integer.parseInt(JOptionPane.showInputDialog("Insira o CPF:"));
        String dataNascimento = JOptionPane.showInputDialog("Insira a data de nascimento:");
        String telefone = JOptionPane.showInputDialog("Insira o telefone");
        contadorPessoas++;
        String tipo = JOptionPane.showInputDialog("Digite o tipo de pessoa \n:"
                + "1 - Para Aluno \n"
                + "2 - Para Funcionario \n"
                + "3 - Para Professor");

        opcao = Integer.parseInt(tipo);

        if (opcao == 1) {
            String tipoCadastro = "Aluno";
            String cursosDisponiveis = "Cursos disponiveis: \n";

            for (Curso curso : cursos.values()) {
                cursosDisponiveis += curso +"\n";
            }

            Integer cursoDesejado = Integer.parseInt(JOptionPane.showInputDialog("Qual ID do curso desejado? \n"
                    + cursosDisponiveis));

            Aluno alunoCadastrado = new Aluno (nome, cpf, dataNascimento, telefone, contadorPessoas, tipoCadastro, cursos.get(cursoDesejado));
            alunos.put(alunoCadastrado.getMatricula(), alunoCadastrado);

        } else if (opcao == 2) {
            String tipoCadastro = "Funcionario";
            String dataAdimissao = JOptionPane.showInputDialog("Insira a data de adimissao: ");
            Double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o salario do funcionario: "));

            Funcionario funcionarioCadastrado = new Funcionario(nome, cpf, dataNascimento, telefone, contadorPessoas, tipoCadastro, dataAdimissao, salario);

            funcionarios.put(funcionarioCadastrado.getMatricula(), funcionarioCadastrado);

        } else if (opcao == 3) {
            String tipoCadastro = "Professor";
            String dataAdimissao = JOptionPane.showInputDialog("Insira a data de adimiss�o: ");
            Double salario = Double.parseDouble(JOptionPane.showInputDialog("Insira o sal�rio do professor: "));
            String formacao = JOptionPane.showInputDialog("Insira a forma��o do professor: ");

            Professor professorCadastrado = new Professor (nome, cpf, dataNascimento, telefone, contadorPessoas, tipoCadastro, dataAdimissao, salario, formacao);

            professores.put(professorCadastrado.getMatricula(), professorCadastrado);

        } else {
            JOptionPane.showMessageDialog(null, "Insira um tipo de pessoa v�lida!");
        }



    }

    public void listarPessoa() {
        String dadosPessoas = "-- Lista de Pessoas Cadastradas: \n";
        for (Aluno aluno : alunos.values()) {
            dadosPessoas += aluno + "\n";
        }

        for (Funcionario funcionario : funcionarios.values()) {
            dadosPessoas += funcionario + "\n";
        }

        for (Professor professor : professores.values()) {
            dadosPessoas += professor + "\n";
        }


        JTextArea area = new JTextArea(dadosPessoas);
        JScrollPane painelScroll = new JScrollPane(area);
        painelScroll.setPreferredSize(new Dimension(1000,500));
        JOptionPane.showMessageDialog(null, painelScroll);

    }

    public void excluirPessoa() {

        Integer opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual e o tipo de pessoa que deseja excluir? \n"
                + "1 - Para Aluno \n"
                + "2 - Para Funcion�rio \n"
                + "3 - Para Professor"));
        if (opcao == 1 ) {
            String dadosPessoas = "Tipo: ";
            for (Aluno aluno : alunos.values()) {
                dadosPessoas += "Alunos: \n" + aluno + "\n";
            }
            Integer matriculaEscolhida = Integer.parseInt("Qual e a matricula do aluno que deseja excluir? \n"
                    + dadosPessoas);
            alunos.remove(matriculaEscolhida);
        } else if (opcao == 2) {
            String dadosPessoas = "Tipo: ";
            for (Funcionario funcionario : funcionarios.values()) {
                dadosPessoas += "Funcion�rios: \n" + funcionario + "\n";
            }
            Integer matriculaEscolhida = Integer.parseInt("Qual e a matricula do funcionario que deseja excluir? \n"
                    + dadosPessoas);
            funcionarios.remove(matriculaEscolhida);

        } else if (opcao == 3) {
            String dadosPessoas = "Tipo: ";
            for (Professor professor : professores.values()) {
                dadosPessoas += "Professores: \n" + professor + "\n";
            }
            Integer matriculaEscolhida = Integer.parseInt("Qual e a matricula do professor que deseja excluir? \n"
                    + dadosPessoas);
            professores.remove(matriculaEscolhida);

        } else {
            JOptionPane.showMessageDialog(null, "Insira um tipo de pessoa valida!");
        }






    }

	/* private void cadastroRapidoPessoa() {

		contadorPessoas++;
		Funcionario funcionarioRapido1 = new Funcionario ();
		funcionarios.put(funcionarioRapido1.getMatricula(), funcionarioRapido1);

		contadorPessoas++;
		Funcionario funcionarioRapido2 = new Funcionario ();
		funcionarios.put(funcionarioRapido2.getMatricula(), funcionarioRapido2);

		contadorPessoas++;
		Professor professorRapido1 = new Professor ();
		professores.put(professorRapido1.getMatricula(), professorRapido1);

		contadorPessoas++;
		Professor professorRapido2 = new Professor ();
		professores.put(professorRapido2.getMatricula(), professorRapido2);

		contadorPessoas++;
		Professor professorRapido3 = new Professor ();
		professores.put(professorRapido3.getMatricula(), professorRapido3);

		contadorPessoas++;
		Professor professorRapido4 = new Professor ();
		professores.put(professorRapido4.getMatricula(), professorRapido4);


	} */

    public HashMap<Integer, Aluno> getAluno(){
        return alunos;
    }

    public HashMap<Integer, Professor> getProfessor(){
        return professores;
    }

    public HashMap<Integer, Funcionario> getFuncionario(){
        return funcionarios;
    }

}



