package cl.praxis.trattoriacorregida.entity.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComandaDetalleDTO {
    private int id;
    private LocalDate fechaEmision;
    private boolean estado;
    private int propinaSugerida;
}
