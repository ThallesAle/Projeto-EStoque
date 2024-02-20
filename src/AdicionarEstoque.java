import java.util.ArrayList;
import java.util.Iterator;

public class AdicionarEstoque {

    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();

        // adicionando produtos ao estoque
        estoque.add(new Eletronico("Iphone",  "IP001", 2999.99, 10, "Iponhe"));
        estoque.add(new Roupa("Camiseta", "RP001", 29.99, 50, "M"));
        estoque.add(new Alimento("Chocolate", "AL001", 5.99, 100, "2025-12-31"));
        estoque.add(new Eletronico("computador", "CPR001", 3500.00, 5, "AOCHERO"));

        // mostrando os produtos no estoque
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        // atualizar quantidade de produtos em estoque
        Produto produtoParaAtualizar = estoque.get(01); // atualizar produto da lista
        produtoParaAtualizar.adicionarQuantidade(0); // adicionar unidades
        produtoParaAtualizar.removerQuantidade(2); // remover unidades

        // listar produtos em estoque após atualização
        System.out.println("\nProdutos em estoque após atualização:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        // buscar produto por código
        String codigoBusca = "CPR001"; // código do produto
        System.out.println("\nBuscando produto pelo código: " + codigoBusca);
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigoBusca)) {
                System.out.println("Produto encontrado:\n" + produto);
                break;
            }
        }
        // remover produto usando o código
        String codigoRemover = ""; // código do produto
        Iterator<Produto> iterator = estoque.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getCodigo().equals(codigoRemover)) {
                iterator.remove();
                System.out.println("\nProduto removido do estoque:\n" + produto);
                break;
            }
        }

        // listar produtos em estoque após remoção
        System.out.println("\nProdutos em estoque após remoção:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}
