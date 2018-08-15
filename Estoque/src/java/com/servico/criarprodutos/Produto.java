/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.criarprodutos;

/**
 *
 * @author rodri
 */
public class Produto
{
    private String descricao;
    private String fabricacao;
    private double valor;

    public Produto(String descricao, String fabricacao, double valor) {
        this.descricao = descricao;
        this.fabricacao = fabricacao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
