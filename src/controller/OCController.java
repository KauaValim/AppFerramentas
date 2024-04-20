package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.OCDAO;
import model.OrdemCompra;

public class OCController {
    private OCDAO ocDAO;
    
    public OCController() {
        ocDAO = new OCDAO();
    }
    
    public List<OrdemCompra> getLastId(){
        return ocDAO.getLastId();
    }
    
    public boolean salvarOC(OrdemCompra o) {
        if (ocDAO.salvarOC(o)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Não foi possível salvar a OC");
            return false;
        }
    }
}
