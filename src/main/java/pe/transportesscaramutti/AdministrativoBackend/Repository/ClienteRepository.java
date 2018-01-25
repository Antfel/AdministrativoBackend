/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Repository;

import org.springframework.data.repository.CrudRepository;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Cliente;

/**
 *
 * @author felix
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
    Cliente findByNumeroRUC(String numeroRUC);
    Cliente findByRazonSocial(String razonSocial);
    
}
