package sla.library.domain.entity;

public class Endereco implements Entidade {

    public String cep;
    public String uf;
    public String cidade;
    public String bairro;
    public String rua;
    public String numero;

    public Endereco(String cep) {
        this.cep = cep;
    }

    public Endereco(String cep, String uf, String cidade, String bairro) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = "";
        this.numero = "";
    }

    public Endereco(String cep, String uf, String cidade, String bairro, String rua, String numero) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    /*
    cep,
    uf,
    cidade,
    bairro,
    rua,
    numero,
    
     */
    @Override
    public String toSQLParams() {
        return "(\"" + cep + "\","
                + "\"" + uf + "\","
                + "\"" + cidade + "\","
                + "\"" + bairro + "\","
                + "\"" + rua + "\","
                + "" + numero + ")";
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", uf=" + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + '}';
    }

    @Override
    public String getName() {
        return "endereco";
    }

    @Override
    public String getParams() {
        return "(cep,"
                + "uf,"
                + "cidade,"
                + "bairro,"
                + "rua,"
                + "numero)";
    }

    @Override
    public String getUpdateParams() {
        return "set cep=" + cep + ","
                + "set uf=" + uf + ","
                + "set cidade=" + cidade + ","
                + "set bairro=" + bairro + ","
                + "set rua=" + rua + ","
                + "set numero=" + numero + ")";
    }

    @Override
    public String getKey() {
        return cep;
    }

}
