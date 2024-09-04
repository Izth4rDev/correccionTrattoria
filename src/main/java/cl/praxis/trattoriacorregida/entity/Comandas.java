package cl.praxis.trattoriacorregida.entity;
/*import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comandas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Comandas {
    @Id
    @Column(name="id_comanda")
    private int id;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "estado")
    private boolean estado;

    @Column(name="propina_sugerida")
    private int propinaSugerida;

    @OneToMany(mappedBy = "comanda", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<DetalleComandas> detalleComandas;
}*/

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comandas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comandas {
    @Id
    @Column(name="id_comanda")
    private int id;

    @Column(name = "fecha_emision")
    private LocalDate fechaEmision;

    @Column(name = "estado")
    private boolean estado;

    @Column(name="propina_sugerida")
    private int propinaSugerida;

    @OneToMany(mappedBy = "comanda", fetch = FetchType.LAZY)
    private List<DetalleComandas> detalleComandas;

    @ManyToOne
    @JoinColumn(name = "id_mesa")
    private Mesas mesa;

    @ManyToOne
    @JoinColumn(name = "id_garzon")
    private Garzones garzon;

}
