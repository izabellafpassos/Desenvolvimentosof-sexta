package Observer;

import java.util.ArrayList;

public class nota {
    private String situacao = "";///esta é a propriedade de intersse
    private ArrayList<absObserver> observadores = new ArrayList<absObserver>();

        
    public String getSituacao() {
        return situacao;
    }


    public void setSituacao(String situacao) {
        this.situacao = situacao;
        //notificar todos os observadores
        this.notificar();
    }
    
    private void notificar(){
        for (absObserver observador : observadores) {
            observador.update();
            //tudo que tiver na lista de observadores sera notificado
      }
    }
        public void attach(absObserver observer){
            this.observadores.add(observer);
        }
        public void dettach(absObserver observer){
            this.observadores.remove(observer);
        }
}
