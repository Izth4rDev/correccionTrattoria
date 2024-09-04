package cl.praxis.trattoriacorregida.DtoMapper;
import cl.praxis.trattoriacorregida.entity.DTO.MesasDTO;
import cl.praxis.trattoriacorregida.entity.Mesas;

public class MesasMapper {

    public static MesasDTO toDto(Mesas mesas) {
        MesasDTO mesasDTO = new MesasDTO();

        if(mesas == null) {
            return null;
        }

        mesasDTO.setIdMesa(mesas.getId());
        mesasDTO.setNumeroMesa(mesas.getNumeroMesa());
        mesasDTO.setCantidadPersonas(mesas.getCantidadPersona());
        mesasDTO.setDisponible(mesas.isDisponible());
        return mesasDTO;

    }
}
