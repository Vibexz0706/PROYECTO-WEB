package AVANCE.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    private int cedulaEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String puesto;
    private boolean estado;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, int cedulaEmpleado, String nombre, String primerApellido, String segundoApellido, String correo, String puesto, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.puesto = puesto;
        this.estado = estado;
    }

    
  


}
