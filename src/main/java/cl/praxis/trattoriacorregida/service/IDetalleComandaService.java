package cl.praxis.trattoriacorregida.service;

import cl.praxis.trattoriacorregida.entity.Comandas;
import cl.praxis.trattoriacorregida.entity.DetalleComandas;

import java.util.List;

public interface IDetalleComandaService {
    public List<DetalleComandas> getAllDetallesComandas();
    public DetalleComandas getDetalleComandasById(int id);
    public DetalleComandas createDetalleComdanas(Comandas comanda);
    public DetalleComandas updateDetalleComandas(Comandas comanda);
    public void deleteDetalleComanda(int id);
}
