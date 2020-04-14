/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.visitor;

public interface ShoppingCartVisitor {
	int visit(CartTotalByWeight byWeight);
	int visit(CartTotalByQuantity byQuantity);
}

