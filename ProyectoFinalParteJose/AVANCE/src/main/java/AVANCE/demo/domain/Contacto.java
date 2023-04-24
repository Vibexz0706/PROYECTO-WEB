package AVANCE.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Long idContacto;
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private int telefono;
    private String info;

    public Contacto() {
    }

    public Contacto(Long idContacto, String nombre, String primerApellido, String segundoApellido, String correo, int telefono, String info) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.info = info;
    }


  
    
  


}
