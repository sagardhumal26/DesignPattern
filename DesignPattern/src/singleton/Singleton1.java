package singleton;
/*Lazy initialization : In this method, class in initialized only when it is required. 
 * It can save you from instantiating the class when you don’t need it. 
 * Generally lazy initialization is used when we create a singleton class.
 */
public class Singleton1 {

	private static Singleton1 obj;
	
	private static Singleton1 getInstance(){
		if(obj==null){
			obj=new Singleton1();
			System.out.println("Object is created..");
		}
		else{
			System.out.println("Object is already present..");
		}
		return obj;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance();
		getInstance();
		getInstance();
		getInstance();
	}

}
