
import control.FNegocio;
import control.INegocio;
import dao.PedidoRepository;
import dominio.Estado;
import dominio.Ingrediente;
import dominio.Pedido;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alfon
 */
public class test {

    public static void main(String[] args) {
        PedidoRepository fachada = new PedidoRepository();
        List<Pedido> pedidos = fachada.buscarPorUsuaridID(1L);
        pedidos.forEach(p -> System.out.println(p));
        System.out.println(fachada.buscarTodas());
        INegocio fas= new FNegocio();
        System.out.println("");
        System.out.println(fas.obtenerPedidos());
    }
}
