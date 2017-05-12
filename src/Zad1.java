import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class Zad1 {

	public static void main(String[] args) {		
		Random random = new Random();
		int target,i,choice;		
		String outOrNot = new String();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Masz za zadanie odgarnąć liczbę losowo wygenerowaną przez program.\n"
					+ "Na Twoje szczęście uzyskasz małe podpowiedzi.");
			target = random.nextInt(100);
			//System.out.println(target);	
			choice = scan.nextInt();
			i = 0;
			do{
				if (choice<target)
					System.out.println("Musisz celować wyżej");
				if (choice>target)
					System.out.println("Musisz celować niżej");
				if (choice!=target)
					choice = scan.nextInt();
				i++;
			}while(choice!=target);
			
			System.out.println("Brawo strzał w dziesiątkę!");
			System.out.println("Dokonałeś "+i+" prób.");
			System.out.println("Czy chesz zagrac jeszcze raz?");
			scan.nextLine();
			outOrNot = scan.nextLine();
	
		}while(outOrNot.equalsIgnoreCase("tak") || outOrNot.equalsIgnoreCase("t"));
		scan.close();
	}
}
