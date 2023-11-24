package com.Service.MicroServicioempleado.Controller;

import com.Service.MicroServicioempleado.Entity.Empleado;
import com.Service.MicroServicioempleado.Service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/listar")
    public List<Empleado> verTodo() {
        return empleadoService.listar();
    }

    @GetMapping("/listar/{id}")
    public Empleado verUno(@PathVariable Long id) {
        return empleadoService.verUno(id);
    }

    @PostMapping("/registrar")
    public Empleado registar(@RequestBody Empleado empleado){
        return empleadoService.registrar(empleado);
    }

    @PutMapping("/actualizar/{id}")
    public Empleado actualizar(@RequestBody Empleado empleado, @PathVariable Long id){
        return empleadoService.actualizar(empleado,id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        empleadoService.eliminar(id);
    }
}
