
package sla.library.domain.entity;


public class Editora {
    private Integer id;
    private String nome_social;
    private Endereco endereco;
    private Telefone telefone;
    private String nome_gerente;

    public Editora(Integer id, String nome_social, Endereco endereco, Telefone telefone, String nome_gerente) {
        this.id = id;
        this.nome_social = nome_social;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nome_gerente = nome_gerente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
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

    public String getNome_gerente() {
        return nome_gerente;
    }

    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

   
    
    
}
