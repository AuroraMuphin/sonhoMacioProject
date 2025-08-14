package com.mycompany.sonhomacio;

public abstract class Produto implements ProdutoInfo{
    protected String nome;
    protected double preco;
    protected int quantidade;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    @Override
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    @Override
    public int getQuantidade(){
        return quantidade;
    }
}