package cl.praxis.trattoriacorregida.repository;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleComandaRepo extends JpaRepository <DetalleComandas, Integer> {
}
