package pattern_decorator;

public class teste {
    public static void main(String[] args) {
/// começa com o cafe
    cafe cafe_puro = new cafe(); 
    System.out.println(cafe_puro.GetDescricao() + " - " +cafe_puro.GetPreco());

    /// adiciona o leite
   leiteDecorator leite = new leiteDecorator(cafe_puro); 
    System.out.println(leite.GetDescricao() + " - " +leite.GetPreco());

    /// adiciona o açúcar
    acucarDecorador acucar = new acucarDecorador(leite);
    System.out.println(acucar.GetDescricao() + " - " +acucar.GetPreco());
    }
    }
