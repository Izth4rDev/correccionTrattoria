package cl.praxis.trattoriacorregida.repository;
import cl.praxis.trattoriacorregida.entity.Comandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComandaRepository extends JpaRepository <Comandas, Integer> {

}
