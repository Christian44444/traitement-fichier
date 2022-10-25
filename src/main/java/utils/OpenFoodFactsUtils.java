package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class OpenFoodFactsUtils {

	public static OpenFoodFacts lire(String cheminFichier){
		OpenFoodFacts openFoodFacts = new OpenFoodFacts();
		
		List<String> lignes = null;
		try {
			File file = new File(cheminFichier);
			lignes = FileUtils.readLines(file, "UTF-8");
			
			// On supprime la ligne d'entéte avec les noms des colonnes
			lignes.remove(0);
			
			
			return openFoodFacts;
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}
}
