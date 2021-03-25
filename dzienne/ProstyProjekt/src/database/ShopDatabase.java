package database;

import model.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class ShopDatabase {
    private List<Product> products;

    public Product getProductById(int id){
        throw new NotImplementedException();
    }

    public List<Product> getProductsByName(String name){

        throw new NotImplementedException();
    }

    public List<Product> getProductsWithPriceInLimits(double min, double max){
        throw new NotImplementedException();
    }
}
