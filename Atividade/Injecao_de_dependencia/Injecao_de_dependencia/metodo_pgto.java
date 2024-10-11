package Injecao_de_dependencia;

public class metodo_pgto implements iMetodo_pgto {
    Double valor = 0.0;
    String situacao = "";

    public Boolean executar_pgto() {
        this.situacao = "pago";
        return true;
    }

}
