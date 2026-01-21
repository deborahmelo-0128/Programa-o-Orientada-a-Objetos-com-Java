package Modulo3;

import Modulo2.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class EstrategiaPublicacaoTest {

    @Test
    void devePublicarLivroComEstrategiaDeLivro() {
        Autor autor = new Autor("Autor Livro", "Brasileiro", true);
        Livro livro = new Livro("Clean Code", autor, "Tecnologia");

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        assertDoesNotThrow(() -> autor.publicar(livro));
    }

    @Test
    void devePublicarArtigoComEstrategiaDeArtigo() {
        Autor autor = new Autor("Autor Artigo", "Brasileiro", true);
        Artigo artigo = new Artigo("SOLID na Prática", autor, "Tecnologia", true);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        assertDoesNotThrow(() -> autor.publicar(artigo));
    }
}
