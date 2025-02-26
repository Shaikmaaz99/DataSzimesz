package DataSzime;

import java.util.Scanner;

public class Winter {
	public void WinterDetails() {
	Scanner sc=new Scanner(System.in);
	int option=0;
	do {
		System.out.println("\n 1.Food \n 2.Tours&Travels \n 3.Fruits ");
		int choi=sc.nextInt();
	switch(choi) {
	case 1: System.out.println("Food In Winter,Because of Winter Season Warm and comforting dishes \n Spicy and flavorful curries \n Warm and sweet desserts ");
			System.out.println("For More Info,Please Do Visit \n https://mealawe.com/winter-food-in-india/?srsltid=AfmBOoq-v65zfuSGp4Mnoh1I19Vtp0wuz-de5WGzCaEqizRj3WRfgU_R");
			break;
	case 2: System.out.println("This Winter Makes Your Life as Wonder");
	System.out.println("In India mostly Winter Makes More Happy.. is in the Month of November To February \n Most of the people Like to travel to Manali,Leh,Coorg etc.");
	System.out.println("For More,Info Do Visit \n https://www.kesari.in/monsoonoffer");
	break;
	case 3:System.out.println("Fruits In Winter: \n Oranges \n Apples \n Chikko etc.,");
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
