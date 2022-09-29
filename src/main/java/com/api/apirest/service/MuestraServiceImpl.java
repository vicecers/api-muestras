package com.api.apirest.service;

import com.api.apirest.entity.Semana1;
import com.api.apirest.repository.MuestraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vicec
 */
@Service
public class MuestraServiceImpl implements MuestraService{

    @Autowired
    MuestraRepository repoMuestra;
    
    @Override
    public List<Semana1> getMuestras() {
        
        return repoMuestra.findAll();
    }

    @Override
    public float getMax() {
        return repoMuestra.maximo();
    }

    @Override
    public float getMin() {
        return repoMuestra.minimo();
    }

    @Override
    public List getMinPorSemana() {
        return repoMuestra.minimoPorSemana();
    }

    @Override
    public List getMaxPorSemana() {
        return repoMuestra.maximoPorSemana();
    }
    
    

   
    
    
    
    
}
