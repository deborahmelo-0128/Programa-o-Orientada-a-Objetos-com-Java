package Modulo2;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {

    @Override
    public void publicar(PublicavelInterface publicavel) {
        System.out.println("Publicando artigo...");
        publicavel.publicar();
    }
}
