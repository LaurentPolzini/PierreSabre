/**
 * 
 */
package personnages;

/**
 * Class Humains
 * 
 * @author laurentpolzin
 * @date 28 mars 2023
 *
 */
public class Humain {
	private String nom;
	private String boissonFav;
	protected int quantiteArgent;
	
	
	public Humain(String nom, String boissonFav, int quantiteArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.quantiteArgent = quantiteArgent;
	}


	public String getNom() {
		return nom;
	}


	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + 
				" et j'aime boire du " + this.boissonFav);
	}

	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	
	public void acheter(String bien, int prix) {
		if (this.quantiteArgent >= prix) {
			parler("J'ai " + this.getQuantiteArgent() + " sous en poche. Je vais pouvoir m'offrir" +
					" un " + bien + " à " + prix + " sous !");
			this.perdreArgent(prix);
			
		} else {
			parler("Je n'ai plus que " + this.getQuantiteArgent() + " sous en poche." +
					" Je ne peux même pas m'offrir un " + bien + " à seulement " + prix + " sous...");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.quantiteArgent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.quantiteArgent -= perte;
	}
	
	protected void parler(String texte) {
		System.out.println(texte);
	}
}
