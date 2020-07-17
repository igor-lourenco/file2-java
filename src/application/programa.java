package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class programa {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Bom dia !!", "Boa Tarde !!", "Boa Noite!!"};
		
		String pacote = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pacote, true))){
			
			for(String l : linhas) {
				bw.write(l);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
