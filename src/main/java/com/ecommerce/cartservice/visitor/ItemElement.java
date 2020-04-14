/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

