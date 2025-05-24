public class AdministradorRede extends FuncionarioTI{
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, int matricula, String certificacao, String sistemaOperacionalResponsavel ) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.sistemaOperacionalResponsavel = sistemaOperacionalResponsavel;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }

    public String getSistemaOperacionalResponsavel() {
        return sistemaOperacionalResponsavel;
    }

    public void setSistemaOperacionalResponsavel(String sistemaOperacionalResponsavel) {
        this.sistemaOperacionalResponsavel = sistemaOperacionalResponsavel;
    }

    public void monitorarRede(){
        System.out.println(nome + " esta monitorando Rede.");
    }
    public void realizarBackup(){
        System.out.println(nome + " esta realizando Backup.");
    }
}
