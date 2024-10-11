package Observer;


public class observadorEstudante extends absObserver {

    //propriedade com o objeto observado
    private nota nota_observada;//ponto de atençao o ideal é utilizar um contrato para 
    //abstrair o objeto observado
    //construtor
    public observadorEstudante(nota nota_observada) {
        this.nota_observada = nota_observada;
        this.nota_observada.attach(this);
        //esse ojeto tem que se increver no observado 
}
    public void update(){
        System.out.println("Estudante recebeu a notificaçao");
     
    }
}
