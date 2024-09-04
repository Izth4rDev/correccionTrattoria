package cl.praxis.trattoriacorregida.restcontroller;
import cl.praxis.trattoriacorregida.DtoMapper.ComandaDTOMapper;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DTO.ComandasDTO;
import cl.praxis.trattoriacorregida.service.serviceimpl.ComandaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/comandas")
public class RestComanda {

    private ComandaServiceImpl comandaService;

    public RestComanda(ComandaServiceImpl comandaService) {
        this.comandaService = comandaService;
    }

    /*@GetMapping
    public ResponseEntity<List<Comandas>> getComanda() {
        List<Comandas> comandas = comandaService.getAllComandas();
        return ResponseEntity.ok(comandas);
    }*/

    @GetMapping
    public ResponseEntity<List<ComandasDTO>> obtainAllComandas() {
        List<Comandas> comandas = comandaService.getAllComandas();
        List<ComandasDTO> comandasDTOList = comandas.stream().map(ComandaDTOMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(comandasDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComandasDTO> getById(@PathVariable("id") int id) {
        Comandas comanda = comandaService.getComandaById(id);
        ComandasDTO comandasDTO = ComandaDTOMapper.toDto(comanda);
        return ResponseEntity.ok(comandasDTO);
    }

    @PostMapping
    public ResponseEntity<String> createComanda(@RequestBody ComandasDTO comandasDTO) {
        comandaService.createComanda(ComandaDTOMapper.toEntity(comandasDTO));
        return ResponseEntity.ok("comanda creada correctamente");
    }

    @PutMapping
    public ResponseEntity<String> updateComanda(@RequestBody ComandasDTO comandasDTO) {
        comandaService.updateComanda(ComandaDTOMapper.toEntity(comandasDTO));
        return ResponseEntity.ok("comanda actualizada correctamente");
    }
}
