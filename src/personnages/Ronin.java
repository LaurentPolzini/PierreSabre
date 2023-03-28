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
	
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Pauvre vermine, vient te battre si tu penses être à la hauteur.");
		int force = this.honneur * 2;
		if (force >= adversaire.getReputation()) {
			this.gagner(adversaire);
		} else {
			this.perdre(adversaire);
		}
	}
	
	public void gagner(Yakuza adversaire) {
		int gain = adversaire.perdre();
		this.gagnerArgent(gain);
		this.honneur++;
		this.parler("Ta faiblesse t'as fait défaut, " + adversaire.getNom() + ". Reste noble et n'attaque pas " +
		"les pauvres commerçants.");
	}
	
	public int perdre(Yakuza adversaire) {
		this.honneur--;
		int perte = this.getQuantiteArgent();
		this.perdreArgent(perte);
		
		this.parler("Ai-je réellement perdu ce duel ? Je suis trop faible, voici tout mon argent: " + 
		perte + " sous.");
		adversaire.gagner(perte);
		
		return perte;
	}
}
