package entites;

import java.util.ArrayList;
import java.util.List;

public class OpenFoodFacts {
	
	private List<Produit> produits  = new ArrayList<>();

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
