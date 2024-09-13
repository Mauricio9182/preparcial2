package umg.principal.service;

import umg.principal.dao.DatosDAO;
import umg.principal.model.Datos;

import java.util.List;

public class DatosService {
    private DatosDAO datosDAO;

    public DatosService(DatosDAO datosDAO) {
        this.datosDAO = datosDAO;
    }

    public void insertarDatos(Datos datos) {
        datosDAO.insertar(datos);
    }

    public Datos obtenerDatosPorCodigo(int codigo) {
        return datosDAO.obtenerPorCodigo(codigo);
    }

    public List<Datos> obtenerTodosLosDatos() {
        return datosDAO.obtenerTodos();
    }

    public void actualizarDatos(Datos datos) {
        datosDAO.actualizar(datos);
    }

    public void eliminarDatos(int codigo) {
        datosDAO.eliminar(codigo);
    }
}
