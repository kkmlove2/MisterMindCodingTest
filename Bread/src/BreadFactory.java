public class BreadFactory {
	public Bread getBread(String breadType) {
		if(breadType == null) {
			return null;
		}
		switch(breadType) {
		case "cream":
			return new Cream();
		case "sugar":
			return new Sugar();
		case "butter":
			return new Butter();
		}
		return null;
	}
}
