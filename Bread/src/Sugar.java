import java.util.HashMap;
import java.util.Map;

public class Sugar implements Bread {
	@Override
	public Map<String, Integer> getRecipe() {
		Map<String, Integer> recipe = new HashMap<String, Integer>();
		recipe.put("flour", 100);
		recipe.put("water", 50);
		recipe.put("sugar", 200);
		return recipe;
	}
}