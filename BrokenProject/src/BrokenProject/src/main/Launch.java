package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import data.Data;
import data.TxtConst;
import model.Groupe;
import service.GroupeService;
import utilitaires.Utilitaires;

public class Launch {

	Data data;
	
	GroupeService groupeService = new GroupeService();

	public Launch() {
		data = new Data();
	}

	public void lancement() {
		do {
			int choiceMainMenu = mainMenu();
			level2Menu(choiceMainMenu);
		} while (data.isMenuOn());
	}

	private int mainMenu() {
		System.out.println("BONJOUR");
		System.out.println("MENUQUESTION");
		return Utilitaires.getIntFromUser();
	}

	private void level2Menu(int i) {
		data.setSubmenuon(true);
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
			data.setMenuOn(false);
			break;
		default:
			System.out.println(TxtConst.ERREUR);
			break;
		}

	}

	// Le code de la fonction menuGroupe semble fonctionnel, même s'il ne respecte
	// pas assez les normes.
	private void menuGroupe() {
		do {
			System.out.println(TxtConst.MENUGROUPE);
			System.out.println(TxtConst.MENUGROUPECHOICE);
			System.out.println("1. Voulez vous lister les groupes existants?");
			System.out.println("2. Voulez vous enregistrer un groupe?");
			System.out.println("3. Voulez vous supprimer un groupe?");
			System.out.println("4. Revenir au menu principal?");

			switch (Utilitaires.getIntFromUser()) {
			case 1:
				Utilitaires.printGroupes(data.getGroupes());
				break;
			case 2:
				System.out.println("Quel groupe voulez vous créer");
				System.out.println("Nom :");
				String nomToAdd = Utilitaires.getStringFromUser();
				System.out.print("Style :");
				String styleToAdd = Utilitaires.getStringFromUser();
				groupeService.saveGroupe(new Groupe(nomToAdd, styleToAdd));
				break;
			case 3:
				System.out.println("Quel groupe voulez vous suprimer ?");
				Utilitaires.printGroupes(groupeService.getAllGroupes());
				System.out.println("Nom :");
				String nomToRemove = Utilitaires.getStringFromUser();
				groupeService.deleteGroupeByName(nomToRemove);
				break;
			case 4:
				data.setSubmenuon(false);
				break;
			default:
				System.out.println(TxtConst.ERREUR);
				break;
			}

		} while (data.isSubMenuOn());

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

		} while (data.isSubMenuOn());

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

		} while (data.isSubMenuOn());

	}

	private void menuSave() {
		System.out.println(TxtConst.MENUSAVE);

		// TODO
		// EN attente de la partie IO du cours
		// Enregistrer les données du festival dans un fichier, quel qu'il soit
		// pas de mise en forme particulière, on veut juste que toutes les données y
		// soit :
		// les scènes en place dans le festival, et les groupes jouant sur les scènes.
		// pas besoin d'enregistrer les groupes qui ne sont pas liés à des scènes et les
		// scènes qui ne sont pas liées au festival

	}
}
