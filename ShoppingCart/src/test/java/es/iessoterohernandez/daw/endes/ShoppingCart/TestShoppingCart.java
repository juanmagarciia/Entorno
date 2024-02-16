package es.iessoterohernandez.daw.endes.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestShoppingCart 
   
{
	private ShoppingCart ShoppingCart;
	private Product Product;

    @BeforeEach
    void iniciar() {
    	ShoppingCart = new ShoppingCart();
    	Product=new Product("cacahuetes",23.4);
    	
    }

    @AfterEach
    void finalizar() {
    	ShoppingCart = null;
    	Product = null;
    }
    @Test
    void testCrea0elementos() {
        assertEquals(0, ShoppingCart.getItemCount());
    }

    @Test
    void testAñade() {
    	ShoppingCart.addItem(Product);
        assertEquals(1, ShoppingCart.getItemCount());
    }
    

    @Test
    void testVacio() {
    	ShoppingCart.empty();
        assertEquals(0, ShoppingCart.getItemCount());
    }
    
    @Test
    void testBalanceItem() {
    	double beforePrice=ShoppingCart.getBalance();
    	ShoppingCart.addItem(Product);
    	double afterPrice=ShoppingCart.getBalance();
    	assertEquals(beforePrice,Product.getPrice()+beforePrice);
    }
    
    @Test
    void testEliminaDecrementa() throws ProductNotFoundException {
    	ShoppingCart.addItem(Product);
        ShoppingCart.removeItem(Product);
        assertEquals(0, ShoppingCart.getItemCount());
    }
    
    @Test
    void testEliminaExcepcion() {
    	try {
    		ShoppingCart.removeItem(Product);
    		fail(" expected ProductNotFoundException ");
    	}catch (ProductNotFoundException e) {
    		
    	}
    	
    }




	
}
