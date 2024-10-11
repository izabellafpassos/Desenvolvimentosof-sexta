package Injecao_de_dependencia;

public class teste {
    public static void main(String[] args) {
    // Construi um boleto
        boleto invoice = new boleto();
        invoice.valor = 1000.0;
        invoice.nosso_numero = "123";

        //construir um objeto de cobranca
        cobranca Cobrador = new cobranca(invoice);
        Cobrador.cobrar();

        //Construir um cartão de crédito
        cartao_credito CC = new cartao_credito();
        CC.parcelas = 10;
        CC.valor = 1000.0;
        Cobrador.setMetodoCobranca(CC);
        Cobrador.cobrar();
    }
}
