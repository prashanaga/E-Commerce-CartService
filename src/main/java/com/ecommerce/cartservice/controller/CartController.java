/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.controller;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.cartservice.serviceImpl.CartServiceImpl;
@RestController
@RequestMapping(value = "/cart-microservice")
public class CartController {

	@Autowired
	CartServiceImpl shoppingCart;

	/*@RequestMapping(method = RequestMethod.GET, value = "/shoppingCart/addProduct", produces = "application/json")
	public String addProductToCart(@RequestParam("userid") String userId, @RequestParam("asin") String asin) {
		shoppingCart.addProductToShoppingCart(userId, asin);
		return String.format("Added to Cart");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/shoppingCart/productsInCart", produces = "application/json")
	public Map<String, Integer> getProductsInCart(@RequestParam("userid") String userId) {
		return shoppingCart.getProductsInCart(userId);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/shoppingCart/removeProduct", produces = "application/json")
	public String removeProductFromCart(@RequestParam("userid") String userId, @RequestParam("asin") String asin) {
		shoppingCart.removeProductFromCart(userId, asin);
		return String.format("Removing from Cart");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/shoppingCart/clearCart", produces = "application/json")
	public String clearCart(@RequestParam("userid") String userId) {
		shoppingCart.clearCart(userId);
		return String.format("Clearing Cart, Checkout successful");
	}*/
	@RequestMapping(method = RequestMethod.GET, value = "/shoppingCart/getCartTotal/{userid}", produces = "application/json")
	public int cartTotal(@PathVariable("userid") String userId) {
		int total=shoppingCart.getCartTotal(userId);
		System.out.println(total);
		return total;
	}
}
