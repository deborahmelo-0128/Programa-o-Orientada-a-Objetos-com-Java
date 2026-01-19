package Modulo3;

import Modulo2.Autor;
import Modulo2.Emprestimo;
import Modulo2.Livro;
import Modulo2.Usuario;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmprestimoTest {

    @Test
    void deveCriarEmprestimoCorretamente() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro(
                "Java Basics",
                autor,
                "Tecnologia"
        );

        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(
                dataRetirada,
                dataDevolucao,
                livro,
                usuario
        );

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());

        // Após empréstimo, livro deve ficar indisponível
        assertFalse(livro.isDisponivel());
    }
}

