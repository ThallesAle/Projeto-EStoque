public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantEstoque;

    public Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantEstoque = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Preço: " + preco + ", Quantidade: " + quantEstoque;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantEstoque += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        if (quantidade <= this.quantEstoque) {
            this.quantEstoque -= quantidade;
        } else {
          System.out.println("\nQuantidade a remover excede a quantidade em estoque.");
        }
    }

}