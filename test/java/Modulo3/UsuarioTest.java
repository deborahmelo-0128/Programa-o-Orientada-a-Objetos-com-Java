package Modulo3;

import Modulo2.Usuario;
import Modulo2.Emprestimo;
import Modulo2.Livro;
import Modulo2.Autor;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    @Test
    void deveRetornarIdadeDoUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    void deveAdicionarEmprestimoAoHistorico() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Autor autor = new Autor("Alan Turing", "Inglês");

        Livro livro = new Livro("Java Basics", autor, "Tecnologia");

        Emprestimo emprestimo = new Emprestimo(
                new Date(),
                new Date(),
                livro,
                usuario
        );

        assertEquals(1, usuario.getHistoricoEmprestimos().size());
    }
}

