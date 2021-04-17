package cucumbe;

import database.ShopDatabase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Product;
import org.mockito.Mock;
import shop.ShopManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.never;

public class ShopManagerTest {

    @Mock
    ShopDatabase db;

    ShopManager testObject;

    @Given("I have an empty Cart")
    public void createEmptyCart(){
        db = mock(ShopDatabase.class);
        testObject= new ShopManager(db);
        Product p = new Product(1,"Doll","d.jpg",33.2);
        when(db.getProductById(1)).thenReturn(p);
    }

   @When("I add a new Product into a Cart")
   public void addSingleProductToCart(){
        testObject.addProductToCart(1);
   }

   @Then("I obtain Cart with lenght {int}")
   public void checkLenghtOfCart(int expectedSize){
        int size = testObject.showCart().size();
        assertEquals(expectedSize,size);
       verify(db,times(1)).getProductById(1);
       verify(db,never()).getProductsByName(anyString());
   }
}
