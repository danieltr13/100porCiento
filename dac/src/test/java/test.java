
import dao.PedidoRepository;
import java.util.Date;



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
        PedidoRepository p= new PedidoRepository();
        System.out.println(p.buscarPorPeriodo(new Date(), new Date(2240, 3, 3)).toString());   
    }
}
