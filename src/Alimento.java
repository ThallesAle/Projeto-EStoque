public class Alimento extends Produto {

    private String validade;

    public Alimento(String nome, String codigo, double preco, int quantidade, String validade) {
        super(nome, codigo, preco, quantidade);
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Validade: " + validade;
    }
}
