package prova;

public class Teste {
    public static void main(String[] args) {
        Relatorio relatorioCvs = RelatorioFactory.criarRelatorio("csv");
        Relatorio relatorioPdf = RelatorioFactory.criarRelatorio("pdf");
        Relatorio relatorioExel = RelatorioFactory.criarRelatorio("excel");

        relatorioCvs.gerar("conteúdo do relatório CSV");
        relatorioPdf.gerar("conteúdo do relatório PDF");
        relatorioExel.gerar("conteúdo do relatório Excel");
    }
}
