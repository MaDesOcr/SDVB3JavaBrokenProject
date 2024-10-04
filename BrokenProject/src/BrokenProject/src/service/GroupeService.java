package service;

import java.util.ArrayList;
import java.util.HashMap;

import data.Data;
import model.Groupe;

public class GroupeService {
	
	Data d = new Data();
	
	public HashMap<String, Groupe> getAllGroupes(){
		return d.getGroupes();
	}

	public void saveGroupe(Groupe groupe) {
		d.getGroupes().put(groupe.getName(), groupe);
	}
	
	public Groupe getGroupeByName(String name) {
		return d.getGroupes().get(name);
	}
	
	public void deleteGroupe(Groupe g) {
		d.getGroupes().remove(g);
	}
	
	public void deleteGroupeByName(String nameToDelete) {
		Groupe groupeToRemove = getGroupeByName(nameToDelete);
		if(groupeToRemove!=null) {
			deleteGroupe(groupeToRemove);
			
		}
	}
	
}
