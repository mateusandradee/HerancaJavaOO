public class FuncionarioTI {
    protected String nome;
    protected int matricula;

    public FuncionarioTI(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s\nMatricula: %d\n", nome, matricula);
    }
    public void atualizarCadastro(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Nome atualizado: " + nome +". Matricula atualizada: "+matricula);
    }
}
