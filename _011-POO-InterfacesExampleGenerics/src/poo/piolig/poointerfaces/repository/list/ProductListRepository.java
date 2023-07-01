package poo.piolig.poointerfaces.repository.list;

import poo.piolig.poointerfaces.model.Product;
import poo.piolig.poointerfaces.repository.AbstractListRepository;
import poo.piolig.poointerfaces.repository.Direction;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Product> {
    @Override
    public void edit(Product product) {
        Product p = getById(product.getId());
        p.setDescription(product.getDescription());
        p.setPrice(product.getPrice());
    }

    @Override
    public List<Product> list(String field, Direction dir) {
        List<Product> orderedList = new ArrayList<>(this.dataSource);
        orderedList.sort((Product a, Product b) -> {
            int result = 0;
            if (dir == Direction.ASC) {
                result = this.order(field, a, b);
            } else if (dir == Direction.DESC) {
                result = this.order(field, b, a);

            }

            return result;

        });
        return orderedList;
    }

    public static int order(String field, Product a, Product b) {
        int result = 0;
        switch (field) {
            case "id":
                result = a.getId().compareTo(b.getId());
                break;
            case "description":
                result = a.getDescription().compareTo(b.getDescription());
                break;
            case "price":
                result = a.getPrice().compareTo(b.getPrice());
                break;
        }
        return result;
    }
}
