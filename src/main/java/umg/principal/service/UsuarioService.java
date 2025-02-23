package umg.principal.service;

import umg.principal.dao.UsuarioDAO;
import umg.principal.dao.UsuarioDAOImpl;
import umg.principal.model.Usuario;

import java.util.List;

public class UsuarioService {

    private UsuarioDAO usuarioDAO;

    // Constructor que inicializa el DAO
    public UsuarioService() {
        this.usuarioDAO = new UsuarioDAOImpl();
    }

    // Método para insertar un usuario
    public void insertarUsuario(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }

    // Método para obtener un usuario por ID
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioDAO.obtenerPorId(id);
    }

    // Método para obtener todos los usuarios
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioDAO.obtenerTodos();
    }

    // Método para actualizar un usuario
    public void actualizarUsuario(Usuario usuario) {
        usuarioDAO.actualizar(usuario);
    }

    // Método para eliminar un usuario por ID
    public void eliminarUsuario(int id) {
        usuarioDAO.eliminar(id);
    }
}