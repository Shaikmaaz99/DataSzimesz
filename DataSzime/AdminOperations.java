package DataSzime;

import java.util.Scanner;

public class AdminOperations {
	public static void addOptions() {
		Scanner sc=new Scanner(System.in);
		int option=0;
		System.out.println("Do You Want to Add More Options??");
		System.out.println("Press \n 1.Yes \n 2.No");
		option=sc.nextInt();
		switch(option) {
		case 1:System.out.println("Add The options like \n option1 \n option2 ");
		System.out.println("Enter the no.of options You want to add: ");
		int n=sc.nextInt();
		System.out.println("Enter the Options You want to Add: ");
		String[] food=new String[n];
		for(int i=0;i<n;i++) {
			food[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.println(food[i]+" ");
		}
		System.out.println("You Have Successfully Added");
		break;
		case 2: System.out.println("We are taking You to the Interface");
		break;
		}
	}

}
