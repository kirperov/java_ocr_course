package ej;

public class Block {
	
	private String longeur;
	private String largeur;
	private String hauteur;
	
	public Block(final String longeur, final String largeur, final String hauteur) {
		this.longeur = longeur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	
	public String getLongeur() {
		return this.longeur;
	}
	
	public String getLargeur() {
		return this.largeur;
	}
	
	public String getHauteur() {
		return this.hauteur;
	}
}
