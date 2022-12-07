package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("GetName: " + path.getName());
		System.out.println("GetParent: " + path.getParent());//chama o nome do arquivo e o get name, o nome da pasta
		System.out.println("GetPath: " + path.getPath());
		sc.close();
	}
}

