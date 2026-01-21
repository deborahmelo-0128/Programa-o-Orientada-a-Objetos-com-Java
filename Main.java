package Modulo2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Alan Turing", "Inglês", true);

        Livro livroFisico = new Livro(
                "Java for Beginners",
                autor,
                "Tecnologia"
        );

        // Decorator aplicado
        ItemEmprestavel livroComMulta = new LivroComMulta(livroFisico);

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Emprestimo emprestimo = new Emprestimo(
                new Date(),
                new Date(),
                livroComMulta,
                usuario
        );

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                true
        );

        System.out.println(livroComMulta.getDescricao());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());

        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Publicado: " + artigo.isPublicado());
    }
}

