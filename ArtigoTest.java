package Modulo3;

import Modulo2.Artigo;
import Modulo2.Autor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    void deveCriarArtigoPublicado() {
        Autor autor = new Autor("Alan Turing", "Inglês", true);

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                true
        );

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
        assertEquals(autor, artigo.getAutor());
    }
}
