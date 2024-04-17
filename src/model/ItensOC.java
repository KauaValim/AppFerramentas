/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author kaua_
 */
public class ItensOC extends OrdemCompra{
    private Long codigo;
    private String nome;
    private double precoUnitario;
    private int quantidade;
    
    public ItensOC() {}

    public ItensOC(Long codigo, String nome, double precoUnitario, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public ItensOC(Long codigo, String nome, double precoUnitario, int quantidade, Long numOC, Date dataEmissao, String condpagamento, double valorTotal, int qntdTotal, Long pkFornecedor) {
        super(numOC, dataEmissao, condpagamento, valorTotal, qntdTotal, pkFornecedor);
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
