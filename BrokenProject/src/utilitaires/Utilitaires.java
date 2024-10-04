package utilitaires;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Groupe;

public class Utilitaires {

	public static int retourneunchiffre() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
			i = sc.nextInt();
		return i;
	}	
	
	public static char[] getStringFromUser() {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine();
		return s;
	}
	
	public static void printGroupes(HashMap<String, Groupe> mapToPrint) {
		for (Entry<String, Groupe> data : mapToPrint.entrySet()) {
			System.out.println(data);
		}
		
	}
}
