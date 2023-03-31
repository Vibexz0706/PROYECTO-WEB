package com.ProyectoFinalWeb.controller;


import com.ProyectoFinalWeb.domain.Cliente;
import com.ProyectoFinalWeb.service.ArticuloService;
import com.ProyectoFinalWeb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Service
@Controller
public class indexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    
    @GetMapping("/")
    public String inicio(Model model) { 
        
        var articulos=articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        
      
        return "index";
    }

    
    
}
