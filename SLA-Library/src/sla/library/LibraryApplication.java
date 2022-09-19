package sla.library;

import sla.library.domain.controller.ClienteController;
import sla.library.domain.entity.Cliente;
import sla.library.domain.entity.Endereco;
import sla.library.domain.entity.Telefone;
import sla.library.domain.repository.ClienteRepository;
import sla.library.domain.repository.EnderecoRepository;
import sla.library.domain.repository.TelefoneRepository;
import sla.library.view.CadastroClienteExemplo;

public class LibraryApplication {

//    public static ClienteController controladorCliente = new ClienteController(new ClienteRepository());
    private static ClienteRepository clienteRepository = new ClienteRepository();
    private static EnderecoRepository enderecoRepository = new EnderecoRepository();
    private static TelefoneRepository telefoneRepository = new TelefoneRepository();

    public static void cadastrarEndereco(String cep, String uf, String cidade, String bairro, String rua, String numero) {
        Endereco e = new Endereco(cep, uf, cidade, bairro, rua, numero);
        enderecoRepository.save(e);
    }

    public static void cadastrarEndereco(String cep, String uf, String cidade, String bairro) {
        Endereco e = new Endereco(cep, uf, cidade, bairro);
        enderecoRepository.save(e);
    }

    public static void cadastrarTelefone(String numero) {
        Telefone t = new Telefone(0, numero);
        telefoneRepository.save(t);
    }

    public static void cadastrarCliente(Integer id, String nome, String cep, String numero) {
        Endereco endereco = buscaEndereco(cep);
        Telefone telefone = buscarTelefone(numero);
        Cliente c = new Cliente(id, nome, endereco, telefone);
        clienteRepository.save(c);
    }

    public static Endereco buscaEndereco(String key) {
        Endereco busca = new Endereco(key);
        return (Endereco) enderecoRepository.find(busca).get();
    }

    public static Cliente buscaCliente(String key) {
        Endereco busca = new Endereco(key);
        return (Cliente) clienteRepository.find(busca).get();
    }

    public static void main(String[] args) {
        CadastroClienteExemplo c = new CadastroClienteExemplo();
        c.setVisible(true);
    }

    private static Telefone buscarTelefone(String numero) {
        return (Telefone) telefoneRepository.find(new Telefone(numero)).get();

    }

}
