import java.util.*;
public class WordGen {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("WordGen-Java based Wordlist maker");
		System.out.println("\t Version: 1.1.0");
		System.out.println();
		System.out.println("\t-----MENU-----");
		System.out.println("1. Keyword based list generator");
		System.out.println("2. Random password list generator");
		System.out.println("3. Numeric Password generator");
		System.out.println("4. Help Desk and About");
		System.out.println();
		System.out.print("Select the option based of ur choice:");
		int choice = in.nextInt();
		switch (choice) {
			case 1:
		System.out.println("Enter keyword related to victim");
		String a = in.next();
		System.out.println("Enter second keyword related to victim");
		String b = in.next();
		System.out.println("Enter third keyword related to victim");
		String c = in.next();
		System.out.println("Enter the number of special charater u wanna add: \t\t MAXIMUM 4");
		int snum = in.nextInt();
		switch (snum) {
			case 1:
		System.out.println("enter ur charater");
		String c1 = in.next();
		System.out.println("no. of passwords");
		int num = in.nextInt();
		for(int i = 1; i<=num;i++) {
		    int n1 = (int)(Math.random()*9)+1;
		    int n2 = (int)(Math.random()*9)+1;
		    int n3 = (int)(Math.random()*9)+1;
		    System.out.println(a+b+n1+n2+n3+c1);
		    System.out.println(b+c+n1+n2+n3+c1);
		    System.out.println(a+c+n1+n2+n3+c1);
		}
		break;

			case 2:
		System.out.println("enter first charater");
		String ch1= in.next();
		System.out.println("enter second character");
		String ch2 = in.next();
		System.out.println("Enter no. of passwords");
		int numb = in.nextInt();
		for (int i = 1; i<=numb;i++) {
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		int n3 = (int)(Math.random()*9)+1;
		System.out.println(a+b+n1+n2+n3+ch1+ch2);
		System.out.println(b+c+n1+n2+n3+ch1+ch2);
		System.out.println(a+c+n1+n2+n3+ch1+ch2);
		}
		break;

			case 3:
		System.out.println("Enter first character");
		String cha1 = in.next();
		System.out.println("Enter second character");
		String cha2 = in.next();
		System.out.println("Enter third character");
		String cha3 = in.next();
		System.out.println("Enter no. of passwords");
		int numbe = in.nextInt();
		for (int i = 1; i<=numbe;i++) {
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		int n3 = (int)(Math.random()*9)+1;
		System.out.println(a+b+n1+n2+n3+cha1+cha2+cha3);
		System.out.println(b+c+n1+n2+n3+cha1+cha2+cha3);
		System.out.println(a+c+n1+n2+n3+cha1+cha2+cha3);
		}
		break;

			case 4:
		System.out.println("Enter first character");
		String char1 = in.next();
		System.out.println("Enter second character");
		String char2 = in.next();
		System.out.println("Enter third character");
		String char3 = in.next();
		System.out.println("Enter forth character");
		String char4 = in.next();
		System.out.println("Enter no. of passwords");
		int number = in.nextInt();
		for (int i = 1; i<=number;i++) {
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		int n3 = (int)(Math.random()*9)+1;
		System.out.println(a+b+n1+n2+n3+char1+char2+char3+char4);
		System.out.println(b+c+n1+n2+n3+char1+char2+char3+char4);
		System.out.println(a+c+n1+n2+n3+char1+char2+char3+char4);
		break;
			}
		break;

		default:
		System.out.println("TYPO LED U HERE!");
		}
			break;

			case 2:
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
			case 3:
			System.out.println("===Welcome to Numeric Password Generator===");
			System.out.println();
			System.out.println("Enter the length of passwords\t\t [MINIMUM-8 \t MAXIMUM-12]");
			int length = in.nextInt();
			System.out.println("Enter the number of passwords required");
			long numopass = in.nextLong();
			
			if (length>7&&length<9) {
				for(int j=1;j<=numopass;j++) {
					int nu1= (int)(Math.random()*9)+1;
					int nu2= (int)(Math.random()*9)+1;
					int nu3= (int)(Math.random()*9)+1;
					int nu4= (int)(Math.random()*9)+1;
					int nu5= (int)(Math.random()*9)+1;
					int nu6= (int)(Math.random()*9)+1;
					int nu7= (int)(Math.random()*9)+1;
					int nu8= (int)(Math.random()*9)+1;
					String s1 = String.valueOf(nu1);
					String s2 = String.valueOf(nu2);
					String s3 = String.valueOf(nu3);
					String s4 = String.valueOf(nu4);
					String s5 = String.valueOf(nu5);
					String s6 = String.valueOf(nu6);
					String s7 = String.valueOf(nu7);
					String s8 = String.valueOf(nu8);
					System.out.println(s1+s2+s3+s4+s5+s6+s7+s8);
				}
			}
			
			else if (length>8&&length<10) {
				for(int l=1;l<=numopass;l++) {
					int nu1= (int)(Math.random()*9)+1;
					int nu2= (int)(Math.random()*9)+1;
					int nu3= (int)(Math.random()*9)+1;
					int nu4= (int)(Math.random()*9)+1;
					int nu5= (int)(Math.random()*9)+1;
					int nu6= (int)(Math.random()*9)+1;
					int nu7= (int)(Math.random()*9)+1;
					int nu8= (int)(Math.random()*9)+1;
					int nu9= (int)(Math.random()*9)+1;
					String s1 = String.valueOf(nu1);
					String s2 = String.valueOf(nu2);
					String s3 = String.valueOf(nu3);
					String s4 = String.valueOf(nu4);
					String s5 = String.valueOf(nu5);
					String s6 = String.valueOf(nu6);
					String s7 = String.valueOf(nu7);
					String s8 = String.valueOf(nu8);
					String s9 = String.valueOf(nu9);
					System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9);
				}
			}
			
