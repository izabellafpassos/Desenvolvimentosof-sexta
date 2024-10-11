package Polimorfismo;

public class Desenhista {
    public Double getPerimetro(iFigura f){
        return f.Calcular_perimetro();
        
    }

    public void alteraCor(Retangulo r){
        r.cor = "Vermelho";
    }
}
