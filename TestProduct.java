package Assignment3;
import java.util.*;
public class TestProduct {

	public static void main(String[] args)
	{
		Product prod=new Product("Laptop",75000.00,'K');
		System.out.println(" Product Code : "+prod.getProductCode());
		System.out.println(" Name : "+prod.getProductName());
		System.out.println(" Price : "+prod.getProductPrice());
		System.out.println(" Category : "+prod.getCategoryCode());
		
		Product prod2=new Product("Mobile",33000.00);
		System.out.println(" Product Code : "+prod2.getProductCode());
		System.out.println(" Name : "+prod2.getProductName());
		System.out.println(" Price : "+prod2.getProductPrice());
		System.out.println(" Category : "+prod2.getCategoryCode());
	}
}
