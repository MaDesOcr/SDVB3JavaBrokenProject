package model;

public class Groupe extends Entity{

	private String style;
	
	public Groupe(String name, String style) {
		super(name);
		this.style = "Truc";
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	
	
	
}
