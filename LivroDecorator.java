package Modulo2;

public abstract class LivroDecorator implements ItemEmprestavel {

    protected ItemEmprestavel item;

    public LivroDecorator(ItemEmprestavel item) {
        this.item = item;
    }

    @Override
    public boolean podeEmprestar() {
        return item.podeEmprestar();
    }

    @Override
    public void emprestar() {
        item.emprestar();
    }

    @Override
    public String getDescricao() {
        return item.getDescricao();
    }
}

