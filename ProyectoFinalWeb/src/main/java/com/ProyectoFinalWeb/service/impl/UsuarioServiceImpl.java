/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinalWeb.service.impl;

import com.ProyectoFinalWeb.dao.UsuarioDao;
import com.ProyectoFinalWeb.domain.Usuario;
import com.ProyectoFinalWeb.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laboratorios
 */

@Service
public class UsuarioServiceImpl implements UsuarioService  {
    
    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    @Transactional(readOnly=true)
    public List<Usuario> getUsuarios() {
        var lista =(List<Usuario>)usuarioDao.findAll();
     
        
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario getUsuario(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Usuario usuario) {
        
         usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

  

    
    
}
