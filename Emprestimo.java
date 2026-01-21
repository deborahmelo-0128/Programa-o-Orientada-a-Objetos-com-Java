package Modulo2;

import java.util.Date;

public class Emprestimo {

    private final Date dataRetirada;
    private final Date dataDevolucao;
    private final ItemEmprestavel item;
    private final Usuario usuario;

    public Emprestimo(Date dataRetirada, Date dataDevolucao, ItemEmprestavel item, Usuario usuario) {

        if (!item.podeEmprestar()) {
            throw new IllegalStateException("Item indisponível para empréstimo");
        }

        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.item = item;
        this.usuario = usuario;

        item.emprestar();
        usuario.adicionarEmprestimo(this); // ✅ REGISTRA O EMPRÉSTIMO
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ItemEmprestavel getItem() {
        return item;
    }
}
