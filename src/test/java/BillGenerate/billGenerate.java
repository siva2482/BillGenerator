package BillGenerate;

import java.util.Scanner;

import org.testng.annotations.Test;

public class billGenerate {
	static  double overage_fee;
	static double tax_amt;
	static  double total;
	static double amount;
	static int extratime;
	static double extrafee;
	static double taxall;
	static double billamt;
	
	public static double totalamt(double amt,double extra,double tax)
	{
		total=amt+extra+tax;
		return total;
	}
	public static double overageFee(int min)
	{
		overage_fee=min*0.25;
		return overage_fee;
	}
	public static double taxCal(double fee,double overage)
	{
		tax_amt=(fee+overage)*15/100;
		return tax_amt;
	}
	public static void printBill(double amt,double eamt,double tamt,double amtall)
	{
		System.out.println("YOUR BILL  IS:  ");
		System.out.println("PLAN FEE:  "+amt);
		System.out.println("EXTRA FEE:  "+eamt);
		System.out.println("TAX:  "+tamt);
		System.out.println("YOUR BILL AMOUNT IS:  "+ amtall);
		
	}
	
	
	@Test
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the plan fee:  ");
		amount=sc.nextDouble();
		System.out.println("Enter the overage minutes:  ");
		int extratime=sc.nextInt();
		extrafee=overageFee(extratime);
		taxall=taxCal(amount,extrafee);
		billamt=Math.floor(totalamt(extrafee,taxall,amount));
		printBill(amount,extrafee,taxall,billamt);
		
	}

}
