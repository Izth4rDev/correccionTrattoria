package cl.praxis.trattoriacorregida.service;
import cl.praxis.trattoriacorregida.entity.Comandas;
import java.util.List;

public interface IComandaService {
    public List<Comandas> getAllComandas();
    public Comandas getComandaById(int id);
    public Comandas createComanda(Comandas comanda);
    public Comandas updateComanda(Comandas comanda);
    public void deleteComanda(int id);
}
