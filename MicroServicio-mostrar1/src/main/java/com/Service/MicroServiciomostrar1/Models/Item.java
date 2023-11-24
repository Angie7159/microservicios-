package com.Service.MicroServiciomostrar1.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Empleado empleado;
    private Integer precioHora;

    //metodo para calcular el pago total
    public Double getPagoTotal(){
        return empleado.getHoras_laboradas()*precioHora.doubleValue();
    }

    //metodo para calcular la edad
    public int getEdad(){
        return Period.between(empleado.getFecha_nacimiento(), LocalDate.now()).getYears();
    }
}
