
public class marks {

	public static void main(String[] args) {
		int s1=55,s2=40,s3=47;
		
		if(s1>60 && s2>60 && s3>60) {
			System.out.println("Passed");
		}
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60) {
			System.out.println("Promoted");
		}
		else if(s1>60 || s2>60 || s3>60 || s1<60 && s2<60 && s3<60) {
			System.out.println("Failed");
		}
		

	}

}
