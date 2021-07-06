import java.util.HashMap;
import java.util.Map;

public class Butter implements Bread {
	@Override
	public Map<String, Integer> getRecipe() {
		Map<String, Integer> recipe = new HashMap<String, Integer>();
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("butter", 50);
		return recipe;
	}
}