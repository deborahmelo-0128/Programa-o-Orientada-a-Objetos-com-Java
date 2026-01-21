package Modulo2;

public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {

    @Override
    public void publicar(PublicavelInterface publicavel) {
        System.out.println("Publicando livro...");
        publicavel.publicar();
    }
}
