package Injecao_de_dependencia;

public class cartao_credito extends metodo_pgto {
    // Lógica específica
    public int parcelas = 0;

    @Override
    public Boolean executar_pgto() {
        // código específico do cartão
        // Lembrar do tratamento de exceções
        super.executar_pgto();
        return true;
    }

}
