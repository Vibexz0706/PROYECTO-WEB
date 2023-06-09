/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoFinalWeb.service;

import com.ProyectoFinalWeb.domain.Categoria;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria cliente);
    
    public void save(Categoria cliente);
    
    public void delete(Categoria cliente);
    
}
