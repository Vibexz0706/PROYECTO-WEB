/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.controller;

import AVANCE.demo.domain.Factura;
import AVANCE.demo.service.FacturaService;
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
@RequestMapping("/factura")
public class FacturaController {
    
    @Autowired
    private FacturaService facturaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) { 
        var facturas=facturaService.getFacturas();
        model.addAttribute("facturas", facturas);
        model.addAttribute("totalFacturas",facturas.size());
        var totalCredito=0;
         model.addAttribute("totalCredito",totalCredito);

        return "/factura/listado";
    }
    
     @GetMapping("/nuevo")
    public String facturaNuevo(Factura factura) { 
        return "/factura/modifica";
    }
    
     @PostMapping("/guardar")
    public String facturaGuardar(Factura factura) { 
        facturaService.save(factura);
        return "redirect:/factura/listado";
    }
    
    @GetMapping("/eliminar/{idFactura}")
    public String facturaEliminar(Factura factura) { 
        facturaService.delete(factura);
        return "redirect:/factura/listado";
    }
    
    @GetMapping("/index")
    public String facturaE(Factura factura) { 
        
        return "redirect:/index";
    }
    
    
    @GetMapping("/modificar/{idFactura}")
    public String facturaModificar(Factura factura,Model model ) { 
        factura = facturaService.getFactura(factura);
        model.addAttribute("factura", factura);
        return "/factura/modifica";
    }
    
    
    
    
}
