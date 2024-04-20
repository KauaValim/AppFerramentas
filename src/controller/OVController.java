package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.OVDAO;
import model.OrdemVenda;

public class OVController {
    private OVDAO ovDAO;

    public OVController() {
        ovDAO = new OVDAO();
    }
    
    public List<OrdemVenda> getLastId(){
        return ovDAO.getLastId();
    }

    public boolean salvarOV(OrdemVenda ov) {
        if (ovDAO.salvarOV(ov)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar a OV");
            return false;
        }
    }
}