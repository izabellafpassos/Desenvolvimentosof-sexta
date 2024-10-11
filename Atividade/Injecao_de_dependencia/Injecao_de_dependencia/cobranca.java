package Injecao_de_dependencia;

public class cobranca {
    private iMetodo_pgto metodo_pgto;

    // Injecao via construtor
    cobranca(iMetodo_pgto metodopgto) {
        this.metodo_pgto = metodopgto;
    }

    public Boolean cobrar() {
        return this.metodo_pgto.executar_pgto();
    }

    // Injecao via setter
    public void setMetodoCobranca(iMetodo_pgto metodopgto) {
        this.metodo_pgto = metodopgto;
    }

}
