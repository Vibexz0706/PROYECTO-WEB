package AVANCE.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;

    private String detalles;
    private double monto;
    private String tipo;
    private boolean activo;

    public Factura() {
    }

    public Factura(String detalles, double monto, String tipo, boolean activo) {
        this.detalles = detalles;
        this.monto = monto;
        this.tipo = tipo;
        this.activo = activo;
    }


}
