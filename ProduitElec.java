package td5;
import java.time.format.DateTimeFormatter;
public class ProduitElec extends Article implements Promotion {
	private static final double TVA = 0.20;
	private String categorie;
	private int qteAchete;
	 
	 public ProduitElec(long ref, String lib, float p, int q, String categorie, int qteAchete) {
	        super(ref, lib, p, q);
	        this.categorie = categorie;
	        this.qteAchete = qteAchete;
	 }
	 
	 public int getQteAchete() {
		return qteAchete;
	}

	public void setQteAchete(int qteAchete) {
		this.qteAchete = qteAchete;
	}

	@Override public double calculPrixTTC() {
	        return this.prixHT * (1.08 + TVA);
	  }
	 
	 @Override public String toString() {
	        return super.toString() +" | "+this.getClass().getSimpleName()+" [categorie=" + categorie + "]";
	  }
	 
	 @Override void decrire() {
	        System.out.println(toString());
	 }
	 
	 @Override public double prixDeVente(String dateStr) {
	        double prix = 0;
	        if (estPeriodePromo(dateStr)) {
	            prix = this.prixHT - (this.prixHT * TVA);
	        } else {
	            prix = this.prixHT;
	        }
	        return prix * qteAchete;
	    }

}