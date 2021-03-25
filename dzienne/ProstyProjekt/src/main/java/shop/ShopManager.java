package shop;

import database.ShopDatabase;
import model.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private ShopDatabase db;
    private List<Product> cart;

    public ShopManager(ShopDatabase db){
        this.db=db;
        this.cart = new ArrayList<>();
    }

    public boolean addProductToCart(int productId){
        Product p = db.getProductById(productId);
        return cart.add(p);
    }

    public boolean addProductToCart(String productName){
        throw new NotImplementedException();
    }

    public boolean addProductToCart(Product product){
        throw new NotImplementedException();
    }

    public double costOfCart(){
        throw new NotImplementedException();
    }

    public boolean removeFromCart(Product product){
        throw new NotImplementedException();
    }

    public boolean removeFromCart(int productId){
        throw new NotImplementedException();
    }

    public boolean removeFromCart(String productName){
        throw new NotImplementedException();
    }

    public List<Product> showCart(){
        return this.cart;
    }

    public boolean clearCart(){
        throw new RuntimeException("Not implemented yet");
    }
}
