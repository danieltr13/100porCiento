/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.IngredienteRepository;
import dominio.Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ControlIngrediente {
    private final Control control = new Control();
    private final IngredienteRepository ingredienteRepo= control.getIngredienteRepository();
    
    public boolean guardarIngrediente(Ingrediente ingrediente) {
       return this.ingredienteRepo.guardar(ingrediente);
    }

    public boolean eliminarIngrediente(Long idIngrediente) {
        return this.ingredienteRepo.eliminar(idIngrediente);
    }

    public boolean actualizarIngrediente(Ingrediente ingrediente) {
         return this.ingredienteRepo.actualizar(ingrediente);
    }

    public Ingrediente obtenerIngredientePorId(Long idIngrediente) {
        return this.ingredienteRepo.buscarporID(idIngrediente);
    }

    public ArrayList<Ingrediente> obtenerIngredientes() {
        return this.ingredienteRepo.buscarTodas();
    }

    public List obtenerIngredientesNombre(String nombre){
        return ingredienteRepo.buscarComo(nombre);
    }
}
