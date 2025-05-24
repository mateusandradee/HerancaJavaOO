public class Desenvolvedor extends FuncionarioTI{
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(String nome, int matricula, String linguagemPrincipal, String nivel) {
        super(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void desenvolverProjetos(){
        System.out.println(nome + " esta Desenvolvendo projetos..");
    }
    public void atualizarProjeto(){
        System.out.println(nome + " esta atualizando projetos..");
    }
    public void exibirTecnologiasUsadas(){
        System.out.println(nome + " esta usando "+linguagemPrincipal);
    }
    public void revisarCodigo(){
        System.out.println(nome + " esta revisando codigo.");
    }
}
