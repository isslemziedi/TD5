package td5;

public class ProduitGC extends Article {
	private int qteAchete;
	  
    public ProduitGC(long ref, String lib, float p, int q,int qteAchete) {
        super(ref,lib,p,q);
        this.qteAchete= qteAchete;
    }

    
    
    @Override public double calculPrixTTC() {
        double prixTTC = 0;
        prixTTC = this.prixHT * (1 + TVA);
        return prixTTC;
    }
    
    public int getQteAchete() {
		return qteAchete;
	}



	public void setQteAchete(int qteAchete) {
		this.qteAchete = qteAchete;
	}



	@Override public String toString() {
        return super.toString()+" | "+this.getClass().getSimpleName() +" [ qteAchete : "+qteAchete+"]";
    }

    
    @Override void decrire() {
        System.out.println(toString());
    }

}