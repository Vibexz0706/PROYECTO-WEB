/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AVANCE.demo.service;

import AVANCE.demo.domain.Factura;
import java.util.List;

/**
 *
 * @author Vibexz
 */
public interface FacturaService {
    
    
    public List<Factura> getFacturas();
    
    public Factura getFactura(Factura factura);
    
    public void save(Factura factura);
    
    public void delete(Factura factura);
    
}
    
    

