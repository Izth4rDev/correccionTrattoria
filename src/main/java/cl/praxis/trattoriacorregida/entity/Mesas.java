package cl.praxis.trattoriacorregida.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mesas {
    @Id
    @Column(name = "id_mesa")
    private int id;
    @Column(name = "cantidad_persona")
    private int cantidadPersona;
    @Column(name = "numero_mesa")
    private int numeroMesa;
    @Column(name = "disponible")
    private boolean disponible;

    @OneToMany(mappedBy = "mesa")
    private List<Comandas> comandas;
}
