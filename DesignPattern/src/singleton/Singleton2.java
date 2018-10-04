package singleton;
/*Early initialization : In this method, class is initialized whether it is to be used or not. 
 * Main advantage of this method is its simplicity. You initiate the class at the time of class loading. 
 * Its drawback is that class is always initialized whether it is being used or not.
 */
public class Singleton2 {

	private static Singleton2 obj=new Singleton2();
	
	private Singleton2(){
		System.out.println("Inside private constructor.....");
	}
	
	private static Singleton2 getInstance(){
		if(obj==null){
			System.out.println("Object created......");
		}
		else{
			System.out.println("Object already present......");
		}
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance();
		getInstance();
		getInstance();
	}

}
