package pattern_decorator;

public class cafe implements iBebida{

    @Override
    public String GetDescricao() {
        
        return "café";
    }

    @Override
    public Double GetPreco() {
       
        return 3.00;
    }

}
