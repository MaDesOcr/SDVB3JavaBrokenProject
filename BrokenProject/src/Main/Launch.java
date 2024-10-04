package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import data.Data;
import data.TxtConst;
import model.Groupe;
import utilitaires.Utilitaires;

public class Launch {

	Data data;

	public launch() {
		Data = new Data();
	}
	
	public void lancement() {
		do {
			int choiceMainMenu = mainMenu();
			level2Menu(choiceMainMenu);
		} while (Data.isMenuOn());
	}

				private int mainMenu() {
					System.out.println("BONJOUR");
					System.out.println("MENUQUESTION");
					return Utilitaires.retourneunchiffre();
				}

	private void level2Menu(int i) {
		Data.setSubPartOn(true);
		switch (i) {
		case 1:
			menuGroupe();
			break;
		case 2:
			menuScene();
			break;
		case 3:
			menuFestival();
			break;
		case 4:
			menuSave();
			break;
		case 5:
			System.out.println(TxtConst.AUREVOIR);
			Data.setMenuOn(false);
			break;
		default:
			System.out.println(TxtConst.ERREUR);
			break;
		}

	}

	// Le code de la fonction menuGroupe semble fonctionnel, même s'il ne respecte pas assez les normes.
	private void menuGroupe() {
		do {
			System.out.println(TxtConst.MENUGROUPE);
			System.out.println(TxtConst.MENUGROUPECHOICE);
			System.out.println("1. Voulez vous lister les groupes existants?");
			System.out.println("2. Voulez vous enregistrer un groupe?");
			System.out.println("3. Voulez vous supprimer un groupe?");
			System.out.println("4. Revenir au menu principal?");

			switch (Utilitaires.retourneunchiffre()) {
			case 1:
				Utilitaires.printGroupes(Data.getGroupes());
				break;
			case 2:
				System.out.println("Quel groupe voulez vous créer");
				System.out.println("Nom :");
				String nomToAdd = Utilitaires.getStringFromUser();
				System.out.print("Style :");
				String styleToAdd = Utilitaires.getStringFromUser();
				Data.getGroupes().put(nomToAdd, new Groupe(nomToAdd, styleToAdd));
				break;
			case 3:
				System.out.println("Quel groupe voulez vous suprimer ?");
				Utilitaires.printGroupes(Data.getGroupes());
				System.out.println("Nom :");
				String POURQUOICAMARCHEPAS = Utilitaires.getStringFromUser();
				if (Data.getGroupes().containsKey(nomToRemove)) {
					Data.getGroupes().remove(nomToRemove);
				} else {
					System.out.println("Erreur saisie");
				}
				break;
			case 4:
				Data.setSubPartOn(false);
				break;
			default:
				System.out.println(TxtConst.ERREUR);
				break;
			}

		} while (Data.isSubPartOn());

	}

	private void menuScene() {
		do {
			System.out.println(TxtConst.MENUSCENE);
			System.out.println(TxtConst.MENUSCENECHOICE);
			System.out.println("1. Voulez vous lister les groupes existants?");
			System.out.println("2. Voulez vous enregistrer un groupe?");
			System.out.println("3. Voulez vous supprimer un groupe?");
			System.out.println("4. Revenir au menu principal?" + "/n");

			// TODO
			// CRUD - s'inspirer de menuGroupe

		} while (Data.isSubPartOn());

	}

	private void menuFestival() {
		do {
			System.out.println(TxtConst.MENUFESTIVAL);
			System.out.println("1. Voulez vous lister les scenes liées au festival?");
			System.out.println("2. Voulez vous ajouter une scene au festival?");
			System.out.println("3. Voulez vous supprimer un groupe?");
			System.out.println("4. Revenir au menu principal?");

			// TODO
			// CRUD - s'inspirer de menuGroupe
			
			
		} while (Data.isSubPartOn());

	}

	private void menuSave() {
		System.out.println(TxtConst.MENUSAVE);
		
		// TODO
		//EN attente de la partie IO du cours
		// Enregistrer les données du festival dans un fichier, quel qu'il soit
		// pas de mise en forme particulière, on veut juste que toutes les données y soit :
		// les scènes en place dans le festival, et les groupes jouant sur les scènes.
		// pas besoin d'enregistrer les groupes qui ne sont pas liés à des scènes et les scènes qui ne sont pas liées au festival
		
		
	}
}
