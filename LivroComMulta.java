package Modulo2;

public class LivroComMulta extends LivroDecorator {

    public LivroComMulta(ItemEmprestavel item) {
        super(item);
    }

    @Override
    public String getDescricao() {
        return item.getDescricao() + " | Multa por atraso";
    }
}

