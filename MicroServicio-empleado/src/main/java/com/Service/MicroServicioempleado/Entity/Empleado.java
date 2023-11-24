package com.Service.MicroServicioempleado.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//data se utiliza para generar los getters y setters
@Data
//se utiliza para generar el constructor vacio
@NoArgsConstructor
//se utiliza para generar el constructor con todos los atributos
@AllArgsConstructor
@Table(name = "empleado")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private LocalDate fecha_nacimiento;

    @Column(name = "horas_lab")
    private Double horas_laboradas;


}
