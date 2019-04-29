/*

*/
import java.util.Scanner;
import java.io.*;

class Exercise17_14_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//display menu
		System.out.print("Menu: \n(1) Encrypt\n(2) Decrypt\nMenu Choice: ");
		int action = input.nextInt();
		input.nextLine();
		
		//Create input file
		System.out.print("Enter input file name: ");
		String file = input.nextLine();
		File inFile = new File(file);
		
		System.out.print("Enter Output file name: ");
		File outFile = new File(input.nextLine());
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile));
		){
			if (action == 1) {
				encrypt(in, out);
			}
			else if (action == 2) {
				decrypt(in, out);
			}
		}
		catch (IOException e) {
			System.out.println("You didnt enter 1 or 2 for menu. ");
		}
	}
	
	public static void encrypt(BufferedInputStream in, BufferedOutputStream out) {
		try {
			int value = in.read();
			while (value != -1) {
				out.write(value + 5);
				
				value = in.read();
			}
		}
		catch (IOException e) {
			System.out.println("Something went wrong...");
			
		}
	}
	public static void decrypt(BufferedInputStream in, BufferedOutputStream out) {
		try {
			int value = in.read();
			while (value != -1) {
				out.write(value - 5);
				
				value = in.read();
			}
		}
		catch (IOException e) {
			System.out.println("Something went wrong...");
			
		}
	}
	
}