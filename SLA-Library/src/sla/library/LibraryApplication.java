package sla.library;

import sla.library.domain.controller.ClienteController;
import sla.library.domain.entity.Cliente;
import sla.library.domain.entity.Endereco;
import sla.library.domain.entity.Telefone;
import sla.library.domain.repository.ClienteRepository;



public class LibraryApplication {
    public static ClienteController controladorCliente = new ClienteController(new ClienteRepository());
    
    
    public static void main(String[] args) {
        Telefone t = new Telefone(0, "77777777");
        Cliente z = new Cliente(0, "Edvan", new Endereco("4545", "BA", "VDC", "Z"), t);
        
        controladorCliente.save(z);
        System.out.println(controladorCliente.find(15).toSQLParams());
        controladorCliente.update(10,z);
        controladorCliente.delete(1);
        
    }

}
