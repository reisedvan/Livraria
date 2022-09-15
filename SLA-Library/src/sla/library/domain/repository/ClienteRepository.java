package sla.library.domain.repository;

import java.util.List;
import sla.library.domain.entity.Compra;


public class ClienteRepository extends Repository {
    
    
    public List<Compra> findCompras(String key){
        String sql = 
                "select * "
                + "from cliente "
                + "left join compra "
                + "on cliente.id = "+key
                + "and cliente.id = compra.cliente_id";
        System.out.println(sql);
    return null;
    }
    
}
