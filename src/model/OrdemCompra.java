/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author kaua_
 */
public class OrdemCompra {
    private Long numOC;
    private Date dataEmissao;
    private String condpagamento;
    private double valorTotal;
    private int qntdTotal;
    private Long pkFornecedor;
    List<ItensOC> itens = new ArrayList<>();

    public OrdemCompra() {}

    public OrdemCompra(Long numOC, Date dataEmissao, String condpagamento, double valorTotal, int qntdTotal, Long pkFornecedor) {
        this.numOC = numOC;
        this.dataEmissao = dataEmissao;
        this.condpagamento = condpagamento;
        this.pkFornecedor = pkFornecedor;
    }

    public Long getNumOC() {
        return numOC;
    }

    public void setNumOC(Long numOC) {
        this.numOC = numOC;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCondpagamento() {
        return condpagamento;
    }

    public void setCondpagamento(String condpagamento) {
        this.condpagamento = condpagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQntdTotal() {
        return qntdTotal;
    }

    public void setQntdTotal(int qntdTotal) {
        this.qntdTotal = qntdTotal;
    }

    public Long getPkFornecedor() {
        return pkFornecedor;
    }

    public void setPkFornecedor(Long pkFornecedor) {
        this.pkFornecedor = pkFornecedor;
    }

    public List<ItensOC> getItens() {
        return itens;
    }

    public void setItens(List<ItensOC> itens) {
        this.itens = itens;
    }
    
}
