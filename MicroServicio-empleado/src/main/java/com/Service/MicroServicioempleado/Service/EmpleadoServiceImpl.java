package com.Service.MicroServicioempleado.Service;

import com.Service.MicroServicioempleado.Dao.EmpleadoDao;
import com.Service.MicroServicioempleado.Entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

    @Autowired
    private EmpleadoDao empleadoDao;

    //para que se mire todos los empleados
    @Override
    public List<Empleado> listar() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    //para que se mire un solo empleado
    @Override
    public Empleado verUno(Long id) {
        return empleadoDao.findById(id).orElse(null);
    }

    //para que se registre un empleado
    @Override
    public Empleado registrar(Empleado empleado) {
        return empleadoDao.save(empleado);
    }

    //para que se actualice un empleado
    @Override
    public Empleado actualizar(Empleado object, Long id) {
        // Utiliza el empleadoDao para obtener el Empleado existente por su ID
        Optional<Empleado> objectExistenteOptional = empleadoDao.findById(id);

        // Verifica si el empleado existe en la base de datos
        if (objectExistenteOptional.isPresent()) {
            // Si existe, obtén la instancia del Alumno existente
            Empleado empleadoExistente = objectExistenteOptional.get();

            // Actualiza los campos del Empleado existente con los valores del objeto proporcionado
            empleadoExistente.setNombre(object.getNombre());
            empleadoExistente.setFecha_nacimiento(object.getFecha_nacimiento());
            empleadoExistente.setHoras_laboradas(object.getHoras_laboradas());

            // Guarda el empleado actualizado en la base de datos utilizando el EmpleadoDao
            return empleadoDao.save(empleadoExistente);
        } else {
            // Si el Empleado no existe, devuelve null
            return null;
        }
    }

    //para que se elimine un empleado
    @Override
    public void eliminar(Long id) {
        empleadoDao.deleteById(id);
    }
}
