package sla.library.domain.entity;

public class Telefone implements Entidade {

    private Integer id;
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public Telefone(Integer id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toSQLParams() {
        return "("
                + id + ",\""
                + numero + "\""
                + ")";
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + '}';
    }

    @Override
    public String getParams() {
        return "( id,numero)";
    }

    @Override
    public String getName() {
        return "telefone";
    }

    @Override
    public String getKey() {
        return numero + "";
    }

    @Override
    public String getUpdateParams() {
        return "set id=" + id + ","
                + "set numero=\"" + numero + "\" ";

    }

}
