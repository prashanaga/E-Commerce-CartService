/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.cartservice.dao.ShoppingCartDao;
import com.ecommerce.cartservice.model.CartModel;
import com.ecommerce.cartservice.model.LineItemModel;
import com.ecommerce.cartservice.service.CartService;
import com.ecommerce.cartservice.visitor.ItemElement;
import com.ecommerce.cartservice.visitor.ShoppingCartVisitor;
import com.ecommerce.cartservice.visitor.ShoppingCartVisitorImpl;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	ShoppingCartDao shoppingCartDao;
	
	public void addProductToShoppingCart(String userId, String asin)
	{
		
	}
	public Map<String, Integer> getProductsInCart(String userId) {
		Map<String, Integer> productsInCartAsin = new HashMap<String, Integer>();
		return productsInCartAsin;
	}
	public void removeProductFromCart(String userId, String asin) {
		CartModel currentShoppingCart = new CartModel();
		
	}
	
	public void clearCart(String userId) {
		
		
	}
	public  int getCartTotal(String userId) {
		/*ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};*/
		
		String cartId=shoppingCartDao.getCartId(userId);
		
		List<LineItemModel> listLineItem=shoppingCartDao.getCartProducts(cartId);
		
		for (LineItemModel item : listLineItem)  
        { 
           
        } 
		
		int total = calculatePrice(items);
		return total;
	}
	
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum=0;
		for(ItemElement item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}

