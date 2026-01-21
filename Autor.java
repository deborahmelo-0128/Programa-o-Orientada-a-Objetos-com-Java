package Modulo2;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private EstrategiaPublicacao estrategiaPublicacao;
    private String nome;
    private String nacionalidade;
    private boolean autorUsuario;
    private List<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.autorUsuario = false;
        this.obrasPublicadas = new ArrayList<>();
    }

    public Autor(String nome, String nacionalidade, boolean autorUsuario) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.autorUsuario = autorUsuario;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNome() {

        return nome;
    }

    public String getNacionalidade() {

        return nacionalidade;
    }

    public boolean isAutorUsuario() {

        return autorUsuario;
    }

    public boolean isUsuario() {
        return autorUsuario;
    }

    public List<Livro> getObrasPublicadas() {

        return obrasPublicadas;
    }

    public void adicionarLivro(Livro livro) {

        this.obrasPublicadas.add(livro);
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar(PublicavelInterface publicavel) {
        if (estrategiaPublicacao == null) {
            throw new IllegalStateException("Estratégia de publicação não definida");
        }
        estrategiaPublicacao.publicar(publicavel);
    }



}
