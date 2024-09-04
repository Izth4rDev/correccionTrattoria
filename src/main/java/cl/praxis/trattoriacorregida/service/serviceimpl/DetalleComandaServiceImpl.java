package cl.praxis.trattoriacorregida.service.serviceimpl;
import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;
import cl.praxis.trattoriacorregida.repository.IDetalleComandaRepo;
import cl.praxis.trattoriacorregida.service.IDetalleComandaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleComandaServiceImpl implements IDetalleComandaService {

    private IDetalleComandaRepo detalleComandaRepo;
    public DetalleComandaServiceImpl(IDetalleComandaRepo repo) {
        this.detalleComandaRepo = repo;
    }

    @Override
    public List<DetalleComandas> getAllDetallesComandas() {
        return detalleComandaRepo.findAll();
    }

    @Override
    public DetalleComandas getDetalleComandasById(int id) {
        return null;
    }

    @Override
    public DetalleComandas createDetalleComdanas(Comandas comanda) {
        return null;
    }

    @Override
    public DetalleComandas updateDetalleComandas(Comandas comanda) {
        return null;
    }

    @Override
    public void deleteDetalleComanda(int id) {

    }
}
