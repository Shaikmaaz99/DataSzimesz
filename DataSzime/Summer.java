package DataSzime;
import java.util.*;
public class Summer {
public void SummerDetails() {
	Scanner sc=new Scanner(System.in);
	int option=0;
	do {
		System.out.println("\n 1.Food \n 2.Tours&Travels \n 3.Fruits ");
		int choice=sc.nextInt();
	switch(choice) {
	case 1: System.out.println("Food In Summer,Because of Temperature is Hot most of the people preferr Cool Items Like: ");
			System.out.println(" \n 1.Coconut Water \n 2.ButterMilk \n 3.Plenty Of water ");
			System.out.println("Food Safety in Summer Warm weather can lead to bacteria growth");
			System.out.println("For More Info,Please Do \n Visit https://www.optum.com/en/health-articles.html/healthy-living/15-summer-health-tips-feel-amazing-season");
			break;
	case 2: System.out.println("This Summer You will be Summerize about Your Trips&Tours ");
	System.out.println("In India mostly Summer is in March To June \n All mostly its better to Visit and Stay HillStations or Valleys During Summer like:\n 1.Ooty \n 2.Kodaikanal \n 3.Chickmangaloore \n 4.Munnar \n 5.Araku Valley");
	System.out.println("For More,Info Do Visit \n https://www.optum.com/en/health-articles.html/healthy-living/15-summer-health-tips-feel-amazing-season");
	break;
	case 3:System.out.println("Summer King is Mango!!Without Mango The Summer Season is incomplete");
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
