/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import control.FNegocio;
import control.INegocio;
import dominio.Ingrediente;
import dominio.Usuario;

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
        Usuario usuario= new Usuario("juanito", "mendez", "12435678", "pedrito", "1234");
        System.out.println(fachada.guardarUsuario(usuario));
        //System.out.println(ingredienteRepository.guardar(new Ingrediente("Leshuugaa", 0.5f))); 
        System.out.println(fachada.guardarIngrediente(new Ingrediente("pepino premium", 105.0f)));
   }
    
}
