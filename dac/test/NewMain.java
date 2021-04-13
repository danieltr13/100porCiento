/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import control.FNegocio;
import control.INegocio;
import dao.ClienteRepository;
import dao.IngredienteRepository;
import dao.PedidoRepository;
import dao.ProductoRepository;
import dao.UsuarioRepository;
import dominio.Categoria;
import dominio.Cliente;
import dominio.DetalleIngrediente;
import dominio.DetallePedido;
import dominio.Estado;
import dominio.Ingrediente;
import dominio.Pedido;
import dominio.Producto;
import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI GF63
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        INegocio fachada= new FNegocio();
        ArrayList pedidos= fachada.obtenerPedidosUsuario("Daniel");
        for (Object pedido : pedidos) {
            System.out.println(pedido);
        }
        
        //IngredienteRepository pr = new IngredienteRepository();
//        Ingrediente ingrediente= new Ingrediente("Leche", 0f);
//        pr.guardar(ingrediente);
        //Ingrediente in = pr.buscarporID(1);
//        System.out.println(in)

//        Producto produc= new Producto("Licuado platano", 30f, 3, Categoria.LICUADOS);
//        DetalleIngrediente dt= new DetalleIngrediente();
//        dt.setIngrediente(in);
//        dt.setProducto(produc);
//        produc.setDetalleIngrediente(dt);
//        Ingrediente ingrediente2= new Ingrediente("Pan", 0f);
//        pr.guardar(ingrediente2);
        //Ingrediente in2 = pr.buscarporID(2);
        //System.out.println(in)
//        Producto produc2= new Producto("Panini", 30f, 3, Categoria.LICUADOS);
//        DetalleIngrediente dt2= new DetalleIngrediente();
//        dt2.setIngrediente(in2);
//        dt2.setProducto(produc2);
//        produc2.setDetalleIngrediente(dt2);
//        
//        Producto produc3= new Producto("Pan de muerto", 30f, 3, Categoria.LICUADOS);
//        DetalleIngrediente dt3= new DetalleIngrediente();
//        dt3.setIngrediente(in2);
//        dt3.setProducto(produc3);
//        produc3.setDetalleIngrediente(dt3);
//        
//            
//        
        ProductoRepository producR = new ProductoRepository();
//        System.out.println(producR.buscarCategoria(Categoria.SANDWICHES));
//        producR.guardar(produc);
//        producR.guardar(produc2);
//        producR.guardar(produc3);
        //producR.guardar(produc);
        //Usuario usuario= new Usuario("juanito", "mendez", "12435678", "pedrito", "1234");
        //System.out.println(fachada.guardarUsuario(usuario));

        //System.out.println(ingredienteRepository.guardar(new Ingrediente("Leshuugaa", 0.5f))); 
        //System.out.println(fachada.guardarIngrediente(new Ingrediente("pepino premium", 105.0f)));
        UsuarioRepository usuarioRepository = new UsuarioRepository();
//        Usuario usuario= new Usuario("Daniel", "Trinidad", "6682144484", "LsDany", "encriptar");
//        Usuario usuario2= new Usuario("Adolfo", "Reyes", "6442144484", "LsTrinity", "encriptar");
//        
//        usuarioRepository.guardar(usuario);
//        usuarioRepository.guardar(usuario2);
        //System.out.println(usuarioRepository.buscarporID(2));
//       Usuario user = usuarioRepository.buscarporID(2);
//        
//        
//        ClienteRepository clienteRepository= new ClienteRepository();
//        
//        Cliente cliente= new Cliente("Jc", "Cj","121313", "Morelia");

        //clienteRepository.guardar(cliente);
//        cliente= clienteRepository.buscarporID(3);
//        
//        Producto producto = producR.buscarporID(1);
//        Producto producto2 = producR.buscarporID(2);
//        
//        float total = producto.getPrecio() + producto2.getPrecio();
//        
        PedidoRepository pedidoRepository = new PedidoRepository();
//        Pedido pedido = new Pedido(total, Estado.ESPERANDO, cliente, user);
//        cliente.addPedido(pedido);
//        DetallePedido dt = new DetallePedido(1, 2, producto.getPrecio()*2, pedido, producto);
//        DetallePedido dt2 = new DetallePedido(2, 2, producto2.getPrecio()*2, pedido, producto2);
//        pedido.addDetalle(dt);
//        pedido.addDetalle(dt2);
//        pedidoRepository.guardar(pedido);

        List<Pedido> ped = pedidoRepository.buscarTodas();
        //DetallePedido pedido = ped.getDetallePedido().get(0);
        System.out.println(ped);
        
        //ped.setEstado(Estado.PREPARANDO);
        //pedidoRepository.actualizar(ped);
    }

}
