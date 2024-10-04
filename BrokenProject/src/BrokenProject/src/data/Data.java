package data;

import java.util.ArrayList;
import java.util.HashMap;

import model.Festival;
import model.Groupe;
import model.Scene;

public class Data {

	private boolean MenuOn = true;

	private boolean subMenuOn;
	
	private Festival festival = new Festival("DeathMetal et Accordéon");
	private HashMap<String, Scene> scenes = new HashMap<String, Scene>();
	private HashMap<String, Groupe> groupes = new HashMap<String, Groupe>();
	
	
	public boolean isMenuOn() {
		return MenuOn;
	}
	public void setMenuOn(boolean menuOn) {
		MenuOn = menuOn;
	}
	public boolean isSubMenuOn() {
		return subMenuOn;
	}
	public void setSubmenuon(boolean submenuon) {
		this.subMenuOn = submenuon;
	}
	public Festival getFestival() {
		return festival;
	}
	public void setFestival(Festival festival) {
		this.festival = festival;
	}
	public HashMap<String, Scene> getScenes() {
		return scenes;
	}
	public void setScenes(HashMap<String, Scene> scenes) {
		this.scenes = scenes;
	}
	public HashMap<String, Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(HashMap<String, Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
	

}
