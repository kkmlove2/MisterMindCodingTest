import java.util.Map;

public class FactoryMethod {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
		BreadFactory breadFactory = new BreadFactory();
		//breadType: cream, sugar, butter
		System.out.println("bread type : cream");
		String breadType = "cream";
		Bread bread = breadFactory.getBread(breadType);
		//팩토리 메소드로부터 recipe 받아옴
		Map<String, Integer> recipe = bread.getRecipe();

		System.out.println("recipe");
		for (String key : recipe.keySet()) {
			int value = recipe.get(key);
			System.out.println(key + ": " + value);
		}
		
		System.out.println("bread type : sugar");
		String breadType2 = "sugar";
		Bread bread2 = breadFactory.getBread(breadType2);
		//팩토리 메소드로부터 recipe 받아옴
		Map<String, Integer> recipe2 = bread2.getRecipe();

		System.out.println("recipe");
		for (String key : recipe2.keySet()) {
			int value = recipe2.get(key);
			System.out.println(key + ": " + value);
		}
		
		System.out.println("bread type : butter");
		String breadType3 = "butter";
		Bread bread3 = breadFactory.getBread(breadType3);
		//팩토리 메소드로부터 recipe 받아옴
		Map<String, Integer> recipe3 = bread3.getRecipe();

		System.out.println("recipe");
		for (String key : recipe3.keySet()) {
			int value = recipe3.get(key);
			System.out.println(key + ": " + value);
		}
	   }
	
}
