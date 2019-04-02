public class Aluno extends Pessoa {

    private Curso cursoMatriculado;

    public Aluno (String nome, Integer cpf, String dataNascimento, String telefone, Integer matricula, String tipo, Curso cursoMatriculado) {
        super (nome, cpf, dataNascimento, telefone, matricula, tipo);
        this.cursoMatriculado = cursoMatriculado;

    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Matricula: " + super.getMatricula() + "; Nome: " + super.getNome() + "; CPF: " + super.getCpf() + "; Data Nasc: "
                + super.getDataNascimento() + "; Telefone:" + super.getTelefone() + "; Tipo: " + super.getTipo();

    }

}
