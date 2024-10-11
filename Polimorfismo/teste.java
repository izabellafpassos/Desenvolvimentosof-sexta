package Polimorfismo;
public class teste {
public static void main(String[] args) {
    //construir um objeto da classe vendedor a partit do construtor padrao 
    //o objeto nao tera estado (atributos sem valores)
    vendedor Vendedor = new vendedor();//construir
    Vendedor.nome = "Pedro de Lara";//atribui estado
    Vendedor.salario = 12000.0;//atribui estado
    System.out.println(Vendedor.nome);
    //construir um ojeto a partit do cpf
    //o objeto tera os vlaores conforme a imolementaçao do construtor
    vendedor Vendedor2 = new vendedor("999");
    System.out.println(Vendedor2.nome);//imorime o nome araci de almeida
    
     
    cliente Cliente = new cliente();
    Cliente.Salvar();
}

}
