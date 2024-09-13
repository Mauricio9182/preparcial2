package umg.principal.service;

import umg.principal.dao.EquipoDAO;
import umg.principal.dao.EquipoDAOImpl;
import umg.principal.model.Equipo;

import java.util.List;

public class EquipoService {

    private EquipoDAO equipoDAO;

    public EquipoService() {
        this.equipoDAO = new EquipoDAOImpl();
    }

    public void insertarEquipo(Equipo equipo) {
        equipoDAO.insertar(equipo);
    }

    public Equipo obtenerEquipoPorId(int id) {
        return equipoDAO.obtenerPorId(id);
    }

    public List<Equipo> obtenerTodosLosEquipos() {
        return equipoDAO.obtenerTodos();
    }

    public void actualizarEquipo(Equipo equipo) {
        equipoDAO.actualizar(equipo);
    }

    public void eliminarEquipo(int id) {
        equipoDAO.eliminar(id);
    }
}