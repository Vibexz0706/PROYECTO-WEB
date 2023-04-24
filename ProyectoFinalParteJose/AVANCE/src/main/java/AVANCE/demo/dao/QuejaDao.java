/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AVANCE.demo.dao;

import AVANCE.demo.domain.Queja;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Vibexz
 */
public interface QuejaDao extends CrudRepository<Queja, Long> {
    
}
