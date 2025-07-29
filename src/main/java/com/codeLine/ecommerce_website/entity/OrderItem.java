package com.codeLine.ecommerce_website.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private int quantity;
	    private double price;
	    
		public OrderItem() {
			super();
			// TODO Auto-generated constructor stub
		}

		public OrderItem(Long id, int quantity, double price) {
			super();
			this.id = id;
			this.quantity = quantity;
			this.price = price;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, price, quantity);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OrderItem other = (OrderItem) obj;
			return Objects.equals(id, other.id)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& quantity == other.quantity;
		}

		@Override
		public String toString() {
			return "OrderItem [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
		}
	    
	    
}
