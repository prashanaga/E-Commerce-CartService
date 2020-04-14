/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.visitor;

public class CartTotalByQuantity implements ItemElement{

	private int price;
	private int quantity;
	
	public CartTotalByQuantity(int price, int quantity){
		this.price=price;
		this.quantity=quantity;
		
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	public int getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}

}

