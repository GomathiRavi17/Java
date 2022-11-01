import java.util.Scanner;

public class incomeTaxCal {

	public static void main(String[] args) {
		int tax=0;
		 
		 
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your CTC:");
		 int ctc = sc.nextInt();

		 
		 if(ctc > 0 && ctc <=180000) {
			 System.out.println("Not Eligible for Paying Tax");
		 }
		 else if(ctc>=181001 && ctc<=300000) {
			 tax = (ctc*10)/100;
			 System.out.println("Tax Payable: "+tax);
		 }
		 else if(ctc>=300001 && ctc<=500000) {
			 tax = (ctc*20)/100;
			 System.out.println("Tax Payable: "+tax);
		 }
		 else if(ctc>=500001 && ctc<=1000000) {
			 tax = (ctc*30)/100;
			 System.out.println("Tax Payable: "+tax);
		 }
		 
		 sc.close();

	}

}
