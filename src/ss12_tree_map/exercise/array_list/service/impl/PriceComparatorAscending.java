package ss12_tree_map.exercise.array_list.service.impl;

import ss12_tree_map.exercise.array_list.model.Product;

import java.util.Comparator;

public class PriceComparatorAscending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
