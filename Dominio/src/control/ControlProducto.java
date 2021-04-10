/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ProductoRepository;
import dominio.Categoria;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ControlProducto {
    private final Control control = new Control();
    private final ProductoRepository productoRepository= control.getProductoRepository();
    
    public boolean guardarProducto(Producto producto) {
        return this.productoRepository.guardar(producto);
    }

    public boolean eliminarProducto(Long idProducto) {
        return this.productoRepository.eliminar(idProducto);
    }

    public boolean actualizarProducto(Producto producto) {
         return this.productoRepository.actualizar(producto);
    }

    public Producto obtenerProductoPorId(Long idProducto) {
        return this.productoRepository.buscarporID(idProducto);
    }

    public ArrayList<Producto> obtenerProductos() {
        return this.productoRepository.buscarTodas();
    }

    public List obtenerProductosNombre(String nombre){
        return productoRepository.buscarComo(nombre);
    }
    
    public ArrayList<Producto> obtenerProductosCategoria(String categoria){
        return productoRepository.buscarCategoria(categoria);
    }
}
