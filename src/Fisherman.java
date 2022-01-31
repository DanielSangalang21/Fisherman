import java.util.Random;


public class Fisherman{
	private Basket fishBasket;
	private Basket crustaceanBasket;
	
	public Fisherman() {
		this.fishBasket = new Basket();
		this.crustaceanBasket = new Basket();
	}
	public Basket getFishBasket() {
		return fishBasket;
	}
	public void setFishBasket(Basket fishBasket) {
		this.fishBasket = fishBasket;
	}
	public Basket getCrustaceanBasket() {
		return crustaceanBasket;
	}
	public void setCrustaceanBasket(Basket crustaceanBasket) {
		this.crustaceanBasket = crustaceanBasket;
	}
	
	public void catchSeafood() {
		Seafood newSeaFood = ClassRandomizerUtil.generateSeafood();
		System.out.println("Fisherman caught "+newSeaFood.getName()+"-- wheighing: "+newSeaFood.getSize() +"\n");
		if (newSeaFood instanceof Crustacean) {
			crustaceanBasket.put(newSeaFood);
		}else {
			fishBasket.put(newSeaFood);
		}
	}
	
	public void showBaskets() {
		
	
		int count = 1;
		System.out.println("==Fishes==");
		for(Seafood s: fishBasket.getSeafoods()) {
			System.out.println(count+": "+s.getName()+" -- wheighing: "+s.getSize());
			count++;
		}
		
		count = 1;
		System.out.println("==Crustaceans==");
		for(Seafood s: crustaceanBasket.getSeafoods()) {
			System.out.println(count+": "+s.getName()+" -- wheighing: "+s.getSize());
			count++;
		}
		System.out.println("\n");
	}
	
	public void cook(int cookType) {
		if (cookType==1) {
			
		}
		
	}
	
	Seafood s;
	CookSeafood cookImplem = (type) -> {
		if(!(null == (s.getName()))) {
			if(type==0) {
				System.out.println("Steamed "+s.getName() +" -- wheighing: "+s.getSize());
			}else if (type == 1) {
				System.out.println("Fried "+s.getName()+" -- wheighing: "+s.getSize());
			}
		}
	};
	
	public void eatFish() {
		Random rand = new Random();
		int cookType = rand.nextInt(2);
		s = fishBasket.get();
		cookImplem.cook(cookType);
	}
}
