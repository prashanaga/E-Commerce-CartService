/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ecommerce.cartservice.model.LineItemModel;

import com.ecommerce.cartservice.rowMapper.CartItemRowMapper;

@Component
public class ShoppingCartDao {

	String QUERY_CART_PRODUCTS = "select * from CART_LINEITEM_MAPPING WHERE CART_ID=?";
	final String Query_GET_CART_ID = "select cart_id from cart_user_mapping where user_id=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<LineItemModel> getCartProducts(String cartId) {
		return jdbcTemplate.query(QUERY_CART_PRODUCTS, new Object[] { cartId }, new CartItemRowMapper());
	}

	public String getCartId(String userId) {

		return (String) jdbcTemplate.queryForObject(Query_GET_CART_ID, new Object[] { userId }, String.class);

	}

}
