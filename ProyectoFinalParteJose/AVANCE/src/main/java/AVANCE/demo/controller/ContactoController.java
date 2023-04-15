/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.controller;

import AVANCE.demo.domain.Contacto;
import AVANCE.demo.service.ContactoService;
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
@RequestMapping("/contacto")
public class ContactoController {
    
    @Autowired
    private ContactoService contactoService;
    
    @GetMapping("/listado")
    public String inicio(Model model) { 
        var contactos=contactoService.getContactos();
        model.addAttribute("contactos", contactos);
       

        return "/contacto/listado";
    }
    @GetMapping("/contactar")
    public String contactar(Model model) { 
        
        return "/contacto/contactar";
    }
    
    @PostMapping("/guardar")
    public String contactoGuardar(Contacto contacto) { 
        contactoService.save(contacto);
        return "redirect:/contacto/contactar";
    }
    
    @GetMapping("/nuevo")
    public String contactoNuevo(Contacto contacto) { 
        return "/contacto/modifica";
    }
    
    
    
    @GetMapping("/eliminar/{idContacto}")
    public String contactoEliminar(Contacto contacto) { 
        contactoService.delete(contacto);
        return "redirect:/contacto/listado";
    }
    
    @GetMapping("/index")
    public String contactoE(Contacto contacto) { 
        
        return "redirect:/index";
    }
    
    
    @GetMapping("/modificar/{idContacto}")
    public String contactoModificar(Contacto contacto,Model model ) { 
        contacto = contactoService.getContacto(contacto);
        model.addAttribute("contacto", contacto);
        return "/contacto/modifica";
    }
    
    
    
    
}
