package com.codeLine.ecommerce_website.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private double price;
	    private double discount;
	    private String imageUrl;
	    private int stockQuantity;
	    private String category;  // saree, suit, tshirt
	    
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(Long id, String name, String description, double price, double discount, String imageUrl,
				int stockQuantity, String category) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.discount = discount;
			this.imageUrl = imageUrl;
			this.stockQuantity = stockQuantity;
			this.category = category;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getDiscount() {
			return discount;
		}

		public void setDiscount(double discount) {
			this.discount = discount;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public int getStockQuantity() {
			return stockQuantity;
		}

		public void setStockQuantity(int stockQuantity) {
			this.stockQuantity = stockQuantity;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public int hashCode() {
			return Objects.hash(category, description, discount, id, imageUrl, name, price, stockQuantity);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(category, other.category) && Objects.equals(description, other.description)
					&& Double.doubleToLongBits(discount) == Double.doubleToLongBits(other.discount)
					&& Objects.equals(id, other.id) && Objects.equals(imageUrl, other.imageUrl)
					&& Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& stockQuantity == other.stockQuantity;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
					+ ", discount=" + discount + ", imageUrl=" + imageUrl + ", stockQuantity=" + stockQuantity
					+ ", category=" + category + "]";
		}

		
	    
}
