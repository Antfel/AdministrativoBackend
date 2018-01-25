/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Service;

import java.util.List;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Cliente;

/**
 *
 * @author felix
 */
public interface ClienteService {
    
    Cliente findByIdCliente(long idCliente);
    Cliente findByNumeroRUC(String numeroRUC);
    Cliente findByRazonSocial(String razonSocial);
    void saveCliente(Cliente cliente);
    void updateCliente(Cliente cliente);
    void deleteClienteById(long idCliente);
    List<Cliente> findAllClientes();
    void deleteAllClientes();
    public boolean isClienteExist(Cliente cliente);
}
