package sla.library.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import sla.library.connection.ConectorBD;
import sla.library.domain.entity.Cliente;
import sla.library.domain.entity.Endereco;
import sla.library.domain.entity.Entidade;
import sla.library.domain.entity.Telefone;

public class Repository {

    List<Entidade> lista = new ArrayList<>();

    public void save(Entidade e) {
        String sql = "insert into "
                + e.getName() + " "
                + e.getParams() + " values "
                + e.toSQLParams();

        lista.add(e);
        ConectorBD.execute(sql);
    }

    public Optional find(Entidade busca) {
        Optional x = null;

        for (Entidade atual : lista) {
            if (busca != null && busca.getKey().equals(atual.getKey())) {
                x = Optional.of(atual);
            }
        }

//        String sql = "select * from "
//                + e.getName()
//                + " where id = "
//                + e.getKey();
//        ConectorBD.executeQuery(sql);
//        return Optional.of(new Cliente(15, "Ex", new Endereco("A", "V", "b", "c"),new Telefone(1,"123") ));
        return x;
    }

    public void delete(Entidade e) {
        String sql = "delete from "
                + e.getName()
                + " where id = "
                + e.getKey();
        ConectorBD.execute(sql);

    }

    public void update(Entidade e) {
        String sql = "update "
                + e.getName() + " "
                + e.getUpdateParams()
                + " where id = "
                + e.getKey();
        ConectorBD.execute(sql);
    }

}
