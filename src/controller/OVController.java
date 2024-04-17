package controller;

import javax.swing.JOptionPane;
import model.OrdemVenda;
import model.OVDAO;

public class OVController {

    private OVDAO ovDAO;

    public OVController() {
        ovDAO = new OVDAO();
    }

    public boolean adicionarOV(OrdemVenda ov) {
        if (ovDAO.adicionarOrdemVenda(ov)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ordem de venda não cadastrada");
            return false;
        }
    }

}