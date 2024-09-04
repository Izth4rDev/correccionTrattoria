package cl.praxis.trattoriacorregida.DtoMapper;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DTO.DetalleComandaDTO;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;

public class DetalleComandaDTOMapper {

    public static DetalleComandaDTO toDto(DetalleComandas detalleComanda) {

        if (detalleComanda.getComanda() == null) {
            return new DetalleComandaDTO(
                    detalleComanda.getId(),
                    detalleComanda.getCantidadProducto(),
                    detalleComanda.getPrecioUnitario(),
                    null
            );
        }

        DetalleComandaDTO detalleComandaDTO = new DetalleComandaDTO();
        detalleComandaDTO.setId(detalleComanda.getId());
        detalleComandaDTO.setCantidadProducto(detalleComanda.getCantidadProducto());
        detalleComandaDTO.setPrecioUnitario(detalleComanda.getPrecioUnitario());
        detalleComandaDTO.setComandaId(detalleComanda.getComanda().getId());
        return detalleComandaDTO;
    }

    public static DetalleComandas toEntity(DetalleComandaDTO detalleComandaDTO) {

        DetalleComandas detalleComanda = new DetalleComandas();

        detalleComanda.setId(detalleComandaDTO.getId());
        detalleComanda.setCantidadProducto(detalleComandaDTO.getCantidadProducto());
        detalleComanda.setPrecioUnitario(detalleComandaDTO.getPrecioUnitario());
        Comandas comanda = new Comandas();
        comanda.setId(detalleComandaDTO.getComandaId());
        detalleComanda.setComanda(comanda);

        return detalleComanda;
    }
}
