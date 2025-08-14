package com.mycompany.sonhomacio;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int fim = 0;
        int opcao;
        double subtotal;
        Scanner scan = new Scanner(System.in);
        Comidas.montarComidas();
        Bebidas.montarBebidas();
        List<ProdutoInfo> pedidos = new ArrayList();
        
        System.out.println("Bem-vindo ao Café Sonho Macio!\n");
        
        do{
            System.out.println("\n ~ Café Sonho Macio ~");
            System.out.println("Por favor, escolha:");
            System.out.println("1 - Comidas");
            System.out.println("2 - Bebidas");  
            if(!pedidos.isEmpty()){
                System.out.println("3 - Sair (e pagar)");
            }else{System.out.println("3 - Sair");}
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    Comidas.exibirComidas();
                    System.out.println("\n Escolha:");
                    int opcaoC = scan.nextInt();
                    if(opcaoC >= 1 && opcaoC <= Comidas.cardapioComidas.size()){
                        System.out.println("Quantas unidades?");
                        int qtdC  = scan.nextInt();
                        Comidas produtoC = Comidas.cardapioComidas.get(opcaoC - 1);
                        int novaQtd = produtoC.getQuantidade() + qtdC;
                        produtoC.setQuantidade(novaQtd);
                        if(!pedidos.contains(produtoC)){
                            pedidos.add(produtoC);
                        }
                    }else{
                        System.out.println("Não há está comida no menu.\n");
                    }
                break;
                
                case 2:
                      Bebidas.exibirBebidas();
                    System.out.println("\n Escolha:");
                    int opcaoB = scan.nextInt();
                    if(opcaoB >= 1 && opcaoB <= Bebidas.cardapioBebidas.size()){
                        System.out.println("Quantas unidades?");
                        int qtdB  = scan.nextInt();
                        Bebidas produtoB = Bebidas.cardapioBebidas.get(opcaoB - 1);
                        int novaQtd = produtoB.getQuantidade() + qtdB;
                        produtoB.setQuantidade(novaQtd);
                        if(!pedidos.contains(produtoB)){
                            pedidos.add(produtoB);
                        }
                    }else{
                        System.out.println("Não há está bebida no menu.\n");
                    }
                break;
                
                case 3:
                    fim = 1;
                break;
                
                default:
                    System.out.println("Opção inválida.");                
            }
            if(!pedidos.isEmpty()){
                System.out.println("\n = Pedidos a serem pagos =");
                for(ProdutoInfo p: pedidos){
                    subtotal = p.getPreco() * p.getQuantidade();
                    System.out.println(p.getQuantidade() +"x "+ p.getNome() +" - R$"+ subtotal);
                }
            }
            
        }while(fim != 1);
        
        double total = 0;
        if(!pedidos.isEmpty()){
            System.out.println("\n = Pedidos a serem pagos =");
            for(ProdutoInfo p: pedidos){
                subtotal = p.getPreco() * p.getQuantidade();
                System.out.println(p.getQuantidade() +"x "+ p.getNome() +" - R$"+ subtotal);
                total += subtotal;
            }
            System.out.println("\n Valor total: R$"+ total);
            System.out.println("\n Você pagou tudo, obrigada e volte sempre!\n");
        }else{
            System.out.println("\n Obrigada, volte sempre!\n");
        }
    }
}