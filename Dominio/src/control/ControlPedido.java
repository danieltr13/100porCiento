/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PedidoRepository;
import dominio.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ControlPedido {
    private final Control control = new Control();
    private final PedidoRepository pedidoRepository= control.getPedidoRepository();

    public boolean guardarPedido(Pedido pedido) {
       return this.pedidoRepository.guardar(pedido);
    }

    public boolean eliminarPedido(Long idPedido) {
        return this.pedidoRepository.eliminar(idPedido);
    }

    public boolean actualizarPedido(Pedido pedido) {
         return this.pedidoRepository.actualizar(pedido);
    }

    public Pedido obtenerPedidoPorId(Long idPedido) {
        return this.pedidoRepository.buscarporID(idPedido);
    }

    public ArrayList<Pedido> obtenerPedidos() {
        return this.pedidoRepository.buscarTodas();
    }

    public List obtenerPedidosNombre(String nombre){
        return pedidoRepository.buscarComo(nombre);
    }
    
    public ArrayList<Pedido> obtenerPedidosUsuario(String usuario){
        return pedidoRepository.buscarPorUsuario(usuario);
    }
    
    public ArrayList<Pedido> obtenerPedidosCliente(String cliente){
        return pedidoRepository.buscarPorCliente(cliente);
    }
    
    //Verificar si el casteo funciona
    public ArrayList<Pedido> obtenerPedidosEstado(String estado){
        return (ArrayList<Pedido>) pedidoRepository.buscarComo(estado);
    }
}
