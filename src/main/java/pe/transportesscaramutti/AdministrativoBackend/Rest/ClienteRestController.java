/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.transportesscaramutti.AdministrativoBackend.Rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.transportesscaramutti.AdministrativoBackend.Modelo.Cliente;
import pe.transportesscaramutti.AdministrativoBackend.Service.ClienteService;

/**
 *
 * @author felix
 */
@CrossOrigin(origins = "*")
@RestController
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "/cliente", method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> listAllClientes() {
        List<Cliente> clientes = clienteService.findAllClientes();
        if (clientes.isEmpty()) {
            return new ResponseEntity<List<Cliente>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente/{idCliente}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> getCliente(@PathVariable("idCliente") long idCliente) {
        System.out.println("Fetching cliente with id " + idCliente);
        Cliente user = clienteService.findByIdCliente(idCliente);
        if (user == null) {
            System.out.println("cliente with id " + idCliente + " not found");
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Cliente>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/cliente", method = RequestMethod.POST)
    public ResponseEntity<?> createCliente(@RequestBody Cliente cliente) {

        try {
            if (clienteService.isClienteExist(cliente)) {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }

            clienteService.saveCliente(cliente);

            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @RequestMapping(value = "/cliente/{idCliente}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCliente(@PathVariable("idCliente") long idCliente, @RequestBody Cliente cliente) {
        
        try {
            Cliente currentCliente = clienteService.findByIdCliente(idCliente);

            if (currentCliente == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            currentCliente.setNumeroRUC(cliente.getNumeroRUC());
            currentCliente.setRazonSocial(cliente.getRazonSocial());
            currentCliente.setDireccionCliente(cliente.getDireccionCliente());
            currentCliente.setEmailCliente(cliente.getEmailCliente());
            currentCliente.setEstadoCliente(cliente.getEstadoCliente());

            clienteService.updateCliente(currentCliente);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
    
    @RequestMapping(value = "/cliente/{idCliente}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCliente(@PathVariable("idCliente") long idCliente) {
        System.out.println("Fetching and Deleting Cliente with id " + idCliente);
        try {
            Cliente cliente = clienteService.findByIdCliente(idCliente);

            if (cliente == null) {
                System.out.println("Unable to delete. User with id " + idCliente + " not found");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }

            clienteService.deleteClienteById(idCliente);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
    
    @RequestMapping(value = "/cliente", method = RequestMethod.DELETE)
    public ResponseEntity<Cliente> deleteAllClientes() {
        System.out.println("Deleting all Clientes");
        clienteService.deleteAllClientes();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    

    
}
