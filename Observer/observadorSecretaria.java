package Observer;


public class observadorSecretaria extends absObserver {

    //propriedade com o objeto observado
    private nota nota_observada;//ponto de atençao o ideal é utilizar um contrato para 
    //abstrair o objeto observado
    //construtor
    public observadorSecretaria(nota nota_observada) {
        this.nota_observada = nota_observada;
        this.nota_observada.attach(this);
        //esse ojeto tem que se increver no observado 
}
}