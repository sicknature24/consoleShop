package com.denis.store;

import com.denis.domain.Category;
import com.denis.domain.Product;
import com.denis.store.utility.CommandSortComparator;
import com.denis.store.utility.RandomStorePopulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<Category> categoryList;

    public Store() {
        try {
            this.categoryList = new RandomStorePopulator().getRandomCategory();
        } catch (Exception exception) {
            System.out.println("ERROR: RandomStorePopulator = " + exception.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder printStore = new StringBuilder();
        for (Category category : categoryList) {
            printStore.append(category.toString());
            printStore.append("\n");
        }

        return "WILDEN's ONLINE STORE: \n" + printStore;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }
}
