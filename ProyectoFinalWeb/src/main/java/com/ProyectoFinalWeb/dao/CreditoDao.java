package com.ProyectoFinalWeb.dao;

import com.ProyectoFinalWeb.domain.Cliente;
import com.ProyectoFinalWeb.domain.Credito;
import org.springframework.data.repository.CrudRepository;

public interface CreditoDao extends CrudRepository<Credito, Long> {
    
}
