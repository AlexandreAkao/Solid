package OCP;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements TipoFiltro {
    @Override
    public Stream<Product> Filter(List<Product> products, Filtro filtro) {
        return products.stream().filter(filtro::isSatisfied);
    }
}
