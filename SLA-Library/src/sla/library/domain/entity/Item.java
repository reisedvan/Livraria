package sla.library.domain.entity;

public class Item {

    private Compra compra;
    private Livro livro;
    private Integer quantidade;

    public Item(Compra compra, Livro livro, Integer quantidade) {
        this.compra = compra;
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
