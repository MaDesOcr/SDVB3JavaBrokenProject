package utilitaires;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Groupe;

public class Utilitaires {
	
	public static int getIntFromUser() {
		try {
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.err.println(e);
		}
		return 0;
	}	
	
	public static String getStringFromUser() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static void printGroupes(HashMap<String, Groupe> mapToPrint) {
		for (Entry<String, Groupe> data : mapToPrint.entrySet()) {
			System.out.println(data);
		}
		
	}
}
