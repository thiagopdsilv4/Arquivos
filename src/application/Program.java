package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\Thiag\\Documents\\javaa\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();// esquema básico de ler arquivo com bufferedreader
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

/*
 * 
 * File file = new File("C:\\Users\\Thiag\\Documents\\javaa\\in.txt"); Scanner
 * sc = null;//apenas para ter algum valor
 * 
 * try { sc = new Scanner(file); while(sc.hasNextLine()) {
 * System.out.println(sc.nextLine()); } } catch(IOException e){
 * System.out.println("Error: " + e.getMessage()); } finally { if(sc != null) {
 * sc.close(); }
 */