/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.UsuarioRepository;
import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfon
 */
public class ControlUsuario {
    private final Control control = new Control();
    private final UsuarioRepository usuarioRepository= control.getUsuarioRepository();
    
    public boolean guardarUsuario(Usuario usuario) {
       return this.usuarioRepository.guardar(usuario);
    }

    public boolean eliminarUsuario(Long idUsuario) {
        return this.usuarioRepository.eliminar(idUsuario);
    }

    public boolean actualizarUsuario(Usuario usuario) {
         return this.usuarioRepository.actualizar(usuario);
    }

    public Usuario obtenerUsuarioPorId(Long idUsuario) {
        return this.usuarioRepository.buscarporID(idUsuario);
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        return this.usuarioRepository.buscarTodas();
    }

    public List obtenerUsuariosNombre(String nombre){
        return usuarioRepository.buscarComo(nombre);
    }
}
