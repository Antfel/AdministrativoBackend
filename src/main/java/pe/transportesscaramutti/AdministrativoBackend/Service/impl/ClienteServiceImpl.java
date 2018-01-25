/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Cliente;
import pe.transportesscaramutti.AdministrativoBackend.Repository.ClienteRepository;
import pe.transportesscaramutti.AdministrativoBackend.Service.ClienteService;

/**
 *
 * @author felix
 */
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    private static List<Cliente> clientes;
    
    @Override
    public Cliente findByIdCliente(long idCliente) {
        return clienteRepository.findOne(idCliente);
    }

    @Override
    public Cliente findByNumeroRUC(String numeroRUC) {
        return clienteRepository.findByNumeroRUC(numeroRUC);
    }

    @Override
    public Cliente findByRazonSocial(String razonSocial) {
        return clienteRepository.findByRazonSocial(razonSocial);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteClienteById(long idCliente) {
        clienteRepository.delete(idCliente);
    }

    @Override
    public List<Cliente> findAllClientes() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public void deleteAllClientes() {
        clienteRepository.deleteAll();
    }

    @Override
    public boolean isClienteExist(Cliente cliente) {
        return clienteRepository.findOne(cliente.getIdCliente())!=null;
    }
    
}
