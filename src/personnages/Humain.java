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
	String nom;
	String boissonFav;
	int quantiteArgent;
	
	
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
		System.out.println("Bonjour ! Je m'appelle " + this.nom + 
				" et j'aime boire du " + this.boissonFav);
	}

	public void boire(String boisson) {
		System.out.println("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	
	public void acheter(String bien, int prix) {
		if (this.quantiteArgent >= prix) {
			System.out.println("J'ai " + this.getQuantiteArgent() + " sous en poche. Je vais pouvoir m'offrir" +
		" un " + bien + " à " + prix + " sous !");
			this.perdreArgent(prix);
		} else {
			System.out.println("Je n'ai plus que " + this.getQuantiteArgent() + " sous en poche." +
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
		// TODO
	}
}
