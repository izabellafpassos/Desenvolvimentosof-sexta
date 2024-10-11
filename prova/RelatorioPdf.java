package prova;

public class RelatorioPdf implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório PDF: " + conteudo);
    }
}