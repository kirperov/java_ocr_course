package ej;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String helloWorld = "Hello World";
		System.out.println("Bonjour "+ bonjour("Kirill"));
	    List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
	    for (String nomDUnLangage : nomsDesLangages) {
	        System.out.println(nomDUnLangage);
	    }
	    
	    int[] tableau = {10, 100, 50, 22, 1080, 27000, 0};
		int cpt = 0;
		for(int i=0; i<7; i++) {
			if(tableau[i] == 0) {
				cpt++;
			}
		}
		System.out.println(cpt);
        System.out.println(categorieDeFilm("Star Wars"));
        Main.commenteLaMeteo("nuage");
	}
	
	public static String bonjour(String name) {
	    return name;
	}
	
	public static void commenteLaMeteo(final String meteo) {
	    switch (meteo) {
        	case "soleil" -> System.out.println("Beau temps");
	        case "nuage" -> System.out.println("Couvert");
	        case "pluie" -> System.out.println("Mauvais temps");
	        default -> System.out.println("Je ne sais pas.");
	    }
	}
	
	public static String categorieDeFilm(final String film) {
	    var resultat = switch (film) {
	        case "Star Wars" -> "Science fiction";
	        case "Blanche neige", "La petite sirène" -> "Disney";
	        case "Indiana Jones" -> {
	            String categorie = "Aventure";
	            yield categorie;
	        }
	        default -> "Inconnu";
	    };
	    return resultat;
	}

	
	
	
}