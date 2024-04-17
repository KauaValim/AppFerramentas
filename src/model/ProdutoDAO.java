/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.Utils;

/**
 *
 * @author S.Lucas
 */
public class ProdutoDAO {
    public boolean adicionarProduto(Produto p) {
        String sql = "INSERT into TBPRODUTOS (nome, categoria, NCM, datacadastro, ativo, img) VALUES (?,?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCategoria());
            stmt.setString(3, p.getNCM());
            stmt.setDate(4, new java.sql.Date(p.getDataCadastro().getTime()));
            stmt.setBoolean(5, p.isAtivo());
            if (p.getImagem() != null) {
                byte[] iconBytes = Utils.iconToBytes(p.getImagem());
                stmt.setBytes(6, iconBytes);
            } else {
                stmt.setBytes(6, null);
            }
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario: " + p.getNome() + " inserido com sucesso!");
            return true;
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }

        return false;
    }
    
    public List<Produto> readForProd(int tipo, String desc) {
        String sql = "SELECT * FROM tbprodutos";
        if (!desc.equals("")) {
            if (tipo == 0 || tipo == 1) {
                sql = sql + " WHERE nome LIKE ?";
            } else {
                sql = sql + " WHERE categoria LIKE ?";
            }
        }
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();

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
                Produto produto = new Produto();

                produto.setPkIdProduto(rs.getLong("pkidproduto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setNCM(rs.getString("NCM"));
                produto.setDataCadastro(rs.getDate("datacadastro"));
                produto.setAtivo(rs.getBoolean("ativo"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.closeConnection(stmt, rs);
        }

        return produtos;
    }
}
