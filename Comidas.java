package com.mycompany.sonhomacio;

import java.util.*;

public class Comidas extends Produto{
    public static ArrayList<Comidas> cardapioComidas = new ArrayList();
    
    public Comidas(String nome, double preco){
        super(nome, preco);
    }
    
    public static void montarComidas(){
        cardapioComidas.add(new Comidas("Fatia de Torta", 5.00));
        cardapioComidas.add(new Comidas("Fatia de Bolo", 3.00));
        cardapioComidas.add(new Comidas("Salgado", 2.00));
    }
    
    public static void exibirComidas(){
        System.out.println("- Comidas -");
        for(int i = 0; i < cardapioComidas.size(); i++){
            Comidas c = cardapioComidas.get(i);
            System.out.println(i+1 +" - "+ c.getNome() +" - R$"+ c.getPreco());
        }
    }
}