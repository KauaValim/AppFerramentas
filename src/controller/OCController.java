/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.OCDAO;
import model.OrdemCompra;

/**
 *
 * @author S.Lucas
 */
public class OCController {
    private OCDAO ocDAO;
    
    public OCController() {
        ocDAO = new OCDAO();
    }
    
    public List<OrdemCompra> getLastId(){
        return ocDAO.getLastId();
    }
    
    public boolean salvarOC(OrdemCompra o) {
        JOptionPane.showMessageDialog(null, "Foi para o lugar");
        if (ocDAO.salvarOC(o)){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Não foi possível salvar a OC");
            return false;
        }
    }
}
