package Assignment4;

public class Customer {
	
	String customerName;
	Address residentialAddress;
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", residentialAddress=" + residentialAddress + "]";
	}
	public Customer() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerdetails() {
		String str=customerName+","+residentialAddress;
		return str;
	}
}
