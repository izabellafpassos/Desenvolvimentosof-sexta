package Polimorfismo;
public class cliente extends pessoa {
 //construir um objeto da classe vendedor
 @Override
 public void Salvar(){
     super.Salvar();
     System.out.println("na tabela de cliente");       

   
    }
}
