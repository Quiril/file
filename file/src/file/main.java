package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		File file = new File("data/person.txt");

		try {
			
			FileWriter fiel = new FileWriter(file);
			Scanner in = new Scanner(System.in);
			String f1 = in.next();
			String f2 = in.next();
			String f3 = in.next();
			int f4 = in.nextInt();
			fiel.write(f1+" "+f2+" "+f3+" "+f4);
			fiel.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
		Scanner in = new Scanner(file);
		String f1 = in.next();
		String f2 = in.next();
		String f3 = in.next();
		int f4 = in.nextInt();
		System.out.println(f1+" "+f2+" "+f3+" "+f4);
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
		
	}

}
