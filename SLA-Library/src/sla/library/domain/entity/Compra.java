package sla.library.domain.entity;

import java.util.Date;
import java.util.List;

public class Compra implements Entidade {

    private Integer id;
    private Date data_compra;
    private Cliente cliente;
    private double valor_total;
    private List<Item> produtos;

    public Compra(Integer id) {
        this.id = id;
    }

    public Compra(Integer id, Date data_compra, Cliente cliente, double valor_total, List<Item> produtos) {
        this.id = id;
        this.data_compra = data_compra;
        this.cliente = cliente;
        this.valor_total = valor_total;
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data_compra.getYear() + "-" + data_compra.getMonth() + "-" + data_compra.getDay();
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public List<Item> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Item> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toSQLParams() {

        return "("
                + id + ",\n\""
                + getData() + "\",\n"
                + cliente.getId() + ",\n"
                + valor_total + ")";

    }

    @Override
    public String getParams() {
        return "(id,data_compra,cliente_id,valor_total)";
    }

    @Override
    public String getName() {
        return "compra";
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getUpdateParams() {

        return "set id ="+ id + ",\n"
                +"set data_compra =\""+ getData() + "\",\n"
                +"set cliente_id ="+ cliente.getId() + ",\n"
                +"set valor_total ="+ valor_total + "";
    }
}
