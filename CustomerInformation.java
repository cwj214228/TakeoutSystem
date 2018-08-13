package model;

/**
 * 
 * @author Administrator
 * CustomerInformation: customerName, customerId, customerHeadportrait,
 * 						customerPhone, customerAddress, customerMoney, 
 * 						customerRedenvelope
 */

public class CustomerInformation {
	
	protected String customerName;
	protected String customerId;
	protected String custormerHeadportrait;
	protected int customerPhone;
	protected String customerAddress;
	protected float customerMoney;
	protected int customerRedenvelope;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustormerHeadportrait() {
		return custormerHeadportrait;
	}
	public void setCustormerHeadportrait(String custormerHeadportrait) {
		this.custormerHeadportrait = custormerHeadportrait;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public float getCustomerMoney() {
		return customerMoney;
	}
	public void setCustomerMoney(float customerMoney) {
		this.customerMoney = customerMoney;
	}
	public int getCustomerRedenvelope() {
		return customerRedenvelope;
	}
	public void setCustomerRedenvelope(int customerRedenvelope) {
		this.customerRedenvelope = customerRedenvelope;
	}
	
	
}
