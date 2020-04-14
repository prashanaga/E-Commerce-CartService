/**
 @author   Prashant, Tauseef, Tarun, Rainy
 @version  1.0
*/
package com.ecommerce.cartservice.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.cartservice.model.LineItemModel;

public class CartItemRowMapper implements RowMapper<LineItemModel>{
	    @Override
	    public LineItemModel mapRow(ResultSet rs, int rowNum) throws SQLException {

	        LineItemModel lineItemModel = new LineItemModel();
	        lineItemModel.setCartId(rs.getString("CART_ID"));
	        lineItemModel.setProductId(rs.getString("PRODUCT_ID"));
	        lineItemModel.setQuantity(rs.getInt("QUANTITY"));
	        lineItemModel.setWeight(rs.getFloat("WEIGHT"));

	        return lineItemModel;

	    }
}

