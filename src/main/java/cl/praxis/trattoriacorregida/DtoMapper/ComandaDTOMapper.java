package cl.praxis.trattoriacorregida.DtoMapper;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DTO.ComandasDTO;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;
import cl.praxis.trattoriacorregida.entity.Garzones;
import cl.praxis.trattoriacorregida.entity.Mesas;
import java.util.List;

public class ComandaDTOMapper {

    public static ComandasDTO toDto(Comandas comanda) {

        if (comanda == null) {
            return null;
        }

        ComandasDTO comandasDTO = new ComandasDTO();
        comandasDTO.setId(comanda.getId());
        comandasDTO.setEstado(comanda.isEstado());
        comandasDTO.setFechaEmision(comanda.getFechaEmision());
        comandasDTO.setIdMesa(comanda.getMesa().getId());
        comandasDTO.setIdGarzon(comanda.getGarzon().getId());
        comandasDTO.setDetalleComandas(comanda.getDetalleComandas().stream()
                .map(DetalleComandaDTOMapper::toDto)
                .toList());

        return comandasDTO;
    }

    public static Comandas toEntity(ComandasDTO comandasDTO) {
        if (comandasDTO == null) {
            return null;
        }

        Comandas newComanda = new Comandas();

        newComanda.setId(comandasDTO.getId());
        newComanda.setFechaEmision(comandasDTO.getFechaEmision());
        newComanda.setEstado(comandasDTO.isEstado());
        newComanda.setPropinaSugerida(comandasDTO.getPropinaSugerida());

        //setting Mesa
        Mesas mesa = new Mesas();
        mesa.setId(comandasDTO.getIdMesa());
        newComanda.setMesa(mesa);

        //setting garzon
        Garzones garzones = new Garzones();
        garzones.setId(comandasDTO.getIdGarzon());
        newComanda.setGarzon(garzones);

        List<DetalleComandas> detalleComandas = comandasDTO.getDetalleComandas().stream()
                .map(DetalleComandaDTOMapper::toEntity).toList();

        newComanda.setDetalleComandas(detalleComandas);
        return newComanda;
    }
}
