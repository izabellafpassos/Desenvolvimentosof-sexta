package prova;

public class RelatorioCvs implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório Cvs: " + conteudo);
    }
}
