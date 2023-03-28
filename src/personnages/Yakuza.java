/**
 * 
 */
package personnages;

/**
 * Class Yakuza
 * 
 * @author laurentpolzin
 * @date 28 mars 2023
 *
 */
public class Yakuza extends Humain{
	
	private String clan;
	private int reputation = 4;
	
	
	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Ne serait-ce pas un commercant sans défense que je vois ici ?");
		this.parler(victime.getNom() + " si tu tiens à ta vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		this.reputation++;
		this.parler("J'ai piqué les " + gain + " pauvres sous de " + victime.getNom() +
				" hihihi !! J'ai maintenant " + this.getQuantiteArgent() + " sous dans ma popoche ! MOUAHAHAHA");
	}
	
	public int perdre() {
		this.reputation--;
		int perte = this.getQuantiteArgent();
		this.perdreArgent(perte);
		this.parler("Je- j'ai perdu... je suis déshonoré... voici tout mon argent, " + perte + " sous.");
		
		return perte;
	}
	
	public void gagner(int gain) {
		this.reputation++;
		this.gagnerArgent(gain);
		this.parler("MOUAHAHAHAH JE SUIS REELLEMENT LE PLUS FORT ! En plus de ça, t'es dépouillé ahahah" +
		", merci pour ces délicieux " + gain + " sous !");
	}

}
