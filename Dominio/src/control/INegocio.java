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
public interface INegocio {
    //guardar 
    public boolean guardarProducto(Producto producto);
    public boolean guardarCliente(Cliente cliente);
    public boolean guardarIngrediente(Ingrediente producto);
    public boolean guardarPedido(Pedido pedido);
    public boolean guardarUsuario(Usuario usario);
    //eliminar 
    public boolean eliminarProducto(Long idProducto); 
    public boolean eliminarCliente(Long idCliente); 
    public boolean eliminarIngrediente(Long idIngrediente); 
    public boolean eliminarPedido(Long idPedido); 
    public boolean eliminarUsuario(Long idUsuario);
    //actualizar
    public boolean actualizarProducto(Producto producto);
    public boolean actualizarCliente(Cliente cliente);
    public boolean actualizarIngrediente(Ingrediente ingrediente);
    public boolean actualizarPedido(Pedido pedido);
    public boolean actualizarUsuario(Usuario usario);
    //obtener Por Id
    public Producto obtenerProductoPorId(Long idProducto);
    public Cliente obtenerClientePorId(Long idCliente);
    public Ingrediente obtenerIngredientePorId(Long idIngrediente);
    public Pedido obtenerPedidoPorId(Long idPedido);
    public Usuario obtenerUsuarioPorId(Long idUsuario);
    //Obtener todos
    public ArrayList<Producto> obtenerProductos();
    public ArrayList<Cliente> obtenerClientes();
    public ArrayList<Ingrediente> obtenerIngredientes();
    public ArrayList<Pedido> obtenerPedidos();
    public ArrayList<Usuario> obtenerUsuarios();
    //public List obtenerProductosNombre(String nombre)
    public ArrayList<Pedido> obtenerPedidosUsuario(String usuario);
    public ArrayList<Pedido> obtenerPedidosCliente(String cliente);
    public ArrayList<Pedido> obtenerPedidosEstado(String estado);
}
