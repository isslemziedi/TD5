package td5;

 public abstract class Article {
	protected long ref;
	protected String lib;
	protected double prixHT;
	protected int qteStock=0;
	protected final double TVA=0.1;
	
	Article(long ref, String lib, float p, int q) 
	{
		this.ref=ref;
		this.lib=lib;
		this.prixHT=p;
		this.qteStock=q;
				
	}
	
	void approvisionner(int nb)
	{
		if(nb>0) {
			this.qteStock+=nb;
		}
	}
	
	
	@Override public String toString() {
		return "Article [ref=" + ref + ", lib=" + lib + "]";
	}
	void decrire()
	{
		System.out.println(toString());
	}
	
	public abstract double calculPrixTTC() ;
	
	public boolean appartientPromo(Article article) {
	    if (article instanceof ProduitElec || article instanceof Vetement) {
	        return true;
	    }
	    else {
	    	return false;
	    }   
	}

	boolean estDispo(int qteAchat)
	{
		if(qteAchat >=0 && qteAchat<= qteStock) {
			return true;
		}
		else {
			return false;
		}
	}

}
