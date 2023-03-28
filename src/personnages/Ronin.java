/**
 * 
 */
package personnages;

/**
 * Class Ronin
 * 
 * @author laurentpolzin
 * @date 28 mars 2023
 *
 */
public class Ronin extends Humain{
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (this.getQuantiteArgent() * 10) / 100;
		this.parler(beneficiaire.getNom() + ", prend ces " + don + " sous.");
		beneficiaire.recevoirArgent(don);
	}
}
