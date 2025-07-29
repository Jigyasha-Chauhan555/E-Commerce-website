package com.codeLine.ecommerce_website.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String paymentMethod; // e.g., "Credit Card", "UPI"
    private String status;     
    private String transactionId;
    private String paymentDate;
    
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Long id, String paymentMethod, String status, String transactionId, String paymentDate) {
		super();
		this.id = id;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.transactionId = transactionId;
		this.paymentDate = paymentDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, paymentDate, paymentMethod, status, transactionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id) && Objects.equals(paymentDate, other.paymentDate)
				&& Objects.equals(paymentMethod, other.paymentMethod) && Objects.equals(status, other.status)
				&& Objects.equals(transactionId, other.transactionId);
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentMethod=" + paymentMethod + ", status=" + status + ", transactionId="
				+ transactionId + ", paymentDate=" + paymentDate + "]";
	}
    
    
}
