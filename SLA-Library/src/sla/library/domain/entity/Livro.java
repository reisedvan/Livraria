package sla.library.domain.entity;

public class Livro {

    private String isbn;
    private String autor;
    private String titulo;
    private String descricao;
    private Editora editora;
    private int quantidade;
    private double valor;

    public Livro(String isbn, String autor, String titulo, String descricao, Editora editora, int quantidade, double valor) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.descricao = descricao;
        this.editora = editora;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
