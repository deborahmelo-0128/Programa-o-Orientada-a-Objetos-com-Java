package Modulo2;

public class Livro implements ItemEmprestavel, PublicavelInterface  {

    private final String titulo;
    private final Autor autor;
    private final String genero;
    private boolean emprestado;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = false;
        autor.adicionarLivro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public boolean podeEmprestar() {
        return !emprestado;
    }

    @Override
    public void emprestar() {
        if (!podeEmprestar()) {
            throw new IllegalStateException("Livro já emprestado");
        }
        this.emprestado = true;
    }

    public boolean isDisponivel() {
        return podeEmprestar();
    }

    @Override
    public String getDescricao() {
        return "Livro: " + titulo;
    }

    @Override
    public void publicar() {
        System.out.println("Livro publicado: " + titulo);
    }

}
