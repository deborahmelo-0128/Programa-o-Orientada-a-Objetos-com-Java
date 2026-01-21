package Modulo3;

import Modulo2.Autor;
import Modulo2.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    void deveCriarLivroDisponivelPorPadrao() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Básico", autor, "Tecnologia");

        assertTrue(livro.isDisponivel());
    }

    @Test
    void deveRetornarTituloCorreto() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Básico", autor, "Tecnologia");

        assertEquals("Java Básico", livro.getTitulo());
    }
}
