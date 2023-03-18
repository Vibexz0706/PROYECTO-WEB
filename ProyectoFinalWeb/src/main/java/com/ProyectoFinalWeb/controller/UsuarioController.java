package com.ProyectoFinalWeb.controller;

import com.ProyectoFinalWeb.domain.Usuario;
import com.ProyectoFinalWeb.dao.UsuarioDao;
import com.ProyectoFinalWeb.service.UsuarioService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@Slf4j
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
     
    
    
    
    
    
    
}
