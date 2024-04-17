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
        if (ovDAO.adicionarOV(ov)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ordem de venda não cadastrada"); 
            return false;
        }
    }

    public boolean alterarOV(OrdemVenda ov) { 
        if (ovDAO.alterarOV(ov)) { 
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ordem de venda não alterada"); 
            return false;
        }
    }

    public boolean excluirOV(Long numOrdemVenda) { 
        if (ovDAO.excluirOV(numOrdemVenda)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ordem de venda não excluída"); 
            return false;
        }
    }
}