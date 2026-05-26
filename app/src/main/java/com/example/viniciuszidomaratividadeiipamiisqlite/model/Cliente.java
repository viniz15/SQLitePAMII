package com.example.viniciuszidomaratividadeiipamiisqlite.model;

public class Cliente {
    private int id;
    String nome;
    String email;
    String endereco;
    int cep;
    String cidade;
    String estado;
    long telefone;

    public int getId(){return id;}
    public void setId(int id){this.id =id;}

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

    public String getEndereco(){return endereco;}
    public void setEndereco(String endereco){this.endereco = endereco;}

    public int getCep(){return cep;}
    public void setCep(int cep){this.cep = cep;}

    public String getCidade(){return cidade;}
    public void setCidade(String cidade){this.cidade = cidade;}

    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}

    public long getTelefone(){return telefone;}
    public void setTelefone(long telefone){this.telefone = telefone;}
}
