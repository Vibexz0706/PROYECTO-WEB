package AVANCE.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "empleado")
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Long idContacto;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private int telefono;
    private String info;

    public Contacto() {
    }

    public Contacto(Long idContacto, String nombre, String apellidos, String correo, int telefono, String info) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.info = info;
    }

  
    
  


}
