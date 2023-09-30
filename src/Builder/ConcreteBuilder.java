package Builder;
// Étape 3: Créer une classe de constructeur concret pour un produit spécifique

import Builder;
import Builder.Builder;

public class ConcreteBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("Part 1 built");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part 2 built");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Part 3 built");
    }

    public Product getResult() {
        return product;
    }
}
