package com.Service.MicroServiciomostrar1.Service;

import com.Service.MicroServiciomostrar1.Models.Empleado;
import com.Service.MicroServiciomostrar1.Models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> finAll() {
        List<Empleado> empleados = Arrays
                .asList(clienteRest.getForObject("http://localhost:8001/listar", Empleado[].class));
        return empleados.stream().map(p -> new Item(p, 24)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id) {
        Empleado empleado = clienteRest.getForObject("http://localhost:8001/listar/{id}", Empleado.class, id);

        if (empleado != null) {
            return new Item(empleado, 24);
        } else {
            return null;
        }
    }



}
