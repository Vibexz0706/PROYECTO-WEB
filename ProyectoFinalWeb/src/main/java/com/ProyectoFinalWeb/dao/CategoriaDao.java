package com.ProyectoFinalWeb.dao;

import com.ProyectoFinalWeb.domain.Categoria;
import com.ProyectoFinalWeb.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaDao extends CrudRepository<Categoria, Long> {
    
}
