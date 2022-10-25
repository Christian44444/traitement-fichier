
public class Produit {
	
	public String scoreNutritionnel;
	public Categorie categorie;
	public Marque marque;
	public String energie;
	public String sel;
	


	public Produit(String scoreNutritionnel, String energie, String sel, Categorie categorie, Marque marque) {
		super();
		this.scoreNutritionnel = scoreNutritionnel;
		this.energie = energie;
		this.sel = sel;
		this.categorie = categorie;
		this.marque = marque;
	}


	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}

	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}

	public String getEnergie() {
		return energie;
	}

	public void setEnergie(String energie) {
		this.energie = energie;
	}

	public String getSel() {
		return sel;
	}

	public void setSel(String sel) {
		this.sel = sel;
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
	
}
