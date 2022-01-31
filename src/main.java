import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Fisherman f = new Fisherman();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What will the fisherman do? \n"
					+ "1. Catch Seafood \n"
					+ "2. Show Catch \n"
					+ "3. Eat Fish");
			
			int choice = sc.nextInt();
			
			if (choice == 1) {
				f.catchSeafood();
			}else if(choice == 2) {
				f.showBaskets();
			}else if(choice == 3) {
				f.eatFish();
			}
		}

	}

}
