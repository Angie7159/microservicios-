package com.Service.MicroServicioempleado.Service;

import com.Service.MicroServicioempleado.Entity.Empleado;

import java.util.List;

public interface IEmpleadoService {


    public List<Empleado> listar();

    public Empleado verUno(Long id);

    public Empleado registrar(Empleado empleado);

    public Empleado actualizar(Empleado Empleado, Long id);

    public void eliminar(Long id);
}
