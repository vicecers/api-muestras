package com.api.apirest.controller;

import com.api.apirest.entity.MaximosSemana;
import com.api.apirest.entity.Semana1;
import com.api.apirest.service.MuestraService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vicec
 */
@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private MuestraService muestraService;

    List<Semana1> listadoSemana1;

    @GetMapping("/listado")
    public List<Semana1> leerMuestras() {
        listadoSemana1 = muestraService.getMuestras();
        return listadoSemana1;
    }

    @GetMapping("/maximo")
    public float maximo() {
        listadoSemana1 = muestraService.getMuestras();
        return muestraService.getMax();
    }

    @GetMapping("/minimo")
    public float minimo() {
        listadoSemana1 = muestraService.getMuestras();
        return muestraService.getMin();
    }

    @GetMapping("/minsemana")
    public List minimoPorSemana() {
        listadoSemana1 = muestraService.getMuestras();

        return muestraService.getMinPorSemana();
    }

    @GetMapping("/maxsemana")
    public List maximoPorSemana() {
        listadoSemana1 = muestraService.getMuestras();
        return muestraService.getMaxPorSemana();
    }
    

}
