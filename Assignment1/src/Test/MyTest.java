package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyTest {

	public static void main(String[] args) {
		File file = new File("./data/polyfor1.txt");
		try {
			Scanner in = new Scanner(file);
			
			int totalShapes = in.nextInt();
			System.out.println(totalShapes);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
