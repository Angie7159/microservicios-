package com.Service.MicroServicioempleado.Dao;

import com.Service.MicroServicioempleado.Entity.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoDao extends CrudRepository<Empleado, Long> {
}
