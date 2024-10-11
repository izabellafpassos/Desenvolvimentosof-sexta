package prova;

public class RelatorioFactory {
    public static Relatorio criarRelatorio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "csv":
                return new RelatorioCvs();
            case "pdf":
                return new RelatorioPdf();
            case "excel":
                return new RelatorioExel();
            default:
                throw new IllegalArgumentException("tipo de rlatorio nao suportado: " + tipo);
        }
    }
}
