/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinalWeb.service.impl;

import com.ProyectoFinalWeb.dao.ClienteDao;
import com.ProyectoFinalWeb.dao.CreditoDao;
import com.ProyectoFinalWeb.domain.Cliente;
import com.ProyectoFinalWeb.domain.Credito;
import com.ProyectoFinalWeb.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laboratorios
 */

@Service
public class ClienteServiceImpl implements ClienteService  {
    
    @Autowired
    private ClienteDao clienteDao;
    @Autowired CreditoDao creditoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        
        return (List<Cliente>)clienteDao.findAll();
        
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente getCliente(Cliente cliente) {
        
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito=cliente.getCredito();
        credito=creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
        
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
    
}
