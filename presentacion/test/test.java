
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
import dominio.Estado;
import dominio.Ingrediente;
import dominio.Pedido;
import dominio.Producto;
import dominio.Usuario;
import java.util.ArrayList;
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
        IngredienteRepository ingredientes = new IngredienteRepository();
        ProductoRepository productos = new ProductoRepository();
        UsuarioRepository usuarios= new UsuarioRepository();
        ClienteRepository clientes = new ClienteRepository();
        
        Usuario usuario = new Usuario("Perez", "12345", "Fernando", "Fer01", "6441950245");
        Usuario usuario2 = new Usuario("Lopez", "12345", "Mario", "Mario05", "6441839482");
        usuarios.guardar(usuario);
        usuarios.guardar(usuario2);
        
        Cliente cliente = new Cliente("JC", "MARTINEZ", "121344899", "MORELIA");
        
        clientes.guardar(cliente);
        
        //Cafe
        Ingrediente platano = new Ingrediente("Platano", Float.valueOf(5));
        Ingrediente azucar = new Ingrediente("Azucar", Float.valueOf(0));
        Ingrediente canela = new Ingrediente("Canela", Float.valueOf(0));
        Ingrediente chocomilk = new Ingrediente("Chocomilk", Float.valueOf(0));
        Ingrediente fresa = new Ingrediente("Fresa", Float.valueOf(0));
        Ingrediente arandono = new Ingrediente("Arandono", Float.valueOf(0));
        Ingrediente frutosRojos = new Ingrediente("Frutos Rojos", Float.valueOf(0));
        
        
        //Sandwiches
        Ingrediente pan = new Ingrediente("Pan", Float.valueOf(5));
        Ingrediente mayonesa = new Ingrediente("Mayonesa", Float.valueOf(0));
        Ingrediente aderezoChipotle = new Ingrediente("Aderezo de Chipotle", Float.valueOf(0));
        Ingrediente queso = new Ingrediente("Queso", Float.valueOf(7));
        Ingrediente jamon = new Ingrediente("Jamon", Float.valueOf(7));
        Ingrediente carne = new Ingrediente("Carne", Float.valueOf(0));
        Ingrediente lechuga = new Ingrediente("Lechuga", Float.valueOf(0));
        Ingrediente aguacate = new Ingrediente("Aguacate", Float.valueOf(0));
        Ingrediente zanahoria = new Ingrediente("Zanahoria", Float.valueOf(0));
        Ingrediente cebolla = new Ingrediente("Cebolla", Float.valueOf(0));
        Ingrediente chiles = new Ingrediente("Chiles", Float.valueOf(0));
        Ingrediente tomate = new Ingrediente("Tomate", Float.valueOf(5));
        
        
        
        Ingrediente milanesa = new Ingrediente("Milanesa", Float.valueOf(15));
       
        Ingrediente leche = new Ingrediente("Leche", Float.valueOf(0));
       
        Ingrediente chocolate = new Ingrediente("Chocolate", Float.valueOf(10));
        Ingrediente nieve = new Ingrediente("Nieve", Float.valueOf(10));
        
        Ingrediente agua = new Ingrediente("Agua", Float.valueOf(0));
        Ingrediente naranja = new Ingrediente("Naranja", Float.valueOf(5));
        Ingrediente toronja = new Ingrediente("Toronja", Float.valueOf(7));
        
        Ingrediente tortilla = new Ingrediente("Tortilla", Float.valueOf(3));
        Ingrediente frijoles = new Ingrediente("Frijoles", Float.valueOf(5));
        
        Ingrediente cafeGrano = new Ingrediente("Cafe", Float.valueOf(0));
        Ingrediente caramelo = new Ingrediente("Caramelo", Float.valueOf(5));
        
        
        //Licuados
        Producto lPlatano = new Producto("Licuado de Platano", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lChocomilk = new Producto("Licuado de Chocomilk", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lChocoplatano = new Producto("Licuado de Chocomilk", Float.valueOf(20), 10, Categoria.LICUADOS);
        
        Producto torta = new Producto("Torta de jamon", Float.valueOf(30), 10, Categoria.SANDWICHES);
        
        Producto tacoFrijol = new Producto("Taco de frijol", Float.valueOf(20), 10, Categoria.SNACKS);
        Producto cafe = new Producto("Cafe", Float.valueOf(25), 10, Categoria.CAFES);
        Producto frappe = new Producto("Frappe", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto tortaMilanesa = new Producto("Torta de milanesa", Float.valueOf(50), 10, Categoria.SANDWICHES);
        Producto jugoNaranja = new Producto("Jugo de naranja", Float.valueOf(25), 10, Categoria.JUGOS);
        Producto jugoToronja = new Producto("Jugo de toronja", Float.valueOf(25), 10, Categoria.JUGOS);
        Producto nieveChocolate = new Producto("Nieve de chocolate", Float.valueOf(30), 10, Categoria.POSTRES);
                             
        ingredientes.guardar(lechuga);
        ingredientes.guardar(tomate);
        ingredientes.guardar(jamon);
        ingredientes.guardar(queso);
        ingredientes.guardar(pan);
        ingredientes.guardar(milanesa);
        ingredientes.guardar(leche);
        ingredientes.guardar(platano);
        ingredientes.guardar(chocolate);
        ingredientes.guardar(nieve);
        ingredientes.guardar(agua);
        ingredientes.guardar(naranja);
        ingredientes.guardar(toronja);
        ingredientes.guardar(tortilla);
        ingredientes.guardar(frijoles);
        ingredientes.guardar(cafeGrano);
        ingredientes.guardar(caramelo);
        
       
    
    DetalleIngrediente diJamon = new DetalleIngrediente();
    diJamon.setIngrediente(ingredientes.buscarporID(3));
    diJamon.setProducto(torta);
    DetalleIngrediente diTomate = new DetalleIngrediente();
    diTomate.setIngrediente(ingredientes.buscarporID(2));
    diTomate.setProducto(torta);
    DetalleIngrediente diLechuga = new DetalleIngrediente();
    diLechuga.setIngrediente(ingredientes.buscarporID(1));
    diLechuga.setProducto(torta);
    DetalleIngrediente diQueso = new DetalleIngrediente();
    diQueso.setIngrediente(ingredientes.buscarporID(4));
    diQueso.setProducto(torta);
    DetalleIngrediente diPan = new DetalleIngrediente();
    diPan.setIngrediente(ingredientes.buscarporID(5));
    diPan.setProducto(torta);
    
    ArrayList<DetalleIngrediente> ingredientesTorta = new ArrayList<>();
    ingredientesTorta.add(diJamon);
    ingredientesTorta.add(diTomate);
    ingredientesTorta.add(diLechuga);
    ingredientesTorta.add(diQueso);
    ingredientesTorta.add(diPan);
    
    torta.setDetalleIngredientes(ingredientesTorta);
    productos.guardar(torta);
    
    DetalleIngrediente diLeche = new DetalleIngrediente();
    diLeche.setIngrediente(ingredientes.buscarporID(7));
    diLeche.setProducto(lChocomilk);
    DetalleIngrediente diPlatano = new DetalleIngrediente();
    diPlatano.setIngrediente(ingredientes.buscarporID(8));
    diPlatano.setProducto(lChocomilk);
    DetalleIngrediente diChocolate = new DetalleIngrediente();
    diChocolate.setIngrediente(ingredientes.buscarporID(9));
    diChocolate.setProducto(lChocomilk);
    
    ArrayList<DetalleIngrediente> ingredientesChocomilk = new ArrayList<>();
    ingredientesChocomilk.add(diLeche);
    ingredientesChocomilk.add(diPlatano);
    ingredientesChocomilk.add(diChocolate);
    
    lChocomilk.setDetalleIngredientes(ingredientesChocomilk);
    productos.guardar(lChocomilk);
    
    
    //
    
    DetalleIngrediente diTortilla = new DetalleIngrediente();
    diTortilla.setIngrediente(ingredientes.buscarporID(14));
    diTortilla.setProducto(tacoFrijol);
    DetalleIngrediente diFrijol = new DetalleIngrediente();
    diFrijol.setIngrediente(ingredientes.buscarporID(15));
    diFrijol.setProducto(tacoFrijol);
    
    ArrayList<DetalleIngrediente> ingredientesTacoFrijol = new ArrayList<>();
    ingredientesTacoFrijol.add(diTortilla);
    ingredientesTacoFrijol.add(diFrijol);
    
    tacoFrijol.setDetalleIngredientes(ingredientesTacoFrijol);
    productos.guardar(tacoFrijol);
    
    ////
    
    DetalleIngrediente diGranoCafe = new DetalleIngrediente();
    diGranoCafe.setIngrediente(ingredientes.buscarporID(16));
    diGranoCafe.setProducto(cafe);
    DetalleIngrediente diLecheCafe = new DetalleIngrediente();
    diLecheCafe.setIngrediente(ingredientes.buscarporID(7));
    diLecheCafe.setProducto(cafe);
    
    ArrayList<DetalleIngrediente> ingredientesCafe = new ArrayList<>();
    ingredientesCafe.add(diGranoCafe);
    ingredientesCafe.add(diLecheCafe);
    
    cafe.setDetalleIngredientes(ingredientesCafe);
    productos.guardar(cafe);
    
    //
    
    DetalleIngrediente diGranoFrappe = new DetalleIngrediente();
    diGranoFrappe.setIngrediente(ingredientes.buscarporID(16));
    diGranoFrappe.setProducto(frappe);
    DetalleIngrediente diLecheFrappe = new DetalleIngrediente();
    diLecheFrappe.setIngrediente(ingredientes.buscarporID(7));
    diLecheFrappe.setProducto(frappe);
    DetalleIngrediente diCaramelo = new DetalleIngrediente();
    diCaramelo.setIngrediente(ingredientes.buscarporID(17));
    diCaramelo.setProducto(frappe);
    
    ArrayList<DetalleIngrediente> ingredientesFrappe = new ArrayList<>();
    ingredientesFrappe.add(diGranoFrappe);
    ingredientesFrappe.add(diLecheFrappe);
    
    frappe.setDetalleIngredientes(ingredientesFrappe);
    productos.guardar(frappe);
    
    //
    
    DetalleIngrediente diPanTorta = new DetalleIngrediente();
    diPanTorta.setIngrediente(ingredientes.buscarporID(5));
    diPanTorta.setProducto(tortaMilanesa);
    DetalleIngrediente diMilanesa = new DetalleIngrediente();
    diMilanesa.setIngrediente(ingredientes.buscarporID(6));
    diMilanesa.setProducto(tortaMilanesa);
    
    ArrayList<DetalleIngrediente> ingredientesTortaMilanesa = new ArrayList<>();
    ingredientesTortaMilanesa.add(diPanTorta);
    ingredientesTortaMilanesa.add(diMilanesa);
    
    tortaMilanesa.setDetalleIngredientes(ingredientesTortaMilanesa);
    productos.guardar(tortaMilanesa);
    //
    
    DetalleIngrediente diAguaNaranja = new DetalleIngrediente();
    diAguaNaranja.setIngrediente(ingredientes.buscarporID(11));
    diAguaNaranja.setProducto(jugoNaranja);
    DetalleIngrediente diNaranja = new DetalleIngrediente();
    diNaranja.setIngrediente(ingredientes.buscarporID(12));
    diNaranja.setProducto(jugoNaranja);
    
    ArrayList<DetalleIngrediente> ingredientesJugoNaranja = new ArrayList<>();
    ingredientesJugoNaranja.add(diAguaNaranja);
    ingredientesJugoNaranja.add(diNaranja);
    
    jugoNaranja.setDetalleIngredientes(ingredientesJugoNaranja);
    productos.guardar(jugoNaranja);
    
     //
    
    DetalleIngrediente diAguaToronja = new DetalleIngrediente();
    diAguaToronja.setIngrediente(ingredientes.buscarporID(11));
    diAguaToronja.setProducto(jugoToronja);
    DetalleIngrediente diToronja = new DetalleIngrediente();
    diToronja.setIngrediente(ingredientes.buscarporID(13));
    diToronja.setProducto(jugoToronja);
    
    ArrayList<DetalleIngrediente> ingredientesJugoToronja = new ArrayList<>();
    ingredientesJugoToronja.add(diAguaToronja);
    ingredientesJugoToronja.add(diToronja);
    
    jugoToronja.setDetalleIngredientes(ingredientesJugoToronja);
    productos.guardar(jugoToronja);
    //
    
    DetalleIngrediente diNieve = new DetalleIngrediente();
    diNieve.setIngrediente(ingredientes.buscarporID(10));
    diNieve.setProducto(nieveChocolate);
    DetalleIngrediente diChocolateNieve = new DetalleIngrediente();
    diChocolateNieve.setIngrediente(ingredientes.buscarporID(9));
    diChocolateNieve.setProducto(nieveChocolate);
    
    ArrayList<DetalleIngrediente> ingredientesNieveChocolate = new ArrayList<>();
    ingredientesNieveChocolate.add(diNieve);
    ingredientesNieveChocolate.add(diChocolateNieve);
    
    nieveChocolate.setDetalleIngredientes(ingredientesNieveChocolate);
    productos.guardar(nieveChocolate);


//        List<Producto>pr=productos.buscarCategoria("LICUADOS");
//        for (Producto producto : pr) {
//            System.out.println(producto);
//            for (DetalleIngrediente detalleIngrediente : producto.getDetalleIngredientes()) {
//                System.out.println(detalleIngrediente.getIngrediente().getNombre());
//            }
//        }


    }
}
