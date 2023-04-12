/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.service.impl;

import AVANCE.demo.dao.ContactoDao;
import AVANCE.demo.domain.Contacto;
import AVANCE.demo.service.ContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Vibexz
 */

@Service
public class ContactoServiceImpl implements ContactoService {
    
     @Autowired
    private ContactoDao contactoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Contacto> getContactos() {
        
        return (List<Contacto>)contactoDao.findAll();
        
    }

    @Override
    @Transactional(readOnly=true)
    public Contacto getContacto(Contacto contacto) {
        
        return contactoDao.findById(contacto.getIdContacto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Contacto contacto) {
        
        contactoDao.save(contacto);
        
    }

    @Override
    @Transactional
    public void delete(Contacto contacto) {
        contactoDao.delete(contacto);
    }
    
    
    
    
}
