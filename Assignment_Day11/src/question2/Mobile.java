package question2;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};

	public void searchOutdatedModel(String brand, String... model) {
		if(model.length>0) {
			for(String xString : model) {
				Boolean flag = true;
				for(String modelName : outdatedModels) {
					if(xString.equals(modelName)){
						System.out.println(xString+"_OUTDATED");
						flag = false;
					}
					
				}
				if(flag) {
					System.out.println(brand+"_"+xString+"_New");
				}
			}
		}
		else {
			System.out.println(brand+": model no is missing");
		}
		
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.searchOutdatedModel("Samsung");
		mobile.searchOutdatedModel("Samsung","note7");
		mobile.searchOutdatedModel("Samsung","note7","note4","note5","note10");
	}
}
