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
public class Fornecedor {
    private long pkFornecedor;
    private String nome;
    private String email;
    private String CNPJ;
    private Date dataCadastro;
    private String endereco;
    private String cidade;
    private String CEP;
    private boolean ativo;
    
    public Fornecedor() {};

    public Fornecedor(long pkFornecedor, String nome, String email, String CNPJ, Date dataCadastro, String endereco, String cidade, String CEP, boolean ativo) {
        this.pkFornecedor = pkFornecedor;
        this.nome = nome;
        this.email = email;
        this.CNPJ = CNPJ;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.cidade = cidade;
        this.CEP = CEP;
        this.ativo = ativo;
    }

    public long getPkFornecedor() {
        return pkFornecedor;
    }

    public void setPkFornecedor(long pkFornecedor) {
        this.pkFornecedor = pkFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public String ativoToString() {
        if(ativo == true) {
            return "Ativo";
        } else {
            return "Inativo";
        }
    }
    
}
