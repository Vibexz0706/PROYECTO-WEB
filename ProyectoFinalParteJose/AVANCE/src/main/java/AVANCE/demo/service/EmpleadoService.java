/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AVANCE.demo.service;

import AVANCE.demo.domain.Empleado;
import java.util.List;

/**
 *
 * @author Vibexz
 */
public interface EmpleadoService {
    
    
    public List<Empleado> getEmpleados();
    
    public Empleado getEmpleado(Empleado empleado);
    
    public void save(Empleado empleado);
    
    public void delete(Empleado empleado);
    
}
    
    

