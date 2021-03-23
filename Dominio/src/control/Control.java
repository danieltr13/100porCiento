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
            return new ClienteRepository();
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
