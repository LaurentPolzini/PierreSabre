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
	private int reputation = 0;
	
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

}
