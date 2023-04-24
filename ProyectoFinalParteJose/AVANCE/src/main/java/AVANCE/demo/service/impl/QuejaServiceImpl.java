/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AVANCE.demo.service.impl;

import AVANCE.demo.dao.QuejaDao;
import AVANCE.demo.domain.Queja;
import AVANCE.demo.service.QuejaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Vibexz
 */

@Service
public class QuejaServiceImpl implements QuejaService {
    
     @Autowired
    private QuejaDao quejaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Queja> getQuejas() {
        
        return (List<Queja>)quejaDao.findAll();
        
    }

    @Override
    @Transactional(readOnly=true)
    public Queja getQueja(Queja queja) {
        
        return quejaDao.findById(queja.getIdQueja()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Queja queja) {
        
        quejaDao.save(queja);
        
    }

    @Override
    @Transactional
    public void delete(Queja queja) {
        quejaDao.delete(queja);
    }
    
    
    
    
}
