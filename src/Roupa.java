public class Roupa extends Produto {

    private String tamanho;

    public Roupa(String nome, String codigo, double preco, int quantidade, String tamanho) {
        super(nome, codigo, preco, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho: " + tamanho;
    }
}
