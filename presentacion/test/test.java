
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
        
        //Licuados
        Ingrediente platano = new Ingrediente("Platano", Float.valueOf(5));
        Ingrediente azucar = new Ingrediente("Azucar", Float.valueOf(0));
        Ingrediente canela = new Ingrediente("Canela", Float.valueOf(0));
        Ingrediente chocomilk = new Ingrediente("Chocomilk", Float.valueOf(0));
        Ingrediente fresa = new Ingrediente("Fresa", Float.valueOf(0));
        Ingrediente arandono = new Ingrediente("Arandono", Float.valueOf(0));
        Ingrediente frutosRojos = new Ingrediente("Frutos Rojos", Float.valueOf(0));
        
        //Cafe
        Ingrediente agua = new Ingrediente("Agua", Float.valueOf(0));
        Ingrediente cafe = new Ingrediente("Cafe", Float.valueOf(0));
        Ingrediente leche = new Ingrediente("Leche", Float.valueOf(0));
        
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
        Ingrediente chile = new Ingrediente("Chile", Float.valueOf(0));
        Ingrediente tomate = new Ingrediente("Tomate", Float.valueOf(5));
        
        //Snacks
        Ingrediente tostitos = new Ingrediente("Tostitos", Float.valueOf(0));
        Ingrediente chips = new Ingrediente("Chips", Float.valueOf(0));
        Ingrediente papas = new Ingrediente("Papas", Float.valueOf(0));
        Ingrediente pepino = new Ingrediente("Pepino", Float.valueOf(0));
        Ingrediente cueritos = new Ingrediente("Cueritos", Float.valueOf(0));
        Ingrediente salchicha = new Ingrediente("Salchicha", Float.valueOf(0));
        Ingrediente jicama = new Ingrediente("Jicama", Float.valueOf(0));
        Ingrediente mango = new Ingrediente("Mango", Float.valueOf(0));
        Ingrediente chacachaca = new Ingrediente("Chaca Chaca", Float.valueOf(0));
        Ingrediente rielito = new Ingrediente("Rielito", Float.valueOf(0));
        Ingrediente chamoy = new Ingrediente("Chamoy", Float.valueOf(0));
        Ingrediente tarugo = new Ingrediente("Tarugo", Float.valueOf(0));
        Ingrediente clamato = new Ingrediente("Clamato", Float.valueOf(0));
        Ingrediente cacahuate = new Ingrediente("Cacahuate", Float.valueOf(0));
        
        //Postres
        Ingrediente manzana = new Ingrediente("Manzana", Float.valueOf(0));
        Ingrediente pera = new Ingrediente("Pera", Float.valueOf(0));
        Ingrediente yogurtNatural = new Ingrediente("Yogurt Natural", Float.valueOf(0));
        Ingrediente granola = new Ingrediente("Granola", Float.valueOf(0));
        Ingrediente miel = new Ingrediente("Miel", Float.valueOf(0));
        
        //Frappes
        Ingrediente hielo = new Ingrediente("Hielo", Float.valueOf(0));
        Ingrediente polvoFrappeRegular = new Ingrediente("Polvo para frappe regular", Float.valueOf(0));
        Ingrediente polvoFrappeVainilla = new Ingrediente("Polvo para frappe vainilla", Float.valueOf(0));
        Ingrediente polvoFrappeMoka = new Ingrediente("Polvo para frappe moka", Float.valueOf(0));
        Ingrediente galletaOreo = new Ingrediente("Galleta Oreo triturada", Float.valueOf(0));
        Ingrediente chocolate = new Ingrediente("Chocolate", Float.valueOf(10));
        Ingrediente cremaBatida = new Ingrediente("Crema Batida", Float.valueOf(0));
        Ingrediente galleta = new Ingrediente("Galleta", Float.valueOf(0));
        Ingrediente chispas = new Ingrediente("Chispas", Float.valueOf(0));
        Ingrediente jarabeCremaIrlandesa = new Ingrediente("Jarabe de crema irlandesa", Float.valueOf(0));
        Ingrediente jarabeKahlua = new Ingrediente("Jarabe de cafe kahlua", Float.valueOf(0));
        Ingrediente cajeta = new Ingrediente("Cajeta", Float.valueOf(0));
        Ingrediente paletaMagnum = new Ingrediente("Paleta Magnum", Float.valueOf(0));
        Ingrediente gansito = new Ingrediente("Gansito", Float.valueOf(0));

        //Jugos
        Ingrediente naranja = new Ingrediente("Naranja", Float.valueOf(5));       
        
       

        //PRODUCTOS
        
        //Licuados
        Producto lPlatano = new Producto("Licuado de Platano", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lChocomilk = new Producto("Licuado de Chocomilk", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lChocoplatano = new Producto("Licuado de Platano/Chocomilk", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lFresa = new Producto("Licuado de Fresa", Float.valueOf(30), 10, Categoria.LICUADOS);
        Producto lArandono = new Producto("Licuado de Arandono", Float.valueOf(20), 10, Categoria.LICUADOS);
        Producto lPapaya = new Producto("Licuado de Papaya", Float.valueOf(25), 10, Categoria.LICUADOS);
        Producto lFrutosRojos = new Producto("Licuado de Frutos Rojos", Float.valueOf(30), 10, Categoria.LICUADOS);
        
        //Cafe
        Producto cAmericano = new Producto("Cafe Americano", Float.valueOf(25), 10, Categoria.CAFES);
        Producto cCapuchino = new Producto("Cafe Capuchino", Float.valueOf(30), 10, Categoria.CAFES);
        Producto cLatte = new Producto("Cafe Latte", Float.valueOf(30), 10, Categoria.CAFES);
        
        //Sandwiches
        Producto sJamon = new Producto("Sandwich jamon", Float.valueOf(25), 10, Categoria.SANDWICHES);
        Producto torta = new Producto("Torta de jamon", Float.valueOf(30), 10, Categoria.SANDWICHES);
        Producto Panini = new Producto("Panini", Float.valueOf(30), 10, Categoria.SANDWICHES);
        Producto PaniniEspecial = new Producto("Panini especial", Float.valueOf(40), 10, Categoria.SANDWICHES);
        
        //Jugos
        Producto jNaranja = new Producto("Jugo de naranja", Float.valueOf(25), 10, Categoria.JUGOS);
        Producto jToronja = new Producto("Jugo de toronja", Float.valueOf(25), 10, Categoria.JUGOS);
        Producto jNZanahoria = new Producto("Jugo de narnaja/zanahoria", Float.valueOf(20), 10, Categoria.JUGOS);
        Producto jNBetanbel = new Producto("Jugo de naranja/betabel", Float.valueOf(25), 10, Categoria.JUGOS);
        Producto jNZBetabel = new Producto("Jugo de naranja/zanahoria/betabel", Float.valueOf(30), 10, Categoria.JUGOS);
        Producto jNPina = new Producto("Jugo de naranja/piña", Float.valueOf(25), 10, Categoria.JUGOS);
        
        //Bebidas

        //Snacks
        Producto Ptostitos = new Producto("Tostitos", Float.valueOf(40), 10, Categoria.SNACKS);
        Producto pChips = new Producto("Tostitos", Float.valueOf(45), 10, Categoria.SNACKS);
        Producto Ppapas = new Producto("Tostitos", Float.valueOf(40), 10, Categoria.SNACKS);
        Producto Pcacahuates = new Producto("Tostitos", Float.valueOf(30), 10, Categoria.SNACKS);
        
        //Postres
        Producto escamocha = new Producto("Escamocha", Float.valueOf(30), 10, Categoria.POSTRES);
        Producto gelatina = new Producto("Gelatina", Float.valueOf(20), 10, Categoria.POSTRES);
        Producto nieveChocolate = new Producto("Nieve Chocolate", Float.valueOf(20), 10, Categoria.POSTRES);
        
        //Frappes
        Producto fOreo = new Producto("Frappe Oreo", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto fRegular = new Producto("Frappe regular", Float.valueOf(30), 10, Categoria.FRAPPES);
        Producto fCIrlandesa = new Producto("Frappe crema irlandesa", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto fMagnum = new Producto("Frappe Magnum", Float.valueOf(40), 10, Categoria.FRAPPES);
        Producto fGansito = new Producto("Frappe Gansito", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto fMoka = new Producto("Frappe Moka", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto fCapuchino = new Producto("Frappe Capuchino", Float.valueOf(35), 10, Categoria.FRAPPES);
        Producto fKahlua = new Producto("Frappe Kahlua", Float.valueOf(35), 10, Categoria.FRAPPES);
        
        Producto tacoFrijol = new Producto("Taco de frijol", Float.valueOf(20), 10, Categoria.SNACKS);
        Producto tortaMilanesa = new Producto("Torta de milanesa", Float.valueOf(50), 10, Categoria.SANDWICHES);
        
        
                             
        ingredientes.guardar(lechuga);
        ingredientes.guardar(tomate);
        ingredientes.guardar(jamon);
        ingredientes.guardar(queso);
        ingredientes.guardar(pan);
        ingredientes.guardar(leche);
        ingredientes.guardar(platano);
        ingredientes.guardar(chocolate);
        ingredientes.guardar(agua);
        
        ingredientes.guardar(azucar);
        ingredientes.guardar(gansito);
        ingredientes.guardar(paletaMagnum);
        ingredientes.guardar(cajeta);
        ingredientes.guardar(jarabeKahlua);
        ingredientes.guardar(jarabeCremaIrlandesa);
        
        ingredientes.guardar(chispas);
        ingredientes.guardar(galleta);
        ingredientes.guardar(cremaBatida);
        ingredientes.guardar(galletaOreo);
        ingredientes.guardar(polvoFrappeMoka);
        ingredientes.guardar(polvoFrappeVainilla);
        ingredientes.guardar(polvoFrappeRegular);
        
        ingredientes.guardar(hielo);
        ingredientes.guardar(miel);
        ingredientes.guardar(granola);
        ingredientes.guardar(yogurtNatural);
        ingredientes.guardar(pera);
        ingredientes.guardar(manzana);
        ingredientes.guardar(polvoFrappeVainilla);
        
        ingredientes.guardar(canela);
        ingredientes.guardar(chocomilk);
        ingredientes.guardar(fresa);
        ingredientes.guardar(arandono);
        ingredientes.guardar(frutosRojos);
        ingredientes.guardar(cafe);
        ingredientes.guardar(mayonesa);
        ingredientes.guardar(aderezoChipotle);
        ingredientes.guardar(carne);
        ingredientes.guardar(aguacate);
        
        ingredientes.guardar(zanahoria);
        ingredientes.guardar(cebolla);
        ingredientes.guardar(chile);
        ingredientes.guardar(tostitos);
        ingredientes.guardar(chips);
        ingredientes.guardar(papas);
        
        ingredientes.guardar(cueritos);
        ingredientes.guardar(salchicha);
        ingredientes.guardar(jicama);
        ingredientes.guardar(mango);
        ingredientes.guardar(chacachaca);
        ingredientes.guardar(rielito);
        ingredientes.guardar(chamoy);
        ingredientes.guardar(tarugo);
        ingredientes.guardar(clamato);
        ingredientes.guardar(cacahuate);
        ingredientes.guardar(pepino);
        
       
    
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
    diGranoCafe.setProducto(cAmericano);
    DetalleIngrediente diLecheCafe = new DetalleIngrediente();
    diLecheCafe.setIngrediente(ingredientes.buscarporID(7));
    diLecheCafe.setProducto(cAmericano);
    
    ArrayList<DetalleIngrediente> ingredientesCafe = new ArrayList<>();
    ingredientesCafe.add(diGranoCafe);
    ingredientesCafe.add(diLecheCafe);
    
    cAmericano.setDetalleIngredientes(ingredientesCafe);
    productos.guardar(cAmericano);
    
    //
    
    DetalleIngrediente diGranoFrappe = new DetalleIngrediente();
    diGranoFrappe.setIngrediente(ingredientes.buscarporID(16));
    diGranoFrappe.setProducto(fOreo);
    DetalleIngrediente diLecheFrappe = new DetalleIngrediente();
    diLecheFrappe.setIngrediente(ingredientes.buscarporID(7));
    diLecheFrappe.setProducto(fOreo);
    DetalleIngrediente diCaramelo = new DetalleIngrediente();
    diCaramelo.setIngrediente(ingredientes.buscarporID(17));
    diCaramelo.setProducto(fOreo);
    
    ArrayList<DetalleIngrediente> ingredientesFrappe = new ArrayList<>();
    ingredientesFrappe.add(diGranoFrappe);
    ingredientesFrappe.add(diLecheFrappe);
    
    fOreo.setDetalleIngredientes(ingredientesFrappe);
    productos.guardar(fOreo);
    
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
    diAguaNaranja.setProducto(jNaranja);
    DetalleIngrediente diNaranja = new DetalleIngrediente();
    diNaranja.setIngrediente(ingredientes.buscarporID(12));
    diNaranja.setProducto(jNaranja);
    
    ArrayList<DetalleIngrediente> ingredientesJugoNaranja = new ArrayList<>();
    ingredientesJugoNaranja.add(diAguaNaranja);
    ingredientesJugoNaranja.add(diNaranja);
    
    jNaranja.setDetalleIngredientes(ingredientesJugoNaranja);
    productos.guardar(jNaranja);
    
     //
    
    DetalleIngrediente diAguaToronja = new DetalleIngrediente();
    diAguaToronja.setIngrediente(ingredientes.buscarporID(11));
    diAguaToronja.setProducto(jToronja);
    DetalleIngrediente diToronja = new DetalleIngrediente();
    diToronja.setIngrediente(ingredientes.buscarporID(13));
    diToronja.setProducto(jToronja);
    
    ArrayList<DetalleIngrediente> ingredientesJugoToronja = new ArrayList<>();
    ingredientesJugoToronja.add(diAguaToronja);
    ingredientesJugoToronja.add(diToronja);
    
    jToronja.setDetalleIngredientes(ingredientesJugoToronja);
    productos.guardar(jToronja);
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
