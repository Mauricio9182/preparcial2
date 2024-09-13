package umg.principal.dao;



import umg.principal.model.Datos;

import java.util.List;

public interface DatosDAO {
    void insertar(Datos datos);
    Datos obtenerPorCodigo(int codigo);
    List<Datos> obtenerTodos();
    void actualizar(Datos datos);
    void eliminar(int codigo);
}