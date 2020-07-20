package Assignment3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account info=new Account();
		   System.out.println("Enter the Acc.No.: ");
		   Scanner sc= new Scanner(System.in);
		   long accNo=sc.nextLong();
		   info.setAccountNo(accNo);
		   System.out.println("Enter the Balance:");
		   double bal=sc.nextDouble();
		   info.setBalance(bal);
		   System.out.println("Enter the Deposite:");
		   double dep=sc.nextDouble();
		   info.setDeposit(dep);
		   System.out.println("Enter Ammount to be withdrawn:");
		   double witd=sc.nextDouble();
		   info.withdraw(witd);
		   System.out.println("Remaining Balance:"+info.getBalance());
		   sc.close();

	}

}
