import java.util.Random;

public class ClassRandomizerUtil {

	public static Seafood generateSeafood() {
		Seafood s = new Seafood();
		Random rand = new Random();
		
		int seafoodType = rand.nextInt(2);
		int size = (int) (Math.random() * (500 - 1 + 1) + 1);
		
		if(seafoodType == 1) {
			//if (size >= 51 && size <= 200) {
				s = new Tilapia(size,"Tilapia");
			//}
		}else {
			//if (size >= 51 && size <= 200) {
				s = new Crab(size,"Crab");
			//}
		}
		return s;
	}
}
