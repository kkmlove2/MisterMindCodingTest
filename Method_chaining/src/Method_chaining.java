public class Method_chaining {
	  private int a=0;
	   private int b=0;
	   
	   
	   public Method_chaining add(int num_add) {
	      a+=num_add;
	      return this;
	   }
	   
	   public Method_chaining subtract(int num) {
	      a-=num;
	      return this;
	   }
	   

	   public int out() {
	      b=a;
	      a=0;
	      return b;
	   }

}
