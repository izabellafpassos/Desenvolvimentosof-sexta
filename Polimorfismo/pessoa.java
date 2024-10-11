package Polimorfismo;
public abstract class pessoa {
    public String nome = "";
    public String email = "";
    public String cpf = "";

    public void Salvar() {
        // Classes não podem imprimir no terminal
        System.out.println("gravando no banco de dados ");
    }

    public void Consultar() {
System.out.println("consultando Banco de dados");
    }
}
