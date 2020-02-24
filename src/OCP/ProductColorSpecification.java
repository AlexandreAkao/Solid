package OCP;

public class ProductColorSpecification implements Filtro {

    public Color color;

    public ProductColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.color == this.color;
    }
}
