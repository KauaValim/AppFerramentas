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
public class FornecedorDAO {
    public boolean adicionarFornecedor(Fornecedor f) {
        String sql = "INSERT into tbfornecedores (nome, email, CNPJ, datacadastro, endereco, cidade, CEP, ativo) VALUES (?,?,?,?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getCNPJ());
            stmt.setDate(4, new java.sql.Date(f.getDataCadastro().getTime()));
            stmt.setString(5, f.getEndereco());
            stmt.setString(6, f.getCidade());
            stmt.setString(7, f.getCEP());
            stmt.setBoolean(8, f.isAtivo());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario: " + f.getNome() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
    
    public List<Fornecedor> readForForn(int tipo, String desc) {
        String sql = "SELECT * FROM tbfornecedores";
        if (!desc.equals("")) {
            if (tipo == 0 || tipo == 1) {
                sql = sql + " WHERE nome LIKE ?";
            } else {
                sql = sql + " WHERE email LIKE ?";
            }
        }
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            if (!desc.equals("")) {
                if (tipo == 0 || tipo == 2) {
                    stmt.setString(1, desc + "%");
                } else {
                    stmt.setString(1, "%" + desc + "%");
                }
            }

            rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setPkFornecedor(rs.getLong("pkidfornecedor"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setCNPJ(rs.getString("CNPJ"));
                fornecedor.setDataCadastro(rs.getDate("datacadastro"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setCEP(rs.getString("CEP"));
                fornecedor.setAtivo(rs.getBoolean("ativo"));
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return fornecedores;
    }
}
