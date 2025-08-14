package com.mycompany.sonhomacio;

import java.util.*;

public class Bebidas extends Produto{
    public static ArrayList<Bebidas> cardapioBebidas = new ArrayList();
    
    public Bebidas (String nome, double preco){
        super(nome, preco);
    }
    
    public static void montarBebidas(){
        cardapioBebidas.add(new Bebidas("Café", 2.00));
        cardapioBebidas.add(new Bebidas("Café com Leite", 2.50));
        cardapioBebidas.add(new Bebidas("Achocolatado", 1.00));
    }
    
    public static void exibirBebidas(){
        System.out.println("- Bebidas -");
        for(int i = 0; i < cardapioBebidas.size(); i++){
            Bebidas b = cardapioBebidas.get(i);
            System.out.println(i+1 +" - "+ b.getNome() +" - R$"+ b.getPreco());
        }
    }
}