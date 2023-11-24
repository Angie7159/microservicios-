package com.Service.MicroServiciomostrar1.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    private Long codigo;
    private String nombre;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate fecha_nacimiento;
    private Double horas_laboradas;


}
