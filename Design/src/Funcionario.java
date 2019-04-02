public class Funcionario extends Pessoa {

    private String dataAdmissao;
    private Double salario;


    public Funcionario (String nome, Integer cpf, String dataNascimento, String telefone, Integer matricula, String tipo, String dataAdmissao, Double salario) {
        super (nome, cpf, dataNascimento, telefone, matricula, tipo);
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Matricula: " + super.getMatricula() + "; Nome: " + super.getNome() + "; CPF: " + super.getCpf() + "; Data Nasc: "
                + super.getDataNascimento() + "; Telefone:" + super.getTelefone() + "; Tipo: " + super.getTipo();

    }

}
