package cl.praxis.trattoriacorregida.restcontroller;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestRestController {

   /* @GetMapping
    public ResponseEntity<List<DetalleComandas>> getTestDetalles() {
        // Crear datos de prueba
       // DetalleComandas detalle1 = new DetalleComandas(1, 1, 15000, new Comandas(1, LocalDate.of(2024, 8, 27),true,25,null));
        //DetalleComandas detalle2 = new DetalleComandas(2, 1, 15000, new Comandas(1, LocalDate.of(2024, 7, 8),true,40,null));
        //List<DetalleComandas> detalles = List.of(detalle1, detalle2);

        return ResponseEntity.ok(null);
    }*/
}
