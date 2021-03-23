/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dao.IngredienteRepository;
import dominio.Ingrediente;

/**
 *
 * @author MSI GF63
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IngredienteRepository ingredienteRepository= new IngredienteRepository();
        //System.out.println(ingredienteRepository.guardar(new Ingrediente("Leshuugaa", 0.5f))); 
        System.out.println(ingredienteRepository.buscarporID(1));
   }
    
}
