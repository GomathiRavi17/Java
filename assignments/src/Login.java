import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		int flag = 0;

		Scanner sc = new Scanner(System.in);

		int i = 0;

		while (i < 3) {

			System.out.println("Enter the Username: ");

			String user = sc.nextLine();

			System.out.println("Enter the Password: ");

			String pass = sc.nextLine();

			if (user.equals("admin") && pass.equals("12345")) {

				System.out.println("log in successfully");

				System.out.println("Welcome....!!! \t " + user);

				flag = 1;

				break;

			}
			System.out.println("plz try again");

			i++;
		}

		if (flag == 0)

		{
			System.out.println("plz contact admin");

		}
		sc.close();
	}
}