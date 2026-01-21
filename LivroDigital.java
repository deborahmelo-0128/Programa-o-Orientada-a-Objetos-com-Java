package Modulo2;

public class LivroDigital extends LivroDecorator {

    public LivroDigital(ItemEmprestavel item) {
        super(item);
    }

    @Override
    public boolean podeEmprestar() {
        return true;
    }

    @Override
    public void emprestar() {
        // Não faz nada (digital não fica indisponível)
    }

    @Override
    public String getDescricao() {
        return item.getDescricao() + " | Versão digital";
    }
}

