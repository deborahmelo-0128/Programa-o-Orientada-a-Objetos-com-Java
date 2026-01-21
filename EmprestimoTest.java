package Modulo3;

import Modulo2.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    @Test
    void deveCriarEmprestimoComItemDisponivel() {

        Autor autor = new Autor("Autor Teste", "Brasileiro", true);
        Livro livro = new Livro("Livro Teste", autor, "Tecnologia");
        Usuario usuario = new Usuario("João", 30);

        Emprestimo emprestimo = new Emprestimo(
                new Date(),
                new Date(),
                livro,
                usuario
        );

        assertNotNull(emprestimo);
        assertFalse(livro.podeEmprestar());
    }

    @Test
    void naoDeveEmprestarItemIndisponivel() {

        Autor autor = new Autor("Autor Teste", "Brasileiro", true);
        Livro livro = new Livro("Livro Teste", autor, "Tecnologia");
        Usuario usuario = new Usuario("João", 30);

        new Emprestimo(new Date(), new Date(), livro, usuario);

        assertThrows(
                IllegalStateException.class,
                () -> new Emprestimo(new Date(), new Date(), livro, usuario)
        );
    }
}

