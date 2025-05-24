//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 21, "Java", "Senior");
        AdministradorRede administradorRede = new AdministradorRede("Joana", 15, "CFA","Linux" );

        desenvolvedor.exibirDados();
        desenvolvedor.desenvolverProjetos();
        desenvolvedor.atualizarProjeto();
        desenvolvedor.exibirTecnologiasUsadas();
        desenvolvedor.revisarCodigo();
        System.out.println("");

        administradorRede.exibirDados();
        administradorRede.monitorarRede();
        administradorRede.realizarBackup();
    }
}