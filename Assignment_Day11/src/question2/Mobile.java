package question2;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String model) {
		Boolean flag = true;
		for(String xString : outdatedModels) {
			if(xString == model) {
				System.out.println(xString+"_OUTDATED");
				flag = false;
			}
		}
		if(flag) {
			System.out.println(model);
		}
	}
	public void searchOutdatedModel(String brand, String model) {
		Boolean flag = true;
		for(String xString : outdatedModels) {
			if(xString == model) {
				System.out.println(brand+"_"+xString+"_OUTDATED");
				flag = false;
			}
		}
		if(flag) {
			System.out.println(brand+"_"+model);
		}
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.searchOutdatedModel("note7");
		mobile.searchOutdatedModel("Samsung","note7");
		mobile.searchOutdatedModel("Samsung","note8");
	}
}
