/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.controller;

import AVANCE.demo.domain.Queja;
import AVANCE.demo.service.QuejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Vibexz
 */

@Service
@Controller
@RequestMapping("/queja")
public class QuejaController {
    
    @Autowired
    private QuejaService quejaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) { 
        var quejas=quejaService.getQuejas();
        model.addAttribute("quejas", quejas);
       

        return "/queja/listado";
    }
    @GetMapping("/quejarse")
    public String quejarse(Model model) { 
        
        return "/queja/quejarse";
    }
    
    @PostMapping("/guardar")
    public String quejaGuardar(Queja queja) { 
        quejaService.save(queja);
        return "redirect:/queja/quejarse";
    }
    
    @GetMapping("/nuevo")
    public String quejaNuevo(Queja queja) { 
        return "/queja/modifica";
    }
    
    
    
    @GetMapping("/eliminar/{idQueja}")
    public String quejaEliminar(Queja queja) { 
        quejaService.delete(queja);
        return "redirect:/queja/listado";
    }
    
    @GetMapping("/index")
    public String quejaE(Queja queja) { 
        
        return "redirect:/index";
    }
    
    
    @GetMapping("/modificar/{idQueja}")
    public String quejaModificar(Queja queja,Model model ) { 
        queja = quejaService.getQueja(queja);
        model.addAttribute("queja", queja);
        return "/queja/modifica";
    }
    
    
    
    
}
