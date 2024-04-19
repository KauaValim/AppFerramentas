/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.OVDAO;
import model.OrdemVenda;

/**
 *
 * @author S.Lucas
 */
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