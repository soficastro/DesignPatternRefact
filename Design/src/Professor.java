public class Professor extends Funcionario {

    private String formacao;

    public Professor(String nome, Integer cpf, String dataNascimento, String telefone, Integer matricula, String tipo, String dataAdmissao, Double salario, String formacao) {
        super (nome, cpf, dataNascimento, telefone, matricula, tipo, dataAdmissao, salario);
        this.formacao = formacao;

    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Matricula: " + super.getMatricula() + "; Nome: " + super.getNome() + "; CPF: " + super.getCpf() + "; Data Nasc: "
                + super.getDataNascimento() + "; Telefone:" + super.getTelefone() + "; Tipo: " + super.getTipo();

    }

}
