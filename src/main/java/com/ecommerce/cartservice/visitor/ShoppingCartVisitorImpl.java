/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.visitor;

import org.springframework.stereotype.Service;

@Service
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public int visit(CartTotalByWeight byWeight) {
		int cost=0;
		cost=byWeight.getPrice()*byWeight.getWeight();
		
		return cost;
	}

	@Override
	public int visit(CartTotalByQuantity byQuantity) {
		int cost=0;
		cost=byQuantity.getPrice()*byQuantity.getQuantity();
		return cost;
	}

}

