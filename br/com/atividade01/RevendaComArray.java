package br.com.atividade01;

public class RevendaComArray{
    private Produto produtos[];
    private int indice;

    public RevendaComArray(){
        this.indice = 0;
    }

    public RevendaComArray(int quantidadeProdutos){
        this.produtos = new Produto[quantidadeProdutos];
        this.indice = 0;
    }

    public void inserirProduto(Produto produto){
        this.produtos[indice] = produto;
        indice++;
    }

    public void comprar(int codigo, int quantidade){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    p.compra(quantidade);
                    return;
                }
            }
        }
        System.out.println("Erro: o produto não existe.");
    }

    public void vender(int codigo, int quantidade){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    p.venda(quantidade);
                    return;
                }
            }
        }
        System.out.println("Erro: o produto não existe.");
    }

    public void consultaPrecoVenda(int codigo){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    System.out.println(p.calculaPrecoVenda());
                    return;
                }
            }
        }
        System.out.println("Erro: o produto não existe.");
    }

    public void listaPrecos(){
        for(Produto p : produtos){
            if(p != null){
                System.out.println("Código: " + p.getCodigo());
                System.out.println("Descrição: " + p.getDescricao());
                System.out.println("Preço de venda: " + p.calculaPrecoVenda());
                System.out.println();
            }
        }
    }

}