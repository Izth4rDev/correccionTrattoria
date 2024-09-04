package cl.praxis.trattoriacorregida.DtoMapper;
import cl.praxis.trattoriacorregida.entity.DTO.ComandaDetalleDTO;
import cl.praxis.trattoriacorregida.entity.DTO.DetalleComandasDTO;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;

public class DetalleComandasDtoMapper {

    public static DetalleComandasDTO toDto(DetalleComandas detalleComandas) {
        DetalleComandasDTO detalleComandasDTO = new DetalleComandasDTO();
        ComandaDetalleDTO comandaDetalleDTO = new ComandaDetalleDTO();

        //Setting and Verifying when comanda is null on DB
        if(detalleComandas.getComanda() == null) {
            detalleComandasDTO.setId(detalleComandas.getId());
            detalleComandasDTO.setCantidadProducto(detalleComandas.getCantidadProducto());
            detalleComandasDTO.setPrecioUnitario(detalleComandas.getPrecioUnitario());
            detalleComandasDTO.setComanda(null);
            return detalleComandasDTO;
        }

        detalleComandasDTO.setId(detalleComandas.getId());
        detalleComandasDTO.setCantidadProducto(detalleComandas.getCantidadProducto());
        detalleComandasDTO.setPrecioUnitario(detalleComandas.getPrecioUnitario());
            //setting comandaDetalleDTO
            comandaDetalleDTO.setId(detalleComandas.getComanda().getId());
            comandaDetalleDTO.setEstado(detalleComandas.getComanda().isEstado());
            comandaDetalleDTO.setFechaEmision(detalleComandas.getComanda().getFechaEmision());
            comandaDetalleDTO.setPropinaSugerida(detalleComandas.getComanda().getPropinaSugerida());
        //setting comanda DTO on detallaComandasDTO
        detalleComandasDTO.setComanda(comandaDetalleDTO);

        return detalleComandasDTO;
    }
}
