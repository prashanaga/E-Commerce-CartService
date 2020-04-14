/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.visitor;

public class CartTotalByWeight implements ItemElement{
	private int price;
	private int weight;
	
	public CartTotalByWeight(int price, int weight){
		this.price=price;
		this.weight=weight;
		
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
	public int getPrice() {
		return price;
	}


	public int getWeight() {
		return weight;
	}

}

