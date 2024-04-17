package controller;

import javax.swing.JOptionPane;
import model.Usuario;

public class OVController {

    private OVDAO ovDAO;

    public OVController() {
        ovDAO = OVDAO();
    }

    public boolean adicionarOV(Usuario u) {
        if (ovDAO.adicionarUsuario(u)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado");
            return false;
        }
    }

    public boolean alterarOV(Usuario u) {
        if (ovDAO.alterarUsuario(u)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não alterado");
            return false;
        }
    }

    public boolean excluirOV(int pkUsuario) {
        if (ovDAO.excluirUsuario(pkUsuario)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario não excluído");
            return false;
        }
    }
}
