package br.apiEd.cliente.service;

import br.apiEd.cliente.entity.Cliente;
import br.apiEd.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscaId(Long id){
        return clienteRepository.findById(id);
    }
    public void removeById(Long id){
        clienteRepository.deleteById(id);
    }
}


