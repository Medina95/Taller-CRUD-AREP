package com.example.accessingdatajpa;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    private EntityRepository entityRepository;

    public List<EntityDatos> obtenerdatos(){
        return (List<EntityDatos>) entityRepository.findAll();
    }

    public EntityDatos entidad (EntityDatos entidad ){
        return entityRepository.save(entidad);
    }



}
