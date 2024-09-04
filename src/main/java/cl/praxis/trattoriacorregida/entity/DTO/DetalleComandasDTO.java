package cl.praxis.trattoriacorregida.entity.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleComandasDTO {
    private int id;
    private int cantidadProducto;
    private int precioUnitario;
    private ComandaDetalleDTO comanda;
}
