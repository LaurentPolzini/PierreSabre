/**
 * 
 */
package personnages;

/**
 * Class Commercant
 * 
 * @author laurentpolzin
 * @date 28 mars 2023
 *
 */
public class Commercant extends Humain {
	
	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}
	
	public int seFaireExtorquer() {
		int quantitePrecedente = this.getQuantiteArgent();
		this.quantiteArgent = 0;
		this.parler("J'AI TOUT PERDU !!" + 
				" Ô monde injuste, pourquoi cela me tombe-t-il dessus à moi ? Un homme si juste... " +
				"quel monde ingrat...");
		
		return quantitePrecedente;
	}
	
	public void recevoirArgent(int argent) {
		this.quantiteArgent += argent;
		this.parler(argent + " sous ! Vous êtes si généreux mon bon blaze !");
	}
	
}
