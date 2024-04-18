/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Lucas
 */
public class OCDAO {
    
    public boolean salvarOC(OrdemCompra o) {
        String sql = "INSERT into tbcompras (dataemissao, condpagamento, fkidfornecedor) VALUES (?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(o.getDataEmissao().getTime()));
            stmt.setString(2, o.getCondpagamento());
            stmt.setLong(3, o.getPkFornecedor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ordem de compra: " + o.getNumOC()+ " salva com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
}
