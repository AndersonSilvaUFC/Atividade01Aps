package br.com.atividade01;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main{

    public static void main(String[] args){
        RevendaComArray rev = new RevendaComArray(100);
        Scanner scanner = new Scanner(System.in);
        boolean entra = true;
        int codigo = 0;

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
            int opcao, cod, quant;
            double valorCompra, custo, margemLucro;
            Produto p; 
            try{
                opcao = Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.out.println("Digite apenas números!");
                System.out.println();
                System.out.println();
                System.out.println();
                continue;
            }
            System.out.println();

            switch(opcao){
                case 1:
                    String descricao;

                    System.out.println("Digite a descrição do produto: ");
                    descricao = scanner.next();
                    System.out.println("Digite o valor de compra do produto: ");
                    s = scanner.next();
                    valorCompra = Double.parseDouble(s);
                    System.out.println("Digite o custo do produto: ");
                    s = scanner.next();
                    custo = Double.parseDouble(s);
                    System.out.println("Digite a margem de lucro do produto: ");
                    s = scanner.next();
                    margemLucro = Double.parseDouble(s);

                    p = new Produto(codigo, descricao, valorCompra, custo, margemLucro);
                    rev.inserirProduto(p);
                    codigo++;
                    System.out.println("Produto inserido.");
                    break;
                case 2:   

                    System.out.println("Digite o código do produto: ");
                    s = scanner.next();
                    cod = Integer.parseInt(s);
                    System.out.println("Digite a quantidade adquirida: ");
                    s = scanner.next();
                    quant = Integer.parseInt(s);
                    if(rev.comprar(cod,quant))
                        System.out.println(quant + " produto(s) comprados.");
                        
                    break;
                case 3:
                    System.out.println("Digite o código do produto: ");
                    s = scanner.next();
                    cod = Integer.parseInt(s);
                    System.out.println("Digite a quantidade vendida: ");
                    s = scanner.next();
                    quant = Integer.parseInt(s);

                    if(rev.vender(cod,quant))
                        System.out.println(quant + " produto(s) vendidos.");

                    break;
                case 4:
                    System.out.println("Digite o código do produto: ");
                    s = scanner.next();
                    cod = Integer.parseInt(s);
                    rev.consultaPrecoVenda(cod);
                    break;
                case 5:
                    rev.listaPrecos();
                    break;
                case 6:
                    System.out.println("Digite o código do produto: ");
                    s = scanner.next();
                    cod = Integer.parseInt(s);
                    p = rev.buscaProduto(cod);
                    if(p != null){
                        System.out.println("Valor de compra: " + p.getValorCompra());
                        System.out.println("Margem de lucro: " + p.getMargemLucro());
                        System.out.println("Custo: " + p.getCusto());
                    }else{
                        System.out.println("Erro: o produto não existe.");
                    }
                    break;
                case 7:
                    System.out.println("Digite o código do produto: ");
                    s = scanner.next();
                    cod = Integer.parseInt(s);
                    p = rev.buscaProduto(cod);
                    System.out.println("Digite o novo valor de compra: ");
                    valorCompra = scanner.nextDouble();
                    System.out.println("Digite a nova margem de lucro: ");
                    margemLucro = scanner.nextDouble();
                    System.out.println("Digite o novo custo: ");
                    custo = scanner.nextDouble();

                    p.setValorCompra(valorCompra);
                    p.setMargemLucro(margemLucro);
                    p.setCusto(custo);
                    System.out.println("Valores atualizados.");
                    break;
                case 8:
                    entra = false;
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}