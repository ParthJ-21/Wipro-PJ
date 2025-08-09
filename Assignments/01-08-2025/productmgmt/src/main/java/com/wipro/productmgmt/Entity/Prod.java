package com.wipro.productmgmt.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="product_details")
public class Prod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="product_name")
	String ProductName;
	
	@Column(name="product_make")
	String ProductMake;
	
	@Column(name="product_price")
	double ProductPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductMake() {
		return ProductMake;
	}

	public void setProductMake(String productMake) {
		ProductMake = productMake;
	}

	public double getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Prod [id=" + id + ", ProductName=" + ProductName + ", ProductMake=" + ProductMake + ", ProductPrice="
				+ ProductPrice + "]";
	}
	
}
