package sla.library.domain.entity;

public class Cliente implements Entidade {

    private Integer id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente(Integer id, String nome, Endereco endereco, Telefone telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }

    @Override
    public String toSQLParams() {
        return "("
                + id + ",\""
                + nome + "\",\""
                + endereco.getCep() + "\","
                + telefone.getId() + ")";
    }

    @Override
    public String getParams() {
        return "( id,nome,endereco_cep,telefone_id)";
    }

    @Override
    public String getName() {
        return "cliente";
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getUpdateParams() {
        return "set id =" + id + ","
                + "set nome =\"" + nome + "\","
                + "set endereco =\"" + endereco.getCep() + "\","
                + "set telefone =" + telefone.getId() + " ";

    }

}
