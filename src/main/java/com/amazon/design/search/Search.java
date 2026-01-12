package com.amazon.design.search;

public interface Search {
    Object searchProductsByName(String name);
    Object searchProductsByCategory(String category);
}
