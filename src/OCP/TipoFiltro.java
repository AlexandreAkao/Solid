package OCP;

import java.util.List;
import java.util.stream.Stream;

public interface TipoFiltro {
    Stream<Product> Filter(List<Product> products, Filtro filtro);
}
