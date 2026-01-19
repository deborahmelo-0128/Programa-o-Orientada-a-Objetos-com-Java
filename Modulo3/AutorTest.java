package Modulo3;

import Modulo2.Autor;
import Modulo2.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutorTest {

    @Test
    void deveRetornarNomeDoAutor() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    void deveRetornarNacionalidade() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Inglês", autor.getNacionalidade());
    }

    @Test
    void deveAdicionarLivroNaListaDeObras() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");

        assertEquals(1, autor.getObrasPublicadas().size());
        assertEquals(livro, autor.getObrasPublicadas().get(0));
    }
}


