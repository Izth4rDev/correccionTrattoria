package cl.praxis.trattoriacorregida.entity.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MesasDTO {
    private int idMesa;
    private int numeroMesa;
    private int cantidadPersonas;
    private boolean disponible;
}
