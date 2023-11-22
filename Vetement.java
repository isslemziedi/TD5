package td5;
public class Vetement extends Article implements Promotion  {
	private static final double TVA = 0.30;
	private int qteAchete;
	private String couleur;
	private String taille;
	
	Vetement(long ref, String lib, float p, int q,int qteAchete,String couleur,String taille){
		super(ref,lib,p,q);
		this.qteAchete=qteAchete;
		this.couleur=couleur;
		this.taille=taille;
	}
	
	@Override public String toString() {
        return super.toString() + " | "+this.getClass().getSimpleName()+" [couleur=" + couleur + ", taille=" + taille + "]";
    }
	
	@Override void decrire() {
        System.out.println(toString());
    }
	
	@Override public double prixDeVente(String dateStr) {
        double prix = 0;
        if (estPeriodePromo(dateStr)) {
            prix = (this.prixHT) - (this.prixHT + TVA);
        } else {
            prix = this.prixHT;
        }

        return prix*qteAchete;
    }
	
	@Override public double calculPrixTTC() {
        return this.prixHT * (1 + TVA);
	}

	public int getQteAchete() {
		return qteAchete;
	}

	public void setQteAchete(int qteAchete) {
		this.qteAchete = qteAchete;
	}
	
	
}
    