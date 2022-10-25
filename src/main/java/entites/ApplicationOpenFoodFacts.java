package entites;
import java.util.Scanner;

import AfficherAddictifProduit;
import AfficherAllergeneProduit;
import OpenFoodFacts;
import OpenFoodFactsUtils;
import RechercheMeilleurCategorie;
import RechercheMeilleurMarque;
import RechercheMeilleurMarqueCategorie;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String filePath = ClassLoader.getSystemClassLoader().getResource("open-food-facts.csv").getFile();
		OpenFoodFacts openFoodFacts = OpenFoodFactsUtils.lire(filePath);

		if (openFoodFacts == null) {
			System.out.println("L'application doit s'arrétée en raison d'une erreur d'exécution.");
			System.exit(-1);
		}
		
		int choix = 0;
		do {

			afficherMenu();
			String choixMenu = scanner.nextLine();

			choix = Integer.parseInt(choixMenu);

			switch (choix) {
			case 1:
				RechercheMeilleurMarque rechercheMeilleurMarque = new RechercheMeilleurMarque();
				rechercheMeilleurMarque.traiter(openFoodFacts, scanner);
				break;
			case 2:
				RechercheMeilleurCategorie rechercheMeilleurCategorie = new RechercheMeilleurCategorie();
				rechercheMeilleurCategorie.traiter(openFoodFacts, scanner);
				break;
			case 3:
				RechercheMeilleurMarqueCategorie rechercheMeilleurMarqueCategorie = new RechercheMeilleurMarqueCategorie();
				rechercheMeilleurMarqueCategorie.traiter(openFoodFacts, scanner);
				break;
			case 4:
				AfficherAllergeneProduit afficherAllergeneProduit = new RecherchePopulationBorneService();
				afficherAllergeneProduit.traiter(openFoodFacts, scanner);
				break;
			case 5:
				AfficherAddictifProduit afficherAddictifProduit = new AfficherAddictifProduit();
				afficherAddictifProduit.traiter(openFoodFacts, scanner);
				break;
			}

		} while (choix != 0);

		scanner.close();

	}
	
	private static void afficherMenu() {
		System.out.println("---------- ApplicationOpenFoodFacts ----------");
		System.out.println("1. Rechercher les meilleurs produits pour une Marque donnée.");
		System.out.println("2. Rechercher les meilleurs produits pour une Catégorie donnée.");
		System.out.println("3. Rechercher les meilleurs produits par Marque et par Catégorie.");
		System.out.println("4. Afficher les allergènes les plus courants et le nombre de produit ou ils apparaissent.");
		System.out.println("5. Afficher les additifs les plus courants et le nombre de produit ou ils apparaissent.");
		System.out.println("0. Sortir");
	}

}
