package DataSzime;

import java.util.Scanner;

public class User {
public void display() {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	int op=0;
	do {
	System.out.println("Which Season Data You want");
	System.out.println("\n 1.Summer \n 2.Monsoon   \n 3.Winter");
	choice=sc.nextInt();
	switch(choice) {
	case 1:System.out.println("Data You Have Choosen is Summer \n I will Provide You Data of Summer Season In India ");
	Summer summ=new Summer();
	summ.SummerDetails();
	break;
	case 2:System.out.println("Data You Have Choosen is Monsoon \n I will Provide You Data of Monsoon Season In India");
	Monsoon mon=new Monsoon();
	mon.MonsoonDetails();
	break;
	case 3:System.out.println("Data You Have Choosen is Winter \n I will Provide You Data of Winter Season In India");
	Winter win=new Winter();
	win.WinterDetails();
	break;
	}System.out.println("Do You want to continue as a User Press \n 1.Yes \n 2.No");
	op=sc.nextInt();
}while(op==1);
}
}
