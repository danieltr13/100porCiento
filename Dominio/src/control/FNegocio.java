/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dominio.Cliente;
import dominio.Ingrediente;
import dominio.Pedido;
import dominio.Producto;
import dominio.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Alfon
 */
public class FNegocio implements INegocio{
        
    private final ControlCliente controlCliente;
    private final ControlIngrediente controlIngrediente;
    private final ControlPedido controlPedido;
    private final ControlUsuario controlUsuario;
    private final ControlProducto controlProducto;

    public FNegocio() {
        this.controlCliente= new ControlCliente();
        this.controlIngrediente= new ControlIngrediente();
        this.controlPedido= new ControlPedido();
        this.controlUsuario= new ControlUsuario();
        this.controlProducto= new ControlProducto();
    }
   
    
    @Override
    public boolean guardarProducto(Producto producto) {
        return controlProducto.guardarProducto(producto);
    }

    @Override
    public boolean guardarCliente(Cliente cliente) {
        return controlCliente.guardarCliente(cliente);
    }

    @Override
    public boolean guardarIngrediente(Ingrediente producto) {
        return controlIngrediente.guardarIngrediente(producto);
    }

    @Override
    public boolean guardarPedido(Pedido pedido) {
        return controlPedido.guardarPedido(pedido);
    }

    @Override
    public boolean guardarUsuario(Usuario usario) {
        return controlUsuario.guardarUsuario(usario);
    }

    @Override
    public boolean eliminarProducto(Long idProducto) {
        return controlProducto.eliminarProducto(idProducto);
    }

    @Override
    public boolean eliminarCliente(Long idCliente) {
        return controlCliente.eliminarCliente(idCliente);
    }

    @Override
    public boolean eliminarIngrediente(Long idIngrediente) {
        return controlIngrediente.eliminarIngrediente(idIngrediente);
    }

    @Override
    public boolean eliminarPedido(Long idPedido) {
        return controlPedido.eliminarPedido(idPedido);
    }

    @Override
    public boolean eliminarUsuario(Long idUsuario) {
        return controlUsuario.eliminarUsuario(idUsuario);
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
        return controlProducto.actualizarProducto(producto);
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        return controlCliente.actualizarCliente(cliente);
    }

    @Override
    public boolean actualizarIngrediente(Ingrediente ingrediente) {
        return controlIngrediente.actualizarIngrediente(ingrediente);
    }

    @Override
    public boolean actualizarPedido(Pedido pedido) {
        return controlPedido.actualizarPedido(pedido);
    }

    @Override
    public boolean actualizarUsuario(Usuario usario) {
        return controlUsuario.actualizarUsuario(usario);
    }

    @Override
    public Producto obtenerProductoPorId(Long idProducto) {
        return controlProducto.obtenerProductoPorId(idProducto);
    }

    @Override
    public Cliente obtenerClientePorId(Long idCliente) {
        return controlCliente.obtenerClientePorId(idCliente);
    }

    @Override
    public Ingrediente obtenerIngredientePorId(Long idIngrediente) {
        return controlIngrediente.obtenerIngredientePorId(idIngrediente);
    }

    @Override
    public Pedido obtenerPedidoPorId(Long idPedido) {
        return controlPedido.obtenerPedidoPorId(idPedido);
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long idUsuario) {
        return controlUsuario.obtenerUsuarioPorId(idUsuario);
    }

    @Override
    public ArrayList<Producto> obtenerProductos() {
        return controlProducto.obtenerProductos();
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return controlCliente.obtenerClientes();
    }

    @Override
    public ArrayList<Ingrediente> obtenerIngredientes() {
        return controlIngrediente.obtenerIngredientes();
    }

    @Override
    public ArrayList<Pedido> obtenerPedidos() {
        return controlPedido.obtenerPedidos();
    }
    
    
    @Override
    public ArrayList<Pedido> obtenerPedidosUsuario(String usuario) {
        return controlPedido.obtenerPedidos();
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidosCliente(String cliente) {
        return controlPedido.obtenerPedidos();
    }
    
    @Override
    public ArrayList<Pedido> obtenerPedidosEstado(String estado) {
        return controlPedido.obtenerPedidos();
    }

    @Override
    public ArrayList<Usuario> obtenerUsuarios() {
        return controlUsuario.obtenerUsuarios();
    }
    
    
     
}
