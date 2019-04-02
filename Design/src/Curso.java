public class Curso {

    private Integer id;
    private String nome;
    private Double valor;



    public Curso(CursoBuilder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.valor = builder.valor;

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ID: " + id + "; Nome: " + nome + "; Valor: " + valor;


    }

    public static class CursoBuilder {
        private Integer id;
        private String nome;
        private Double valor;

        public CursoBuilder(){
        }

        public CursoBuilder setValor(Double valor) {
            this.valor = valor;
            return this;
        }

        public CursoBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public CursoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Curso build() {
            return new Curso(this);
        }

    }

}
