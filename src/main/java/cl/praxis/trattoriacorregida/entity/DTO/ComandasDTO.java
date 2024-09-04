package cl.praxis.trattoriacorregida.entity.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComandasDTO {
    private int id;
    private LocalDate fechaEmision;
    private boolean estado;
    private int propinaSugerida;
    private int idMesa;
    private int idGarzon;
    private List<DetalleComandaDTO> detalleComandas;
}
