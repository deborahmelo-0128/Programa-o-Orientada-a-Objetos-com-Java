package Modulo2;

public class LivroRaro extends LivroDecorator {

    public LivroRaro(ItemEmprestavel item) {
        super(item);
    }

    @Override
    public boolean podeEmprestar() {
        return false;
    }

    @Override
    public String getDescricao() {
        return item.getDescricao() + " | Livro raro";
    }
}

