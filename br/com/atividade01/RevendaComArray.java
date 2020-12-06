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

    public boolean comprar(int codigo, int quantidade){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    p.compra(quantidade);
                    return true;
                }
            }
        }
        System.out.println("Erro: o produto não existe.");
        return false;
    }

    public boolean vender(int codigo, int quantidade){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    if(p.getQuantidadeEstoque() - quantidade >= 0){
                        p.venda(quantidade);
                        return true;
                    }else{
                        System.out.println("Quantidade em estoque insuficiente para venda.");
                        return false;
                    }
                }
            }
        }
        System.out.println("Erro: o produto não existe.");
        return false;
    }

    public void consultaPrecoVenda(int codigo){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    System.out.println("Preço de venda: " + p.calculaPrecoVenda());
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

    public Produto buscaProduto(int codigo){
        for(Produto p : produtos){
            if(p != null){
                if(p.getCodigo() == codigo){
                    return p;
                }
            }
        }
        return null;
    }

}