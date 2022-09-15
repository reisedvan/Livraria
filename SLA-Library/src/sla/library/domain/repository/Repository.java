package sla.library.domain.repository;

import java.util.Optional;
import sla.library.domain.entity.Entidade;

public class Repository {

    public void save(Entidade e) {
        String sql = "insert into "
                + e.getName() + " "
                + e.getParams() + " values "
                + e.toSQLParams();
        System.out.println(sql);
    }

    public Optional find(Entidade e) {
        String sql = "select * from "
                + e.getName()
                + " where id = "
                + e.getKey();
        System.out.println(sql);
        return null;
    }

    public void delete(Entidade e) {
        String sql = "delete from "
                + e.getName()
                + " where id = "
                + e.getKey();
        System.out.println(sql);
    }

    public void update(Entidade e) {
        String sql = "update "
                + e.getName() + " "
                + e.getUpdateParams()
                + " where id = "
                + e.getKey();
    }

}
