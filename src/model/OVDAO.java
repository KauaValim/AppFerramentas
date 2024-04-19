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
public class OVDAO {
    private String tipoMovim;

    public String getTipoMovim() {
        return tipoMovim;
    }

    public void setTipoMovim(String tipoMovim) {
        this.tipoMovim = tipoMovim;
    }

    public List<OrdemVenda> getLastId() {
        String sql = "SELECT pkidvenda FROM tbvendas ORDER BY pkidvenda DESC limit 1;";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<OrdemVenda> numOV = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                OrdemVenda ov = new OrdemVenda();
                ov.setNumOV(rs.getLong("pkidvenda"));
                numOV.add(ov);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return numOV;
    };

    public boolean salvarOV(OrdemVenda v) {
        String sql = "INSERT into tbvendas (dataemissao, condpagamento, vlrtotal, qntitens, fkidvendedor) VALUES (?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, new java.sql.Date(v.getDataEmissao().getTime()));
            stmt.setString(2, v.getCondPagamento());
            stmt.setString(3, String.valueOf(v.getValorTotal()));
            stmt.setString(4, String.valueOf(v.getQntdTotal()));
            stmt.setLong(5, v.getPkVendedor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbvendas' " + e.getMessage());
        }

        v.setNumOV(this.getLastId().get(0).getNumOV());

        String sql2 = "SELECT pkiditemvendas FROM tbitensvendas ORDER BY pkiditemvendas DESC limit 1;";

        GerenciadorConexao gerenciador2 = new GerenciadorConexao();
        Connection con2 = gerenciador2.getConexao();
        PreparedStatement stmt2 = null;
        ResultSet rs2 = null;
        Long lastPKItensProd = Long.valueOf("0");

        try {
            stmt2 = con2.prepareStatement(sql2);
            rs2 = stmt2.executeQuery();
            rs2.next();
            rs2.getInt(1);
            if (!rs2.wasNull()) {
                lastPKItensProd = rs2.getLong(1);
                lastPKItensProd++;
            }
            /*JOptionPane.showMessageDialog(null, "primeira linha é nula? " + rs2.wasNull());
            JOptionPane.showMessageDialog(null, "o que contém: " + rs2.getLong(1));
            JOptionPane.showMessageDialog(null, "próximo pk: " + lastPKItensProd);*/
        } catch (SQLException ex) {
            lastPKItensProd++;
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql3 = "INSERT into tbitensvendas (fkidvenda, fkidproduto, vlrunitario, quantidade) VALUES (?,?,?,?)";
        GerenciadorConexao gerenciador3 = new GerenciadorConexao();
        Connection con3 = gerenciador3.getConexao();
        PreparedStatement stmt3 = null;

        for (int i = 0; i < v.getItens().size(); i++) {
            try {
                stmt3 = con3.prepareStatement(sql3);
                stmt3.setString(1, String.valueOf(v.getNumOV()));
                v.getItens().get(i).setPkIdItem(lastPKItensProd);
                lastPKItensProd++;
                stmt3.setString(2, String.valueOf(v.getItens().get(i).getCodigo()));
                stmt3.setString(3, String.valueOf(v.getItens().get(i).getPrecoUnitario()));
                stmt3.setString(4, String.valueOf(v.getItens().get(i).getQuantidade()));
                stmt3.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbitensvendas' " + e.getMessage());
            }
        }

        String sql4 = "INSERT into tbestoque (tipomovimentacao, fkiditemvendas) VALUES (?,?)";
        GerenciadorConexao gerenciador4 = new GerenciadorConexao();
        Connection con4 = gerenciador4.getConexao();
        PreparedStatement stmt4 = null;

        try {
            for (int i = 0; i < v.getItens().size(); i++) {
                stmt4 = con4.prepareStatement(sql4);
                stmt4.setString(1, "Saída");
                stmt4.setString(2, String.valueOf(v.getItens().get(i).getPkIdItem()));
                stmt4.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: 'INSERT into tbestoque' " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
            gerenciador2.closeConnection(stmt2, rs2);
            gerenciador3.closeConnection(stmt3);
            gerenciador4.closeConnection(stmt4);
        }
        return false;
    }
}
