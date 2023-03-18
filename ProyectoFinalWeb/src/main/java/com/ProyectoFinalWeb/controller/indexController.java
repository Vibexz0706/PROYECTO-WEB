package com.ProyectoFinalWeb.controller;


import com.ProyectoFinalWeb.domain.Cliente;
import com.ProyectoFinalWeb.domain.Usuario;
import com.ProyectoFinalWeb.service.UsuarioService;
import com.ProyectoFinalWeb.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Service
@Controller
@Slf4j
public class indexController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    
    @GetMapping("/")
    public String inicio(Model model) { 
        
        var usuarios=usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        
      
        return "index";
    }
    
    @GetMapping("/iniciodesesion/")
    public String paginaPrincipal(Model model) {
        var usuarios=usuarioService.getUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "iniciodesesion";
    }
 
    
    @PostMapping("/iniciarsesion/")
    public String iniciarsesion(Usuario usuario,Model model ) { 
        
        System.out.println("xd");
        var usuarios=usuarioService.getUsuarios();
        System.out.println(usuarios.get(0).getUsuario());
        for (int i=0;i<usuarios.size();i++){
            
            if (usuarios.get(i).getContrasena().equals(usuario.getContrasena()) && usuarios.get(i).getUsuario().equals(usuario.getUsuario())){
                return "redirect:/index";
            }else{
             
        }
      
    }
     return "iniciodesesion";
     
    } 
    
    
}
