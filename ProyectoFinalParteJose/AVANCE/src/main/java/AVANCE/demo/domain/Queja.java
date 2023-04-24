package AVANCE.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "queja")
public class Queja implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_queja")
    private Long idQueja;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String info;

    public Queja() {
    }

    public Queja(Long idQueja, String nombre, String primerApellido, String segundoApellido, String info) {
        this.idQueja = idQueja;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
       
        this.info = info;
    }


  
    
  


}
