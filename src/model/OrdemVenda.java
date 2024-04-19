package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdemVenda {
    private Long numOV;
    private String condPagamento;
    private Date dataEmissao;
    private double valorTotal;
    private double qntdTotal;
    private Long pkVendedor;
    List<ItensOV> itens = new ArrayList<>();
    
    public OrdemVenda(){}

    public OrdemVenda(Long numOV, String condPagamento, Date dataEmissao, double valorTotal, double qntdTotal, Long pkVendedor) {
        this.numOV = numOV;
        this.condPagamento = condPagamento;
        this.dataEmissao = dataEmissao;
        this.valorTotal = valorTotal;
        this.qntdTotal = qntdTotal;
        this.pkVendedor = pkVendedor;
    }

    public Long getNumOV() {
        return numOV;
    }

    public void setNumOV(Long numOV) {
        this.numOV = numOV;
    }

    public String getCondPagamento() {
        return condPagamento;
    }

    public void setCondPagamento(String condPagamento) {
        this.condPagamento = condPagamento;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getQntdTotal() {
        return qntdTotal;
    }

    public void setQntdTotal(double qntdTotal) {
        this.qntdTotal = qntdTotal;
    }

    public Long getPkVendedor() {
        return pkVendedor;
    }

    public void setPkVendedor(Long pkVendedor) {
        this.pkVendedor = pkVendedor;
    }

    public List<ItensOV> getItens() {
        return itens;
    }

    public void setItens(List<ItensOV> itens) {
        this.itens = itens;
    }
    
}
