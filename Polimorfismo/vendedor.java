package Polimorfismo;
public class vendedor extends pessoa {
        //sobrecarga do metedo construtor
        //metodo construtor não requer modificador de acesso
        //metodo construtor tem o mesmo nome da classe
        vendedor(){}
        
        vendedor(String cpf, String email, String nome, Double salario){
            this.cpf = cpf;
            this.nome = nome;
            this.email =email;
            this.salario =salario;
        }
        vendedor(String cpf){
            if(cpf.equals("888")){
                this.nome = "Pedro de Lara";
                //carregar demais atributos 
            }
        if(cpf.equals("999")){
            this.nome = "Araci de Almeida";
            //carregar demais atributos 
        }
    }

    public double salario = 0.0;

    @Override
    public void Salvar(){
        super.Salvar();
        System.out.println("na tabela de vendedores");       
    }
}
