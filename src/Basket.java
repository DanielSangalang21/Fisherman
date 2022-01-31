import java.util.ArrayList;
import java.util.List;

public class Basket {
	private List<Seafood> seafoods;
	
	public Basket() {
		seafoods = new ArrayList<Seafood>(10);
	}
	

	public List<Seafood> getSeafoods() {
		return seafoods;
	}

	public void setSeafoods(List<Seafood> seafoods) {
		this.seafoods = seafoods;
	}
	
	public void put(Seafood seafood) {
		if(seafoods.size()<10) {
		for(int i = 0; i <= seafoods.size();i++) {
				try{seafoods.get(i);}
				catch(Exception ex) {
					seafoods.add(i, seafood);
					return;
				}
			}
		 }else {
			 System.out.println("Basket full fish was thrown!");
		 }
	}
	
	public Seafood get(){
		Seafood s = new Seafood();
		if(seafoods.size()>0) {
			for(int i = 0; i < 10;i++) {
				if(seafoods.get(i) != null) {
					s =  seafoods.get(i); 
					seafoods.remove(i);
					return s;
				}
			}
		}else {
			System.out.println("Empty basket!!");
		}
		return s;
	}
}
