
package sla.library.domain.entity;


public interface Entidade {
    public String toSQLParams();
    public String getName();
    public String getParams();
    public String getUpdateParams();
    public String getKey();
}
