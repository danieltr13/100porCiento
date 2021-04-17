/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ClienteRepository;
import dominio.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ControlCliente {
     private final Control control = new Control();
    private final ClienteRepository clientesRepo = control.getClienteRepository();
    
    
    public boolean guardarCliente(Cliente cliente) {
        return this.clientesRepo.guardar(cliente);
    }

    public boolean eliminarCliente(Long idCliente) {
        return this.clientesRepo.eliminar(idCliente);
    }

    public boolean actualizarCliente(Cliente cliente) {
         return this.clientesRepo.actualizar(cliente);
    }

    public Cliente obtenerClientePorId(Long idCliente) {
        return this.clientesRepo.buscarporID(idCliente);
    }

    public ArrayList<Cliente> obtenerClientes() {
        return this.clientesRepo.buscarTodas();
    }

    public List obtenerClientesNombre(String nombre){
        return clientesRepo.buscarComo(nombre);
    }
}
