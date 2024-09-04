package cl.praxis.trattoriacorregida.service.serviceimpl;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.repository.IComandaRepository;
import cl.praxis.trattoriacorregida.service.IComandaService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComandaServiceImpl implements IComandaService {

    private IComandaRepository comandaRepository;

    public ComandaServiceImpl(IComandaRepository comandaRepository) {
        this.comandaRepository = comandaRepository;
    }

    @Override
    public List<Comandas> getAllComandas() {
        return comandaRepository.findAll();
    }

    @Override
    public Comandas getComandaById(int id) {
        return comandaRepository.findById(id).orElse(null);
    }

    @Override
    public Comandas createComanda(Comandas comanda) {
        return comandaRepository.save(comanda);
    }

    @Override
    public Comandas updateComanda(Comandas comanda) {
        return comandaRepository.save(comanda);
    }

    @Override
    public void deleteComanda(int id) {

    }
}
