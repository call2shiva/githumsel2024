import java.util.Scanner;

public class PrintAlternateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the String:");
		Scanner scanner = new Scanner(System.in);
		String name=scanner.nextLine();


		int len = name.length();
		for(int i=0; i<=len-1;i++) {
			if(i%2==1) {
				System.out.print(name.charAt(i));		
			}

		}

	}

}
