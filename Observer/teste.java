package Observer;

public class teste {
    public static void main(String[] args) {
        nota nota = new nota();
        observadorEstudante estudante = new observadorEstudante(nota);
        observadorSecretaria secretaria = new observadorSecretaria(nota);
        nota.setSituacao("lançada");
    }
}
