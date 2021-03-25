package shop;

import database.ShopDatabase;
import model.Product;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class ShopManager {
    private ShopDatabase db;
    private List<Product> cart;

    public ShopManager(ShopDatabase db){
        this.db=db;
    }

    public boolean addProductToCart(int productId){
        throw new NotImplementedException();
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
        throw new NotImplementedException();
    }

    public boolean clearCart(){
        throw new NotImplementedException();
    }
}
