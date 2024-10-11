package Injecao_de_dependencia;

public class boleto extends metodo_pgto {
    public String nosso_numero = "";

    @Override
    public Boolean executar_pgto() {
        // Código específico do boleto
        super.executar_pgto();
        return true;
    }

}
