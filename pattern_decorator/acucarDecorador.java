package pattern_decorator;

public class acucarDecorador extends absDecorador {
    public acucarDecorador(iBebida bebida){
        super(bebida);
    }

    @Override
    public String GetDescricao() {
        
        return super.GetDescricao()+"acucar";
    }

    @Override
    public Double GetPreco() {
        
        return super.GetPreco()+1.00;
    }

}
