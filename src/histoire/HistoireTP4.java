/**
 * 
 */
package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

/**
 * Class HistoireTP4
 * 
 * @author laurentpolzin
 * @date 28 mars 2023
 *
 */
public class HistoireTP4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire("kombucha");
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		*/
		Commercant marco = new Commercant("Marco", 20);
		//marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire("thé");
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roronoa Zoro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
	}

}
