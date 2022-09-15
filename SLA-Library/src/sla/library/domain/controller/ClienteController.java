package sla.library.domain.controller;

import java.util.Optional;
import sla.library.domain.entity.Cliente;
import sla.library.domain.repository.ClienteRepository;

public class ClienteController {

    private ClienteRepository repositorioCliente;

    public ClienteController(ClienteRepository repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }
    
    public void save(Cliente c) {
        repositorioCliente.save(c);
    }

    public void update(Integer id, Cliente novo) {
        Cliente busca = find(id);
        novo.setId(busca.getId());
        repositorioCliente.delete(busca);
        repositorioCliente.update(novo);
    }

    public void delete(Integer id) {
        repositorioCliente.delete(find(id));
    }

    public Cliente find(Integer id) {
        Optional x = repositorioCliente.find(new Cliente(id));
        return (Cliente) x.get();
    }

}
