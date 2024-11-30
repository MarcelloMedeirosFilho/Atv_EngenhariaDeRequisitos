package com.service.service;

public class Produto {
    private String nome;
    private int quantidadeEstoque;
    private boolean emEstoque;

    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.emEstoque = quantidadeEstoque > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }
}