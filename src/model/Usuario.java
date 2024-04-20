package model;

import java.util.Date;

public class Usuario {
    private long pkUsuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataAdmissao;
    private boolean ativo;
    
    public Usuario() {}

    public Usuario(long pkUsuario, String nome, String email, String senha, Date dataAdmissao, boolean ativo) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataAdmissao = dataAdmissao;
        this.ativo = ativo;
    }

    public long getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(long pkUsuario) {
        this.pkUsuario = pkUsuario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
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
