package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product>productList=new ArrayList<>();
    void addProductToMachine(Product product)
    {
        productList.add(product);
    }
    public List<Product> getProductList(){
        return productList;
    }

}
