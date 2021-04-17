/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ClienteRepository;
import dao.IngredienteRepository;
import dao.PedidoRepository;
import dao.ProductoRepository;
import dao.UsuarioRepository;

/**
 *
 * @author Alfon
 */
public class Control {
     private ClienteRepository clienteRepository;
    private IngredienteRepository ingredienteRepository;
    private PedidoRepository pedidoRepository;
    private ProductoRepository productoRepository;
    private UsuarioRepository usuarioRepository;

    public ClienteRepository getClienteRepository() {
        if (this.clienteRepository == null) {
            return this.clienteRepository=new ClienteRepository();
        }
        return clienteRepository;
    }
    
    public IngredienteRepository getIngredienteRepository() {
        if (this.ingredienteRepository == null) {
            return new IngredienteRepository();
        }
        return ingredienteRepository;
    }
    
    public PedidoRepository getPedidoRepository() {
        if (this.pedidoRepository == null) {
            return new PedidoRepository();
        }
        return pedidoRepository;
    }
    
    public ProductoRepository getProductoRepository() {
        if (this.productoRepository == null) {
            return new ProductoRepository();
        }
        return productoRepository;
    }
    
    public UsuarioRepository getUsuarioRepository() {
        if (this.usuarioRepository == null) {
            return new UsuarioRepository();
        }
        return usuarioRepository;
    }
    
}
