import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Stock {
	private static List<Produit> listeProduit;
	
	public Stock() throws IOException {
		if (listeProduit == null) {
			// Ne pas oublier de créer le tableau listeProduit
			listeProduit = new ArrayList<Produit>();
			
			// Lecture du fichier des villes
			String monFichier = "traitement-fichier\\open-food-facts.csv";
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
					Produit lProduit = new Produit(); 
					listeProduit.add(lProduit);
				}
			}
		}
		
	}
}
