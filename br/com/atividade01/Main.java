package br.com.atividade01;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean entra = true;

        while(entra){
            System.out.println("X--------------------------------------------------------------------------X");
            System.out.println("1 - Criar produto");
            System.out.println("2 - Comprar");
            System.out.println("3 - Vender");
            System.out.println("4 - Consultar preço");
            System.out.println("5 - Listar preços");
            System.out.println("6 - Consultar valor de compra, margem de lucro e custo de um produto");
            System.out.println("7 - Alterar valor de compra, margem de lucro e custo de um produto");
            System.out.println("8 - Sair");
            System.out.println("X--------------------------------------------------------------------------X");
            System.out.println("Selecione uma opção: ");

            String s = scanner.next();
            int opcao;
            try{
                opcao = Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.out.println("Digite apenas números!");
                System.out.println();
                System.out.println();
                System.out.println();
                continue;
            }

            switch(opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    entra = false;
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
            for(int i=0; i<3; i++)
                System.out.println();
        }
    }
}