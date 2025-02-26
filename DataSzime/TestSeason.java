package DataSzime;
import java.util.*;
public class TestSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi...Iam Your Data Szime \n I will be Handling Soo Many Datas For You \n Use Me As You Can");
		System.out.println("Hey I Came For You To make Your Life Make Tasty And Joyfull");
		int ch=0;
		int option=0;
		do {
			System.out.println("Do you want to login as Admin Or User");
			System.out.println("\n 1.Admin \n 2.User");
			option=sc.nextInt();
			switch(option) {
			case 1:System.out.println("You Have Choosen Admin as Login");
			System.out.println("Enter the UserName: ");
			String Name=sc.next();
			System.out.println("Enter the Password: ");
			String password=sc.next();
			Admin admin=new Admin(Name,password);
			AdminOperations.addOptions();
			break;
			case 2:System.out.println("You Have Choosen User as Login");
			User user=new User();
			user.display();
			break;
			}
		System.out.println("Do you want to continue In Dataszimesz Press \n 1.Yes \n 2.No");
		ch=sc.nextInt();
	}while(ch==1);
		System.out.println("Thank You For Using Data Szime \n We are Stepping Ahead For Your Requirement");
		System.out.println("Data Szime is Updating Many Things \n We will Reach You Soo SOON!!!");
		System.out.println("Have A Data Day!!! ");
	}

}
