package com.servico.criarpaciente;

public class Paciente
{
    private String nome;
    private String tipoEnfermidade;

    public Paciente(String nome, String tipoEnfermidade)
    {
        this.nome = nome;
        this.tipoEnfermidade = tipoEnfermidade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTipoEnfermidade()
    {
        return tipoEnfermidade;
    }

    public void setTipoEnfermidade(String tipoEnfermidade)
    {
        this.tipoEnfermidade = tipoEnfermidade;
    }
}
