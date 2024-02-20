public class Eletronico extends Produto {

    private String marca;

    public Eletronico(String nome, String codigo, double preco, int quantidade, String marca) {
        super(nome, codigo, preco, quantidade);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return super.toString() + ", Marca: " + marca;
    }
}
