import java.util.*;
public class WordGen {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("\t ===========WELCOME TO WORDGEN===========");
		System.out.println("1. Create a wordlist \t\t\t 2. About this version");
		System.out.println("3. How to create a wordlist \t\t 4. Generate Random wordlist");
		int choice = in.nextInt();
		switch (choice) {
			case 1:
			System.out.println("Welcome to wordlist creator!!");
			System.out.println("Enter one keyword about the victim:");
			String keyword = in.next();
			System.out.println("Enter second keyword:");
			String keyword2 = in.next();
			System.out.println("Enter third keyword:");
			String keyword3 = in.next();
			System.out.println("Enter the number of words needed");
			int num = in.nextInt();
			for (int i = 1;i<= num;i++) {
			int rn = (int)(Math.random()*9)+1;
			int simp= (int)(Math.random()*6)+1;
		    char simba= (char) (simp+57);
            System.out.print(keyword);
            System.out.print(rn);
            System.out.print(rn-3);
            System.out.print(simba);
			System.out.println();
			System.out.print(keyword2);
            System.out.print(rn);
            System.out.print(rn-3);
            System.out.print(simba);
			System.out.println(); 
			System.out.print(keyword3);
            System.out.print(rn);
            System.out.print(rn-3);
            System.out.print(simba);
			System.out.println();
		}
		System.out.println();
			break;
			
			case 2:
			System.out.println("This is WoedGen V1.0.1. It is an open source Command line bases password wordlist generator.");
			System.out.println("The WordGen is pretty much like any other wordlist generator, but this Wordlist Generator targets more in keyword based wordlist.");
			System.out.println("Future Plans: Add more types of wordlist making prcocess and make a GUI");
			
			break;
			
			case 3:
			System.out.println(" STEP 1. Click 1 and start the process");
			System.out.println(" STEP 2. Enter 3 diffrent keywords related to your victim");
			System.out.println(" STEP 3. Enter the number of times each keyword would be used");
			System.out.println("STEP 4. Copy the wordlist into a text file and use it in ur brute force attacks");
			
			break;
			
			case 4:
			System.out.println("Enter the  number of random password required");
			int rannum =  in.nextInt();
		for (int ran=1;ran<=rannum;ran++) {
			
			for (int x=1;x<=3;x++) {
				int n= (int)(Math.random()*26)+1;
			    char chl= (char)(n+64);
                int numb= (int)(Math.random()*9)+1;
                int chacha= (int)(Math.random()*26)+1;
                char chs= (char)(chacha+96);
                int simp= (int)(Math.random()*6)+1;
                char symbol= (char)(simp+57);
                System.out.print(chl);
                System.out.print(numb);
                System.out.print(chs);
                System.out.print(symbol);
            }
            System.out.println();
		}
		break;
		
     		default:
			System.out.println("WRONG CHOICE ASSHOLE");
	}
	}
}
