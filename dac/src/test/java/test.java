
import control.FNegocio;
import control.INegocio;
import dominio.Ingrediente;

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
        INegocio fachada= new FNegocio();
        fachada.guardarIngrediente(new Ingrediente("asda", 25.0f));
    }
}
