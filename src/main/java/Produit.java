import java.util.ArrayList;

public class Produit {
	
	
	public Categorie categorie;
	public Marque marque;
	public String scoreNutritionnel;
	private ArrayList<Ingredient> ingredient;
	private ArrayList<Allergene> allergènes;
	
	
	public Produit(Categorie categorie, Marque marque, String scoreNutritionnel, ArrayList<Ingredient> ingredient,
			ArrayList<Allergene> allergènes) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.scoreNutritionnel = scoreNutritionnel;
		this.ingredient = ingredient;
		this.allergènes = allergènes;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Marque getMarque() {
		return marque;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}


	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}


	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}


	public ArrayList<Ingredient> getIngredient() {
		return ingredient;
	}


	public void setIngredient(ArrayList<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}


	public ArrayList<Allergene> getAllergènes() {
		return allergènes;
	}


	public void setAllergènes(ArrayList<Allergene> allergènes) {
		this.allergènes = allergènes;
	}
	
}

	