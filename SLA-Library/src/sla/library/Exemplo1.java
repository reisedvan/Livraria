package sla.library;

public class Exemplo1 {
    private Integer id;
    private String senha;

    public Exemplo1() {
        
    }

    public Exemplo1(Integer id, String senha) {
        this.id = id;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Exemplo1:{\n\t\"id\":"+id+",\n\t\"senha\":\""+senha+"\"\n}";
    }
    
    
    
    
}
