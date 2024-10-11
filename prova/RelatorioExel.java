package prova;

public class RelatorioExel implements Relatorio {
    @Override
    public void gerar(String conteudo) {
        System.out.println("Gerando relatório Excel: " + conteudo);
    }
}
