import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class Zad1 {

	public static void main(String[] args) {		
		Random random = new Random();
		int target,i,choice;		
		String outOrNot = new String();
		Scanner scan = new Scanner(System.in);
		//Scanner scan1 = new Scanner(System.in);
	do{
		System.out.println("Masz za zadanie odgarn�� liczb� losow� wygenerowan� przez program.\nNa Twoje szcz�cie uzyskasz ma�e podpowiedzi.");
		target = random.nextInt(100);System.out.println(target);	
		choice = scan.nextInt();
		i = 0;
		do{
			if (choice<target)
				System.out.println("Musisz celowa� wy�ej");
			if (choice>target)
				System.out.println("Musisz celowa� ni�ej");
			if (choice!=target)
				choice = scan.nextInt();
			i++;
		}while(choice!=target);
		
		System.out.println("Brawo strza� w dziesi�tk�!");
		System.out.println("Dokona�e� "+i+" pr�b.");
		System.out.println("Czy chesz zagrac jeszcze raz?");
		scan.nextLine();
		outOrNot = scan.nextLine();
	
	}while(outOrNot.equalsIgnoreCase("tak") || outOrNot.equalsIgnoreCase("t"));
	scan.close();
	}
}
