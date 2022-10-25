import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Stock {
	private List<String> listeFichier;
	private ArrayList<Categorie>[] listeCategorie;
	private ArrayList<Marque> listeMarqueList;
	
	public void traiterFichier() throws IOException {
		
		// Ne pas oublier de créer le tableau listeProduit
		listeFichier = new ArrayList<String>();
		HashSet<String> setCat= new HashSet<String>();
		HashSet<String> setMarque= new HashSet<String>();
		
		
		// Lecture du fichier des villes
		String monFichier = "C:\\Users\\cmich\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\traitement-fichier\\open-food-facts.csv";
		Path chemin = Paths.get(monFichier);
		List<String> lignes = Files.readAllLines(chemin, StandardCharsets.UTF_8);
		// ne pas traiter la première ligne
		boolean first = true;
		
		
		for (String l: lignes) {
			String[] ligneDecoupee = l.split("|");
			if (first) {
				first = false;
			} else {
				// TODO inverser quand produit est créé 
				//recup-paramètres produit categorie0, marque1, nom2, nutritionGradeFr3, ingredients4, additifs29, allergenes28
				//Produit lProduit = new Produit(ligneDecoupee[0], ligneDecoupee[1], ligneDecoupee[2], ligneDecoupee[3],ligneDecoupee[4],ligneDecoupee[29],ligneDecoupee[28]);
				setCat.add(ligneDecoupee[0]);
				setMarque.add(ligneDecoupee[1]); 
				
				// Lignes du fichier a créé en fin de traitement
				listeFichier.add(l);
			}
		}
		// A partir des Hashset on a les catégories et les Marques
		// Avec liste fichier on a les lignes 
		// on peut donc générer les catégories
		int i = 0;
		for (String s1: setCat) {
			Categorie cat = new Categorie(s1);
			// Charger dans la listeCategorie
			
			i++;
		}
		// Une fois ici on reparcourt la la liste 
		
	}
}
