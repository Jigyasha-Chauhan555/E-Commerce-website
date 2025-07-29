package com.codeLine.ecommerce_website.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

		@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private double totalAmount;
		private String status; 
		private String address;
		private String orderDate;
		
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Order(Long id, double totalAmount, String status, String address, String orderDate) {
			super();
			this.id = id;
			this.totalAmount = totalAmount;
			this.status = status;
			this.address = address;
			this.orderDate = orderDate;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		@Override
		public int hashCode() {
			return Objects.hash(address, id, orderDate, status, totalAmount);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return Objects.equals(address, other.address) && Objects.equals(id, other.id)
					&& Objects.equals(orderDate, other.orderDate) && Objects.equals(status, other.status)
					&& Double.doubleToLongBits(totalAmount) == Double.doubleToLongBits(other.totalAmount);
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", totalAmount=" + totalAmount + ", status=" + status + ", address=" + address
					+ ", orderDate=" + orderDate + "]";
		}
		
		
}
