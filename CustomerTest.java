package Assignment4;
import java.util.Scanner;
public class CustomerTest {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		Customer cust=new Customer();
		Address add=new Address("Ist Main HSR Layout", "Bangalore");
		cust.setCustomerName("John");
		cust.setResidentialAddress(add);
		System.out.println(cust.getCustomerdetails());
		sc.close();
			}
         
}
