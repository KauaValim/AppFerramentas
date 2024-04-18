/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KauaValim
 */
public class GerenciadorConexao {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/dbappferramentas";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    // private static GerenciadorConexao instancia:
    private Connection conexao;
    
    public GerenciadorConexao() {
        try{
            conexao = DriverManager.getConnection(URL, USER, PASSWORD); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
        }
    }
    
    public Connection getConexao() {
        return conexao;
    }
    
    public void closeConnection() {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciadorConexao.class.getName())
                    .log(Level.SEVERE, null,  ex);
        }
    }
    
    public void closeConnection(PreparedStatement stmt) {
        closeConnection();
    
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciadorConexao.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection(PreparedStatement stmt, ResultSet rs) {
        closeConnection(stmt);
    
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(GerenciadorConexao.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}
