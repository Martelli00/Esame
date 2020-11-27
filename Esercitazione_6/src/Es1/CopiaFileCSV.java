package Es1;
import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class CopiaFileCSV {

	public static void main(String[] args) {
		
		//input.useDelimiter(",");
		Vector<String> vett1 = new Vector<String>(4);
		
		try {
			
			String next;
			
			Scanner lettore = 
					new Scanner(new BufferedReader(new FileReader("File.csv")));
			
			while(lettore.hasNext()) { //il while va avanti finche non finisce il file
				
				next = lettore.nextLine();
				String vettore[] = next.split(","); //toglie le virgole e mette le parole nei singoli spazi del vettore
				
				for(int i=0; i < vettore.length; i++) {
					
					System.out.print(vettore[i] + " ");
					
				}
				
				System.out.println("\n");
			}
			
			lettore.close();
			
		}
		catch(IOException e) {
			
			System.out.println("Errore di I/O");
			System.out.println(e);
			
		}
		
	}

}
