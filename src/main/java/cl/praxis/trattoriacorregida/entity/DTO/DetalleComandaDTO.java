package cl.praxis.trattoriacorregida.entity.DTO;
import cl.praxis.trattoriacorregida.entity.Comandas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleComandaDTO {
    private int id;
    private int cantidadProducto;
    private int precioUnitario;
    private Integer comandaId;
}
