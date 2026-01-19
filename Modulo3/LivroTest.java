package Modulo3;

import Modulo2.Autor;
import Modulo2.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LivroTest {

    @Test
    void deveCriarLivroDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "Tecnologia");

        assertTrue(livro.isDisponivel());
    }

    @Test
    void deveRetornarTituloDoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "Tecnologia");

        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    void deveRetornarGeneroDoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "Tecnologia");

        assertEquals("Tecnologia", livro.getGenero());
    }

    @Test
    void deveAlterarDisponibilidadeDoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "Tecnologia");

        livro.setDisponivel(false);

        assertFalse(livro.isDisponivel());
    }
}
