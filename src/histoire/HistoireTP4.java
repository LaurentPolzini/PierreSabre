/**
 * 
 */
package histoire;
import personnages.Humain;

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
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire("kombucha");
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	}

}
