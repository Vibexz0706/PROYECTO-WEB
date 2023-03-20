package com.ProyectoFinalWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
   
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;
    
   private String usuario;
   private String contrasena;



    public Usuario() {
    }

    public Usuario( String usuario, String contrasena,Long idUsuario) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

  
   
}
