package DataSzime;

import java.util.Scanner;

public class Monsoon {
public void MonsoonDetails() {
	Scanner sc=new Scanner(System.in);
	int option=0;
	do {
		System.out.println("\n 1.Food \n 2.Tours&Travels \n 3.Fruits ");
		int choi=sc.nextInt();
	switch(choi) {
	case 1: System.out.println("Food In Monsoon,Because of Rainy Season most of the people preferr Hot Items Like: ");
			System.out.println(" \n 1.Samosas \n 2.Non-Veg Items \n 3.Soups ");
			System.out.println("Food Safety in Monsoon foods are traditional dishes that are typically consumed during the monsoon season");
			System.out.println("For More Info,Please Do Visit \n https://www.metropolisindia.com/blog/preventive-healthcare/monsoon-diet-what-to-eat-and-avoid-during-the-rainy-season");
			break;
	case 2: System.out.println("This Monsoons is  about Your Trips&Tours ");
	System.out.println("In India mostly Monsoon is in the Month of July To Sep \n Most of the people Like to travel to Goa,Puducherry,Alupuzha");
	System.out.println("For More,Info Do Visit \n https://www.kesari.in/monsoonoffer");
	break;
	case 3:System.out.println("litchi, jamun, plums, pomegranate ect,.");
	break;
	default:System.out.println("Choose The correct Data ");
	break;
	}
	System.out.println("Do You Want To Continue? \n Press \n 1.Yes \n 2.No");
	option=sc.nextInt();
	}while(option==1);
	System.out.println("Thank You For Using Data Szime");
}
}
