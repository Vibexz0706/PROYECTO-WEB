/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.controller;



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
@RequestMapping("/encontrar")
public class EncontrarController {
    
  
    
    @GetMapping("/encuentranos")
    public String inicio(Model model) { 
        
        
        return "/encontrar/encuentranos";
    }
   
    
    
    
}
