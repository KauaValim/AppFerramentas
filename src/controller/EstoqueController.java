package controller;

import java.util.List;
import model.EstoqueDAO;
import model.Estoque;

public class EstoqueController {

    public List<Estoque> getEstoque(Estoque codProd) {
        return EstoqueDAO.getEstoque(codProd);
    }
}
