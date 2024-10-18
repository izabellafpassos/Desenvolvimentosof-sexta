package pattern_decorator;

public class absDecorador implements iBebida {

   protected iBebida bebida;

        /////construtor
        public absDecorador(iBebida bebida) {
            this.bebida=bebida;

    }

    //metodo
 @Override
    public String GetDescricao() {
        /////propriedade para a bebida
            return "";
}
    @Override
    public Double GetPreco() {
        
        return 0.0;
    }
}
