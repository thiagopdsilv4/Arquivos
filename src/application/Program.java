package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {


		String[]lines = new String[] {"Good morning ", "Good afternoon", "Good night"};
		
		String path = "C:\\Users\\Thiag\\Documents\\javaa\\in.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){//adicionar o parametro true, indica que não quer recriar o arquivo mas sim adicionar o conteudo
			for(String line: lines) {
				bw.write(line);
				bw.newLine();//para dar quebra de linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

