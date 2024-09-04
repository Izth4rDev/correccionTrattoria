package cl.praxis.trattoriacorregida.restcontroller;
import cl.praxis.trattoriacorregida.DtoMapper.DetalleComandaDTOMapper;
import cl.praxis.trattoriacorregida.DtoMapper.DetalleComandasDtoMapper;
import cl.praxis.trattoriacorregida.entity.DTO.DetalleComandaDTO;
import cl.praxis.trattoriacorregida.entity.DTO.DetalleComandasDTO;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;
import cl.praxis.trattoriacorregida.service.serviceimpl.DetalleComandaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/detalle")
public class DetalleComandaRestController {

    private DetalleComandaServiceImpl detalleComandaService;

    public DetalleComandaRestController(DetalleComandaServiceImpl detalleComandaService) {
        this.detalleComandaService = detalleComandaService;
    }

    @GetMapping("/detail1")
    public ResponseEntity<List<DetalleComandaDTO>> getDetalleComandas() {
        List<DetalleComandas> detalleComandasList = detalleComandaService.getAllDetallesComandas();
        List<DetalleComandaDTO> detalleComandaDTOList = detalleComandasList.stream().map(DetalleComandaDTOMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(detalleComandaDTOList);
    }

    @GetMapping("/detail2")
    public ResponseEntity<List<DetalleComandasDTO>> getDetalleComandas2() {
        List<DetalleComandas> detalleComandas = detalleComandaService.getAllDetallesComandas();
        List<DetalleComandasDTO> detalleComandasDTOS = detalleComandas.stream().map(DetalleComandasDtoMapper::toDto)
                .collect(Collectors.toList());
        return  ResponseEntity.ok(detalleComandasDTOS);
    }
}
