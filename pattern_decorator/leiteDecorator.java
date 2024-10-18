package pattern_decorator;

public class leiteDecorator extends absDecorador {
//construtor

    public leiteDecorator(iBebida bebida){
        super(bebida);
    }
    @Override
    public String GetDescricao(){
        return bebida.GetDescricao() + "leite";

    }
    @Override
    public Double GetPreco(){
        return bebida.GetPreco() + 2.0;
    }
}
