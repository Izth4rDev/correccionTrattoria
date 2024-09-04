/*package cl.praxis.trattoriacorregida.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="detalles_comandas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class DetalleComandas {
    @Id
    @Column(name = "id_detalle")
    private int id;

    @Column(name = "cantidad_producto")
    private int cantidadProducto;

    @Column(name="precio_unitario")
    private int precioUnitario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_comanda")
    @JsonBackReference
    private Comandas comanda;
}*/
package cl.praxis.trattoriacorregida.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="detalles_comandas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DetalleComandas {
    @Id
    @Column(name = "id_detalle")
    private int id;

    @Column(name = "cantidad_producto")
    private int cantidadProducto;

    @Column(name="precio_unitario")
    private int precioUnitario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_comanda")
    private Comandas comanda;
}