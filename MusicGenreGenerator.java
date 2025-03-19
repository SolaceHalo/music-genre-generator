import java.util.Random;

public class MusicGenreGenerator {
	public static void main(String[] args) {
		Random rand = new Random();
		int genreInt = rand.nextInt(12); //rng for genre
		int prefixInt = rand.nextInt(10); //rng for prefix
		int suffixInt = rand.nextInt(10); //rng for suffix
		
		String genrePick = "";
		String prefixPick = "";
		String suffixPick = "";
    
    //determines what appears for genre
		switch(genreInt) {
		case 1:
			genrePick = "punk";
			break;
		case 2:
			genrePick = "rap";
			break;
		case 3:
			genrePick = "metal";
			break;
		case 4:
			genrePick = "house";
			break;
		case 5:
			genrePick = "pop";
			break;
		case 6:
			genrePick = "R&B";
			break;
		case 7:
			genrePick = "techno";
			break;
		case 8:
			genrePick = "country";
			break;
		case 9:
			genrePick = "folk";
			break;
		case 10:
			genrePick = "jazz";
			break;
		default:
			genrePick = "rock"; //2/12 chance
		}
    
    //determines what appears for prefix
		switch(prefixInt) {
		case 1:
			prefixPick = "post-";
			break;
		case 2:
			prefixPick = "acid ";
			break;
		case 3:
			prefixPick = "melodic ";
			break;
		case 4:
			prefixPick = "soft ";
			break;
		case 5:
			prefixPick = "hard ";
			break;
		case 6:
			prefixPick = "progressive ";
			break;
		case 7:
			prefixPick = "alternative ";
			break;
		case 8:
			prefixPick = "gothic ";
			break;
		case 9:
			prefixPick = "psychedelic ";
			break;
		default:
			prefixPick = ""; //1/10 chance
		}
    
    //determines what appears for suffix
		switch(suffixInt) {
		case 1:
			suffixPick = " revival";
			break;
		case 2:
			suffixPick = " wave";
			break;
		case 3:
			suffixPick = "core";
			break;
		case 4:
			suffixPick = "step";
			break;
		default:
			suffixPick = ""; //6/10 chance
		}
		
		System.out.println(prefixPick + genrePick + suffixPick); //prints out result
		
	}
}
