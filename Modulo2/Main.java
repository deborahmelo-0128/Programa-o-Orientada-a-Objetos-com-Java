package Modulo2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date retirada = new Date();
        Date devolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(retirada, devolucao, livro, usuario);

        livro.validarDisponibilidade();

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println();
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println();
        System.out.println("Genero: " + livro.getGenero());
        System.out.println();
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println();
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println();
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println();
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}

