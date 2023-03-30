/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.service.impl;

import AVANCE.demo.dao.FacturaDao;
import AVANCE.demo.domain.Factura;
import AVANCE.demo.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Vibexz
 */

@Service
public class FacturaServiceImpl implements FacturaService {
    
     @Autowired
    private FacturaDao facturaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Factura> getFacturas() {
        
        return (List<Factura>)facturaDao.findAll();
        
    }

    @Override
    @Transactional(readOnly=true)
    public Factura getFactura(Factura factura) {
        
        return facturaDao.findById(factura.getIdFactura()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Factura factura) {
        
        facturaDao.save(factura);
        
    }

    @Override
    @Transactional
    public void delete(Factura factura) {
        facturaDao.delete(factura);
    }
    
    
    
    
}
