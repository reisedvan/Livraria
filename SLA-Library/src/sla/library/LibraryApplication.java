package sla.library;

import sla.library.domain.entity.Cliente;
import sla.library.domain.entity.Endereco;
import sla.library.domain.entity.Entidade;
import sla.library.domain.entity.Telefone;
import sla.library.domain.repository.ClienteRepository;
import sla.library.domain.repository.Repository;
import sla.library.domain.repository.TelefoneRepository;

public class LibraryApplication {

    public static void main(String[] args) {
        Repository x = new ClienteRepository();
        Repository te = new TelefoneRepository();
        
        
        
        Telefone t = new Telefone(0, "77777777");
        Cliente z = new Cliente(0, "Edvan", new Endereco("4545", "BA", "VDC", "Z"), t);

        
        
        Cliente buscaC = new Cliente(7);
        Telefone busca = new Telefone(3);

        x.save(z);
        te.save(t);
        te.find(busca);
        x.find(buscaC);
        te.update(t);
        x.update(t);
        

    }

}
