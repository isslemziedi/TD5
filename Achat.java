package td5;

public class Achat {

	public static void main(String[] args) {
		Article[] supermarche = new Article[4];
		
           supermarche[0] = new  Vetement(123, "Jupe bleue taille S", 39.000f, 2,0, "bleue","S");
		   supermarche[1] = new ProduitElec(145, "TV Led 80cm", 1450.000f, 0, "TV",1);
		   supermarche[2] = new  Vetement(178, "Pantalon noir taille M", 42.000f, 5,1, "noir","M");
		   supermarche[3] = new ProduitGC (191,"Pates",0.410f,18,3);
		   double montantTotal = 0;
		   for (int i = 0; i < supermarche.length; i++) {
			    int qteAchat;
			    switch (i) {
			        case 0:
			            qteAchat = 0;
			            break;
			        case 1:
			            qteAchat = 1;
			            break;
			        case 2:
			            qteAchat = 1;
			            break;
			        case 3:
			            qteAchat = 3;
			            break;
			        default:
			            qteAchat = 0; 
			    }
			    if (supermarche[i].estDispo(qteAchat)) {
			        System.out.println("Article disponible: " + supermarche[i]);
			        
			        // Calculate and display the total price, considering any discount
			        double prixTTC = supermarche[i].calculPrixTTC();
			        if (supermarche[i] instanceof Promotion) {
			            String dateAchat = "21/03/2023";
			            prixTTC = ((Promotion) supermarche[i]).prixDeVente(dateAchat);
			        }
			        
			        montantTotal += prixTTC;
			        System.out.println("Prix TTC a payer : " + prixTTC+"\n");
			    } else {
			        System.out.println("Article indisponible: " + supermarche[i]);
			    }
			}
			System.out.printf("Montant total a payer : %.3f%n", montantTotal);
	        }
	}

