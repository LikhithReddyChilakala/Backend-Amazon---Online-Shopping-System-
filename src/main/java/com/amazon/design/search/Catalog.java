package com.amazon.design.search;

import java.util.HashMap;
import java.util.Map;

public class Catalog implements Search {
    private Map productNames;
    private Map productCategories;

    public Catalog() {
        this.productNames = new HashMap();
        this.productCategories = new HashMap();
    }

    @Override
    public Object searchProductsByName(String name) {
        return productNames.get(name);
    }

    @Override
    public Object searchProductsByCategory(String category) {
        return productCategories.get(category);
    }
}
