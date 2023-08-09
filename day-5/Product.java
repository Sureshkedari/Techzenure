package com.techzenure.java.oops;

public class Product {
	private long productId;
	private String productName;
	private float productPrice;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		//return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice+ "]";
		return String.format("PRODUCT [ %-5d | %-20s | %.2f ]", productId, productName, productPrice);
	}
	
}