			else if (length>9&&length<11) {
				for(int k=1;k<=numopass;k++) {
					int nu1= (int)(Math.random()*9)+1;
					int nu2= (int)(Math.random()*9)+1;
					int nu3= (int)(Math.random()*9)+1;
					int nu4= (int)(Math.random()*9)+1;
					int nu5= (int)(Math.random()*9)+1;
					int nu6= (int)(Math.random()*9)+1;
					int nu7= (int)(Math.random()*9)+1;
					int nu8= (int)(Math.random()*9)+1;
					int nu9= (int)(Math.random()*9)+1;
					int nu10= (int)(Math.random()*9)+1;
					String s1 = String.valueOf(nu1);
					String s2 = String.valueOf(nu2);
					String s3 = String.valueOf(nu3);
					String s4 = String.valueOf(nu4);
					String s5 = String.valueOf(nu5);
					String s6 = String.valueOf(nu6);
					String s7 = String.valueOf(nu7);
					String s8 = String.valueOf(nu8);
					String s9 = String.valueOf(nu9);
					String s10 = String.valueOf(nu10); //yes samsung galaxy s10 not odinary variable
					System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10);
				}
			}
			
			else if (length>10&&length<12) {
				for(int k=1;k<=numopass;k++) {
					int nu1= (int)(Math.random()*9)+1;
					int nu2= (int)(Math.random()*9)+1;
					int nu3= (int)(Math.random()*9)+1;
					int nu4= (int)(Math.random()*9)+1;
					int nu5= (int)(Math.random()*9)+1;
					int nu6= (int)(Math.random()*9)+1;
					int nu7= (int)(Math.random()*9)+1;
					int nu8= (int)(Math.random()*9)+1;
					int nu9= (int)(Math.random()*9)+1;
					int nu10= (int)(Math.random()*9)+1;
					int nu11= (int)(Math.random()*9)+1;
					String s1 = String.valueOf(nu1);
					String s2 = String.valueOf(nu2);
					String s3 = String.valueOf(nu3);
					String s4 = String.valueOf(nu4);
					String s5 = String.valueOf(nu5);
					String s6 = String.valueOf(nu6);
					String s7 = String.valueOf(nu7);
					String s8 = String.valueOf(nu8);
					String s9 = String.valueOf(nu9);
					String s10 = String.valueOf(nu10);
					String s11 = String.valueOf(nu11);
					System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11);
				}
			}
			
				else if (length>11&&length<13) {
					for(int k=1;k<=numopass;k++) {
					int nu1= (int)(Math.random()*9)+1;
					int nu2= (int)(Math.random()*9)+1;
					int nu3= (int)(Math.random()*9)+1;
					int nu4= (int)(Math.random()*9)+1;
					int nu5= (int)(Math.random()*9)+1;
					int nu6= (int)(Math.random()*9)+1;
					int nu7= (int)(Math.random()*9)+1;
					int nu8= (int)(Math.random()*9)+1;
					int nu9= (int)(Math.random()*9)+1;
					int nu10= (int)(Math.random()*9)+1;
					int nu11= (int)(Math.random()*9)+1;
					int nu12= (int)(Math.random()*9)+1;
					String s1 = String.valueOf(nu1);
					String s2 = String.valueOf(nu2);
					String s3 = String.valueOf(nu3);
					String s4 = String.valueOf(nu4);
					String s5 = String.valueOf(nu5);
					String s6 = String.valueOf(nu6);
					String s7 = String.valueOf(nu7);
					String s8 = String.valueOf(nu8);
					String s9 = String.valueOf(nu9);
					String s10 = String.valueOf(nu10);
					String s11 = String.valueOf(nu11);
					String s12 = String.valueOf(nu12);
					System.out.println(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12);
					}
				}
			else
			System.out.println("Error: Only 8,9,10,11,12 digits are supported!");
			
			break;
			case 4:
			System.out.println("About WordGen:");
			System.out.println();
			System.out.println("WordGen: A very basic java based open source wordlist generator.");
			System.out.println("WordGen is very new and this is first update of WordGen code and is not major but add some changes in code");
			System.out.println();
			System.out.println("Changes in this update:");
			System.out.println();
			System.out.println(" *simple and easy code.\n *numeric list.\n *more costumizable script.");
			System.out.println();
			System.out.println("I'm currently working on adding GUI to WordGen and also a Math-Solver so updates are slow.");
			System.out.println();
			System.out.println();
			System.out.println("Help Centre:");
			System.out.println();
			System.out.println("Step 1: Choose 1/2/3/4 from the menu to open the generator according to ur needs");
			System.out.println("Step 2: The selected option will run, and you have to fill questions according to you");
			System.out.println("Step 3: After the list is genereted, select list and copy the words");
			System.out.println("Step 4: Now paste it in a .txt file and save it. Now ur ready to HACK!");
			break;
			
     		default:
			System.out.println("WRONG CHOICE Don't be clumpsy next TIME!!");
		}
	}
}
