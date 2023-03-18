package com.ProyectoFinalWeb.dao;

import com.ProyectoFinalWeb.domain.Articulo;
import com.ProyectoFinalWeb.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository<Articulo, Long> {
    
}
