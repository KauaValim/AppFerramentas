package controller;

import java.util.List;
import model.EstoqueDAO;
import view.FRGerEstoque;

public class EstoqueController {

    public List<FRGerEstoque> getEstoque() {
        return EstoqueDAO.getEstoque();
    }
}
